public class Main {
    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("basic","sausage" , "white" ,6);
//        hamburger.addHamburgerAddition1("Tomato",1);
//        hamburger.addHamburgerAddition2("cheez",2.5);
//        hamburger.addHamburgerAddition3("sparkles",1);
//        System.out.println("total price of burger is : " + hamburger.itemezhamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon",4);
//        healthyBurger.addHamburgerAddition1("lettuce",1);
//        healthyBurger.addHealthyaddition1("Egg",2);
//        System.out.println("total price of healthy hamburger is : " + healthyBurger.itemezhamburger());
//
//        System.out.println("\n");
//
//        DeluxeBurger deluxeBurger = new DeluxeBurger();
//        deluxeBurger.addHamburgerAddition3("sprinkles",2);
//        System.out.println("Total price of Deluxe Burger is : "+deluxeBurger.itemezhamburger());
        Hamburger hamburger = new Hamburger("Basic", "Sausage", "White", 3.56);
        double price = hamburger.itemezhamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemezhamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyaddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemezhamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Should not do this", 50.53);
        db.itemezhamburger();
    }
}
