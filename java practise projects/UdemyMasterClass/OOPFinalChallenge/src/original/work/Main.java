package original.work;

public class Main {

    public static void main(String[] args) {



        // normal burger class //
        basicBurger();
        // normal burger class //

        // healthy burger class //
        healthyBurger();
        // healthy burger class //

        // deluxe burger class //
        deluxeBurger();
        // deluxe burger class //

    }

    public static void basicBurger(){
        // normal burger class //
        Burger basicBurger = new Burger("multi-grain","chicken");
        System.out.println(basicBurger.getBurgerName());
        System.out.println("basic burger price is : " + basicBurger.getBurgerPrice());
        System.out.println();

        basicBurger.getTrackAdditions().getCucumberPrice();
        basicBurger.addFoodItem("cucumber",2);
        System.out.println("total price of bill is " + basicBurger.getTotalBill());
        System.out.println();

        basicBurger.getTrackAdditions().getLettucePrice();
        basicBurger.addFoodItem("lettuce",1);
        System.out.println("total price of bill is " + basicBurger.getTotalBill());
        System.out.println();

        basicBurger.getTrackAdditions().getOlivesPrice();
        basicBurger.addFoodItem("olives",1);
        System.out.println("total price of bill is " + basicBurger.getTotalBill());
        System.out.println();

        basicBurger.getTrackAdditions().getTomatoPrice();
        basicBurger.addFoodItem("tomato",1);
        System.out.println("total price of bill is " + basicBurger.getTotalBill());
        System.out.println();
        System.out.println("###################################");
        // normal burger class //
    }

    public static void healthyBurger(){
        HealthyBurger healthyBurger = new HealthyBurger("beef");
        System.out.println(healthyBurger.getBurgerName());
        System.out.println("healthy burger price is : " + healthyBurger.getBurgerPrice());
        System.out.println();

        healthyBurger.addFoodItem("carrot",1);
        healthyBurger.addFoodItem("pickle",1);
        healthyBurger.addFoodItem("lettuce",1);
        healthyBurger.addFoodItem("cucumber",1);
        healthyBurger.addFoodItem("tomato",1);
        healthyBurger.addFoodItem("olives",1);
        healthyBurger.addFoodItem("olives",1);
        healthyBurger.addFoodItem("zebra", 1);
        healthyBurger.getSubtotalAdditionPrice();
        System.out.println("total price of bill is " + healthyBurger.getTotalBill());
        System.out.println();
        System.out.println("###################################");
    }

    public static void deluxeBurger(){
        Burger deluxeBurger = new DeluxeHamburger("honey oat","fish");
        System.out.println(deluxeBurger.getBurgerName());
        System.out.println("Deluxe original.timbuchaka.work.Burger price is : " + deluxeBurger.getBurgerPrice());
        deluxeBurger.addFoodItem("drink",1);
        deluxeBurger.addFoodItem("chips",1);
        deluxeBurger.addFoodItem("drink",1);
        deluxeBurger.getSubtotalAdditionPrice();
        System.out.println("total price of bill is " + deluxeBurger.getTotalBill());
        System.out.println();
        System.out.println("###################################");
    }

    // The purpose of the application is to help a fictitious company called Bills Burgers to manage their process of selling hamburgers.
    // 1. Our application will help Bill to select types of burgers,
    // 2. some of the additional items (additions) to be added to the burgers
    // 3. and pricing.

    // We want to create a base hamburger,
    // but also two other types of hamburgers that are popular ones in Bills store.

    // The basic hamburger should have the following items.
    // 1. bread roll type
    // 2. meat
    // 3. 4 additional additions, (lettuce, tomato, carrot, olives, cucumber, pickle)

    // Each one of these items gets charged an additional price so you need some way to track how many items got added
    // and to calculate the final price (base burger with all the additions).

    // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).

    // Create a Hamburger class to deal with all the above.
    // The constructor with
    // 1. roll type
    // 2. meat
    // 3. price
    // 4. name of burger or you can use a setter.

    // Also create two extra varieties of Hamburgers (subclasses) to cater for
    // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions) in total.

    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).

    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.

    // All 3 classes should have a method that can be called anytime to show the
    // 1. base price of the hamburger
    // 2. plus all additionals, each showing the addition name,
    // 3. addition price
    // 4. a grand/final total for the burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.

}
