public class Equipment {
    private int id; 
    private String name;
    private int amount;
    private String model;
    private double price;
    private String otherInfo;

    public Equipment(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Equipment(int id, String name, int amount, String model, double price, String otherInfo) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.model = model;
        this.price = price;
        this.otherInfo = otherInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int change) {
        this.amount = this.amount+change;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
    
}