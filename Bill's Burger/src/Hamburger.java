public class Hamburger {
    private String Name;
    private String Meat;
    private  String BreadRoll;
    private double Price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price=0;
    private double addition2Price=0;
    private double addition3Price=0;
    private double addition4Price=0;



    public Hamburger(String name, String meat, String breadRoll, double price) {
        Name = name;
        Meat = meat;
        BreadRoll = breadRoll;
        Price = price;
    }

    public void addHamburgerAddition1(String aname , double aprice) {
        this.addition1Name = aname;
        this.addition1Price = aprice;
    }
    public void addHamburgerAddition2(String aname , double aprice) {
        this.addition2Name = aname;
        this.addition2Price = aprice;
    }
    public void addHamburgerAddition3(String aname , double aprice) {
        this.addition3Name = aname;
        this.addition3Price = aprice;
    }
    public void addHamburgerAddition4(String aname , double aprice) {
        this.addition4Name = aname;
        this.addition4Price = aprice;
    }

    public double itemezhamburger() {
        System.out.println(this.getName()+ " on a "+ this.getBreadRoll()+ " with " + this.getMeat() +",Price"+ this.getPrice());
        if (this.addition1Price != 0) {
            System.out.println("added "+this.addition1Name+" for Price "+this.addition1Price);
        }
        if (this.addition2Price != 0) {
            System.out.println("added "+this.addition2Name+" for Price "+this.addition2Price);
        }
        if (this.addition3Price != 0) {
            System.out.println("added "+this.addition3Name+" for Price "+this.addition3Price);
        }
        if (this.addition4Price != 0) {
            System.out.println("added "+this.addition4Name+" for Price "+this.addition4Price);
        }

        double totalPrice = this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price+this.Price;

        return totalPrice;


    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public String getMeat() {
        return Meat;
    }

    public String getBreadRoll() {
        return BreadRoll;
    }
}
