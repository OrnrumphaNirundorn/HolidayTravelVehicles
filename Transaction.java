public class Transaction {
    private int transactionId;
    private int customerId;
    private String customerSignature;
    private int employeeId;

    // Associations
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private Invoice invoice;

    // Getters and Setters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int transactionId) { this.transactionId = transactionId; }

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public String getCustomerSignature() { return customerSignature; }
    public void setCustomerSignature(String customerSignature) { this.customerSignature = customerSignature; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Salesperson getSalesperson() { return salesperson; }
    public void setSalesperson(Salesperson salesperson) { this.salesperson = salesperson; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

    public Invoice getInvoice() { return invoice; }
    public void setInvoice(Invoice invoice) { this.invoice = invoice; }
}