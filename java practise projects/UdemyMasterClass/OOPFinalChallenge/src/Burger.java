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

    private String burgerName;
    private String breadRollType;
    private String meatType;
    private final double burgerPrice;
    private double totalBill;

    public trackAdditions getTrackAdditions() {
        return trackAdditions;
    }

    private trackAdditions trackAdditions;

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
        System.out.println("Normal Burger price : " + this.burgerPrice);
        return this.burgerPrice;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public void addFoodItem(String foodItem, int amountOfItem){
        this.trackAdditions.addItem(foodItem,amountOfItem); // add sum in trackAdditions
        double subtotalAdditionAmount = this.trackAdditions.getTrackAdditionSum();
        double sum = this.burgerPrice + subtotalAdditionAmount;
        setTotalBill(sum);
    }
}
