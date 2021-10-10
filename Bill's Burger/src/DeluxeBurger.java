public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Hamburger", "sausage", "White Roll", 14.54);
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drinks", 1.81);


    }
    @Override
    public void addHamburgerAddition1(String aname, double aprice) {
        System.out.println("Cannot add "+aname +" additional items to Deluxe hamburger");
    }
    @Override
    public void addHamburgerAddition2(String aname, double aprice) {
        System.out.println("Cannot add "+aname +" additional items to Deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition3(String aname, double aprice) {
        System.out.println("Cannot add "+aname +" additional items to Deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition4(String aname,double aPrice) {
        System.out.println("Cannot add "+aname+ "items to Deluxe hamburger");
    }

}
