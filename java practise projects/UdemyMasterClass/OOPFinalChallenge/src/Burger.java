public class Burger {

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    protected void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    private String burgerName;
    private String breadRollType;
    private String meatType;

    private double burgerPrice;
    private double totalBill;

    public trackAdditions getTrackAdditions() {
        return trackAdditions;
    }

    private trackAdditions trackAdditions;

    public void setMaxAdditionsValue(int value) {
        this.trackAdditions.setTrackAdditionsMax(value);
    }

    public Burger(String breadRollType, String meatType) {
        this("Normal Burger",breadRollType , meatType);
    }

    private Burger(String burgerName, String breadRollType, String meatType) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.burgerPrice = 5;
        this.totalBill = this.burgerPrice;
        this.trackAdditions = new trackAdditions();
    }

    public double getBurgerPrice() {
        return this.burgerPrice;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public void getSubtotalAdditionPrice(){
        System.out.println("subtotal price is " + this.trackAdditions.getTrackAdditionSum());
    }

    public void addFoodItem(String foodItem, int amountOfItem){
        if(foodItem == "carrot" || foodItem == "lettuce" || foodItem == "pickle" || foodItem == "cucumber" || foodItem == "tomato" || foodItem == "olives") {
            this.trackAdditions.addItem(foodItem, amountOfItem); // add sum in trackAdditions
            double subtotalAdditionAmount = this.trackAdditions.getTrackAdditionSum();
            double sum = this.burgerPrice + subtotalAdditionAmount;
            setTotalBill(sum);
        }
        else{
            System.out.println("you have either entered an invalid item or an item not allowed for this combo");
        }

    }
}
