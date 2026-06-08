class Car {

    // Protected variables can be accessed by child classes
    protected String color;
    protected String model;

    // Constructor
    public Car(String color, String model) {
        this.color = color;
        this.model = model;

        System.out.println("Car Constructor Called");
    }

    // Method that will be overridden in child classes
    public void carType() {
        System.out.println("Generic Car");
    }

    // Method to display car information
    public void status() {
        System.out.println("Car Status Information");
    }
}
