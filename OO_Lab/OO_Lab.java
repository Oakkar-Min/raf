package OO_Lab;

public class OO_Lab {
    public static void main(String[] args) {
        Shop s1= new Shop("Prachuthit Bkk Thailand", 20, 30, 10);
        Shop s2= new Shop("null", 30, 30, 15, (byte)2);

        System.out.println(s1.location);
        s2.setLocation("Ayuthaya Thailand");
        System.out.println(s2.location);
        Shop s3= new Shop("London England", 20, 30, 20);
        System.out.println(s3.location);
        s3.setLocation("Phuket Thailand");
        System.out.println(s3.location+" for "+s3.getArea()+" square-meter with "+s3.showNumberOfShelves()+" shelves.");
        MiniMart m1= new MiniMart("7-11", "00:00", "23:59");
        m1.addShop(s1);
        System.out.println(m1.name+" opens at "+m1.openHour);
        //System.out.println(m1.shops[0].location);
        m1.addShop(s2);
        //System.out.println(m1.shops[1].location);
        m1.addShop(s3);
        //System.out.println(m1.shops[2].location);
        m1.printAllShops();
        m1.removeShopByLocation("Ayuthaya Thailand");
        System.out.println(m1.countShop());





    }
}
