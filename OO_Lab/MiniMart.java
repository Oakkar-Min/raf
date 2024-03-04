package OO_Lab;

public class MiniMart {
    String name;
    Shop [] shops;
    String colors;
    String openHour;
    String closeHour;
    int numberOfShops;

    public MiniMart(String n, String oh,String ch){
        name=n;openHour=oh;closeHour=ch;
        shops= new Shop[10];
         numberOfShops = 0;

    }
    public void addShop(Shop s){
        shops[numberOfShops]=s;
        numberOfShops++;
    
    }
    public void printAllShops(){
        for (int i=0;i<numberOfShops;i++){
            System.out.println(shops[i].location+", ");
        }
    }
    public boolean removeShopByLocation(String location){
        for (int i=0;i<numberOfShops;i++){
            if(shops[i].location.equalsIgnoreCase(location)){
                shops[i]=null; 
                return true;
            }
            
        }
        return false; //not found
    }
    public int countShop(){
        int count=0;
        for (int i=0;i<numberOfShops;i++){
            if (shops[i]!=null){
                count++;
            }
        }
        return count;
    }






}
