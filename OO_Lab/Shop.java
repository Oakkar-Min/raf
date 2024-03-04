package OO_Lab;

public class Shop {
    String location;
    double width, length, height;
    byte floors;
    boolean delivery;
    String products[];
    String payment[];

    public Shop(String loc, double w,double l,double h){
        setLocation(loc); 
        if(w>0 && l>0 && h>0){
            width=w; length=l;height=h;
        }
        
        
        
    }
    public Shop(String loc,double w, double l, double h,byte fl){
        this(loc,w,l,h);
        floors=fl;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String shopLocation){
        if (shopLocation.contains("Thailand"))
        location=shopLocation;
        else{
            System.out.println("Shop is not in Thailand");
        }
    }
    public double getArea(){
        return width*length ;
    }
    public double getVolume(){
        return width*length*height;
    }
    public int showNumberOfShelves(){
        //cashier require 15sqr-meter and 10 sqr-meter per shelf
        int shelves= (int)(getArea()-15)/10;
        return shelves;
    }





}
