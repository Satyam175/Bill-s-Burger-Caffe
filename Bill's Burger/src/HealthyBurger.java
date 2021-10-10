public class HealthyBurger extends Hamburger {

    String healthyExtra1name ;
    String healthyExtra2name ;
    double healthyExtra1price ;
    double healthyExtra2price ;

    public HealthyBurger(String meat,double price) {
        super("Healthy Burger", meat, "Brown rye roll", price);

    }

    public void addHealthyaddition1(String aname, double aprice) {
        this.healthyExtra1name = aname;
        this.healthyExtra1price = aprice;
    }
    public void addHealthyaddition2(String aname, double aprice) {
        this.healthyExtra2name = aname;
        this.healthyExtra2price = aprice;
    }






    @Override
    public double itemezhamburger() {

        if (this.healthyExtra1price != 0){
            System.out.println("addded "+this.healthyExtra1name + " for price " + this.healthyExtra1price );
        }
        if (this.healthyExtra2price != 0){
            System.out.println("addded "+this.healthyExtra2name + " for price " + this.healthyExtra2price );
        }

        return this.healthyExtra1price+this.healthyExtra2price+super.itemezhamburger();
    }
}
