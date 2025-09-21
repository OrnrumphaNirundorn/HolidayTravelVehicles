public class Main {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setCustomerId(1);
        c.setName("Namo Mangkud");
        c.setAddress("12345 Main St");
        c.setPhoneNo("088-888-8888");

        Salesperson sp = new Salesperson();
        sp.setEmployeeId(101);
        sp.setName("TT");

        Vehicle v = new Vehicle();
        v.setSerialNumber("V1001");
        v.setName("Toyota Camry");
        v.setModel("XSE");
        v.setYear(2023);
        v.setManufacturer("Toyota");
        v.setBaseCost(28000);

        Transaction t = new Transaction();
        t.setTransactionId(5001);
        t.setCustomer(c);
        t.setSalesperson(sp);
        t.setVehicle(v);



        
        System.out.println("===== Transaction Summary =====");
        System.out.println("Transaction ID: " + t.getTransactionId());

        System.out.println("\n--- Customer Info ---");
        System.out.println("ID: " + c.getCustomerId());
        System.out.println("Name: " + c.getName());
        System.out.println("Address: " + c.getAddress());
        System.out.println("Phone: " + c.getPhoneNo());

        System.out.println("\n--- Salesperson Info ---");
        System.out.println("Employee ID: " + sp.getEmployeeId());
        System.out.println("Name: " + sp.getName());

        System.out.println("\n--- Vehicle Info ---");
        System.out.println("Serial No: " + v.getSerialNumber());
        System.out.println("Name: " + v.getName());
        System.out.println("Model: " + v.getModel());
        System.out.println("Year: " + v.getYear());
        System.out.println("Manufacturer: " + v.getManufacturer());
        System.out.println("Base Cost: $" + v.getBaseCost());

    }
}
