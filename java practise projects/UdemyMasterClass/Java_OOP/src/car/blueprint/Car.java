package car.blueprint;

public class Car {

    // creating the fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // setter model
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } // only allow the validModel to be carrera or commodore
        else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

    // the public is an access modifier
    // public means unrestricted access to the class
    // private no other class can access the class
    // protected which allows the classes in the packages to access the class
    // you can also remove the access modifier completely

}
