package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Beef", 3.56, "white");
        hamburger.addHamburgerAddition1("Tomato", .27);
        hamburger.addHamburgerAddition2("lettuce", .5);
        hamburger.addHamburgerAddition3("cheese", 1.00);
        System.out.println("The total burger price is: " + hamburger.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger( "Beef", 5.00);
        healthyBurger.addHealthyAddition1("Tomato", .27);
        healthyBurger.addHealthyAddition2("Lettuce", .5);
        System.out.println("The total for the healthy burger price is: " + healthyBurger.itemizehamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizehamburger();
        db.addHamburgerAddition1("egg", 2.00);

    }

}
