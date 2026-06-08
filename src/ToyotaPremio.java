// Grandchild Class: ToyotaPremio inherits Toyota
class ToyotaPremio extends Toyota {

    private String bodyType;

    // Constructor using super()
    public ToyotaPremio(String color, String model,
                        String madeIn, int madeYear,
                        String bodyType) {

        super(color, model, madeIn, madeYear); // Calls Toyota constructor

        this.bodyType = bodyType;

        System.out.println("Toyota Premio Constructor Called");
    }

    // Overriding carType()
    @Override
    public void carType() {
        System.out.println("Car Type: Premium Sedan");
    }

    // Display all information
    @Override
    public void status() {

        System.out.println("\n===== Toyota Premio Details =====");
        System.out.println("Color      : " + color);
        System.out.println("Model      : " + model);
        System.out.println("Made In    : " + madeIn);
        System.out.println("Made Year  : " + madeYear);
        System.out.println("Body Type  : " + bodyType);
        System.out.println("Status     : Running");
    }
}
