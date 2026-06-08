class Toyota extends Car {

    protected String madeIn;
    protected int madeYear;

    // Constructor using super()
    public Toyota(String color, String model,
                  String madeIn, int madeYear) {

        super(color, model);   // Calls Car constructor

        this.madeIn = madeIn;
        this.madeYear = madeYear;

        System.out.println("Toyota Constructor Called");
    }

    // Overriding carType()
    @Override
    public void carType() {
        System.out.println("Car Type: Passenger Car");
    }

    // Overriding status()
    @Override
    public void status() {
        System.out.println("Status: Running");
    }
}
