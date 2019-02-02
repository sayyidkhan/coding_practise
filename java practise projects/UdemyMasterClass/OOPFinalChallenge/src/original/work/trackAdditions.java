package original.work;

public class trackAdditions {

    public double getLettucePrice() {
        System.out.println("per lettuce price is : " + lettucePrice);
        return lettucePrice;
    }

    public double getTomatoPrice() {
        System.out.println("per tomato price is : " + tomatoPrice);
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        System.out.println("per carrot price is : " + carrotPrice);
        return carrotPrice;
    }

    public double getOlivesPrice() {
        System.out.println("per olives price is : " + olivesPrice);
        return olivesPrice;
    }

    public double getCucumberPrice() {
        System.out.println("per cucumber price is : " + cucumberPrice);
        return cucumberPrice;
    }

    public double getPicklePrice() {
        System.out.println("per pickle price is : " + picklePrice);
        return picklePrice;
    }

    private double lettucePrice = 0.20;
    private double tomatoPrice = 0.30;
    private double carrotPrice = 0.50;
    private double olivesPrice = 0.10;
    private double cucumberPrice = 0.20;
    private double picklePrice = 0.30;
    private double chipsPrice = 1;
    private double drinkPrice = 1.2;

    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    private int trackAdditionsLimit;
    private int trackAdditionsMax;
    private double trackAdditionSum;

    public trackAdditions() {
        this.trackAdditionsLimit = 0;
        this.trackAdditionSum = 0;
        this.trackAdditionsMax = 4;
    }

    // add lettuce price
    public void addItem(String foodItem, int amountOfItem){
        double sum = 0;
        if (this.trackAdditionsLimit < this.trackAdditionsMax) {
            if (foodItem == "lettuce") {
                sum = amountOfItem * lettucePrice;
            }
            if (foodItem == "tomato") {
                sum += amountOfItem * tomatoPrice;
            }
            if (foodItem == "carrot") {
                sum += amountOfItem * carrotPrice;
            }
            if (foodItem == "olives") {
                sum += amountOfItem * olivesPrice;
            }
            if (foodItem == "cucumber") {
                sum += amountOfItem * cucumberPrice;
            }
            if (foodItem == "pickle") {
                sum += amountOfItem * picklePrice;
            }
            if (foodItem == "chips") {
                sum += amountOfItem * chipsPrice;
            }
            if (foodItem == "drink") {
                sum += amountOfItem * drinkPrice;
            }
            System.out.println("subtotal price for " + foodItem + " is : " + sum);
            addTrackAdditionSum(amountOfItem);
            this.trackAdditionSum += sum;
        }
        else{
            System.out.println("you have added too many item no new item is added");
        }
    }

    private void addTrackAdditionSum(int amountOfItem){
        this.trackAdditionsLimit += amountOfItem;

    }

    public double getTrackAdditionSum() {
        return trackAdditionSum;
    }

    public void setTrackAdditionSum(double trackAdditionSum) {
        this.trackAdditionSum = trackAdditionSum;
    }

    public void setTrackAdditionsMax(int trackAdditionsMax) {
        this.trackAdditionsMax = trackAdditionsMax;
    }
}
