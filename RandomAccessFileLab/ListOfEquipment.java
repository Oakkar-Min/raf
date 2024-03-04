import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListOfEquipment {
     RandomAccessFile fptr;
     String fileName;

        public ListOfEquipment(String fileName){
            this.fileName=fileName;
           
            }

     

        public void addEquipment2File(Equipment device){
            try {
                fptr=new RandomAccessFile(fileName,"rw");
                fptr.seek(fptr.length());
                fptr.writeInt(device.getId());
                byte[] deviceName =new byte[20];
                deviceName= device.getName().concat("                    ").getBytes();
                fptr.write(deviceName, 0, 20);
                fptr.writeInt(device.getAmount());

                byte []deviceModel = new byte[20];
                deviceModel= device.getModel().concat("                    ").getBytes();
                fptr.write(deviceModel, 0, 20);

                fptr.writeDouble(device.getPrice());
                byte[]deviceInfo= new byte[100];
                deviceInfo= device.getOtherInfo().concat(" ".repeat(100)).getBytes();
                fptr.write(deviceInfo, 0, 100);




            }catch    (FileNotFoundException ex){
                Logger.getLogger(ListOfEquipment.class.getName()).log(Level.SEVERE,null,ex);
            
            } catch (IOException ex) {
                Logger.getLogger(ListOfEquipment.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        public void readId(){
            
            try {
                fptr=new RandomAccessFile(fileName, "r");
                int x=0;
                for(int i=0;fptr.getFilePointer()<fptr.length();i++){
                    x= fptr.readInt();
                    System.out.print(x+" ");
                    fptr.seek((i+1)*156);
                }
                 fptr.close();
            } catch    (FileNotFoundException ex){
                Logger.getLogger(ListOfEquipment.class.getName()).log(Level.SEVERE,null,ex);
            } catch (IOException ex) {
                Logger.getLogger(ListOfEquipment.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        public void printAllDeviceName() {
           try {
             fptr=new RandomAccessFile(fileName, "r");
             fptr.seek(4);
             String deviceName= "";
             for(int i=0;fptr.getFilePointer()<fptr.length();i++){
                byte[] dName= new byte[20];
                fptr.read(dName,0,20);
                System.out.print(new String(dName).trim()+", ");
                fptr.seek(((i+1)*156)+4);
             }
           } catch (FileNotFoundException ex) {
            // TODO: handle exception
            Logger.getLogger(ListOfEquipment.class.getName()).log(Level.SEVERE,null,ex);
           }
           catch (IOException ex) {
            Logger.getLogger(ListOfEquipment.class.getName()).log(Level.SEVERE,null,ex);
        }
        }

        public void readDevice(int deviceID){
            try {
                fptr=new RandomAccessFile(fileName, "r");
                int id=0,amount; String name,info; double price;
                for(int i=0;fptr.getFilePointer()<fptr.length();i++){
                    id=fptr.readInt();
                    if(id==deviceID){
                        byte[] temp=new byte[100];
                        fptr.read(temp, 0, 20);
                        name= new String(temp).trim();
                        fptr.readInt();
                        amount= fptr.readInt();
                        fptr.read(temp, 0, 20);
                        String model = new String(temp).trim();
                        price= fptr.readDouble();
                        fptr.read(temp, 0, 100);
                        info=new String(temp).trim();
                        System.out.println(id+" "+name+" "+amount+" "+price+" "+info);
                    }
                    fptr.seek((i+1)*156);
                }
            } catch (FileNotFoundException ex) {
                // TODO: handle exception
                Logger.getLogger(ListOfEquipment.class.getName()).log(Level.SEVERE,null,ex);
               }
               catch (IOException ex) {
                Logger.getLogger(ListOfEquipment.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

}
