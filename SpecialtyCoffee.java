public class SpecialtyCoffee extends Coffee {
    private String flavor;

    public SpecialtyCoffee() {
        super();
        flavor = "vanilla";
    }

    public SpecialtyCoffee(String type, String flavor) {
        super("small", false, 1, type);
        this.flavor = flavor;
    }

    public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor) {
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        // Assuming flavor adds a fixed cost of 50
        price += 50;
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + " with " + flavor + " flavor";
    }

    public void printPriceComparison() {
        Coffee regularCoffee = new Coffee(getSize(), false, 1, "latte");
        System.out.println("Regular Coffee Price: " + regularCoffee.getPrice());
        System.out.println("Specialty Coffee Price: " + getPrice());
    }
}
