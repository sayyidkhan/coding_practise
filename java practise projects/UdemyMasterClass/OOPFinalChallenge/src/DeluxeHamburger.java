public class DeluxeHamburger extends Burger{

    public DeluxeHamburger(String breadRollType, String meatType) {
        super(breadRollType, meatType);
        setBurgerName("Deluxe Burger");
        setBurgerPrice(4.5);
        setMaxAdditionsValue(2);
    }

    public double getDrinkPrice(){
        return this.getTrackAdditions().getDrinkPrice();
    }

    public double getChipsPrice(){
        return this.getTrackAdditions().getChipsPrice();
    }

    @Override
    public void addFoodItem(String foodItem, int amountOfItem) {
        if(foodItem == "chips" || foodItem == "drink") {
            getTrackAdditions().addItem(foodItem, amountOfItem); // add sum in trackAdditions
            double subtotalAdditionAmount = getTrackAdditions().getTrackAdditionSum();
            double sum = getBurgerPrice() + subtotalAdditionAmount;
            setTotalBill(sum);
        }
        else{
            System.out.println("you have either entered an invalid item or an item not allowed for this combo");
        }
    }
}
