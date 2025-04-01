public class OnlineCompany extends Company {
    private String webAddress;

    public OnlineCompany(String name, String webAddress) {
        super(name); // Call superclass constructor
        this.webAddress = webAddress;
    }

    @Override
    public String address() {
        return webAddress;
    }

    @Override
    public String toString() {
        return super.getName() + "\n" + webAddress;
    }
}
