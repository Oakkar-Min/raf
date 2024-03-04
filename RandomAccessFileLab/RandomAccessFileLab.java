
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RandomAccessFileLab {

       public static void main(String[] args) {
        Equipment device1= new Equipment(111, "Laptop", 10,"Lenovo Thinkpad",200,"Intel Core i5");
        ListOfEquipment dataFile1= new ListOfEquipment("device.dat");
       //  dataFile1.addEquipment2File(device1);
        dataFile1.readId();
        dataFile1.printAllDeviceName();
        dataFile1.readDevice(111);
       }
    
}