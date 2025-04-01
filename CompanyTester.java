public class CompanyTester {
    public static void run() {
        // Create a Company object
        Company generalCompany = new Company("TechCorp", "123 Tech St", "Innovation City", "CA");

        // Print the Company object
        System.out.println(generalCompany);

        // Create an OnlineCompany object
        OnlineCompany onlineCompany = new OnlineCompany("CodeHS", "www.codehs.com");

        // Print the OnlineCompany object
        System.out.println(onlineCompany);
    }
}
