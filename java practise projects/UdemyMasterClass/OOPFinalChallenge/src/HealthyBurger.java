public class HealthyBurger extends Burger {


    public HealthyBurger(String meatType) {
        super("Brown Rye", meatType);
        setBurgerName("Healthy Burger");
        setMaxAdditionsValue(6); // healthy burger max of 6 ingredients
        setBurgerPrice(6);
    }

}
