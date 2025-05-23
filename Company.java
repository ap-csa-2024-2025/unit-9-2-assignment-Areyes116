public class Company {
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    public Company(String name) {
        this.name = name;
        this.streetAddress = null;
        this.city = null;
        this.state = null;
    }

    public Company(String name, String streetAddress, String city, String state) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String address() {
        if (streetAddress == null || city == null || state == null) {
            return "Address not available";
        }
        return streetAddress + "\n" + city + ", " + state;
    }

    @Override
    public String toString() {
        if (streetAddress == null || city == null || state == null) {
            return name + "\nAddress not available";
        }
        return name + "\n" + address();
    }
}
