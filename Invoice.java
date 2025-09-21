
import java.util.Date;

public class Invoice {
    private String customerInfo;
    private int invoiceNo;
    private Date date;
    private double finalPrice;
    private double applicableTaxes;
    private double licenseFee;
    private double tradeInAllowance;

    // Association
    private TradeInVehicle tradeInVehicle;

    // Getters and Setters
    public String getCustomerInfo() { return customerInfo; }
    public void setCustomerInfo(String customerInfo) { this.customerInfo = customerInfo; }

    public int getInvoiceNo() { return invoiceNo; }
    public void setInvoiceNo(int invoiceNo) { this.invoiceNo = invoiceNo; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public double getFinalPrice() { return finalPrice; }
    public void setFinalPrice(double finalPrice) { this.finalPrice = finalPrice; }

    public double getApplicableTaxes() { return applicableTaxes; }
    public void setApplicableTaxes(double applicableTaxes) { this.applicableTaxes = applicableTaxes; }

    public double getLicenseFee() { return licenseFee; }
    public void setLicenseFee(double licenseFee) { this.licenseFee = licenseFee; }

    public double getTradeInAllowance() { return tradeInAllowance; }
    public void setTradeInAllowance(double tradeInAllowance) { this.tradeInAllowance = tradeInAllowance; }

    public TradeInVehicle getTradeInVehicle() { return tradeInVehicle; }
    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) { this.tradeInVehicle = tradeInVehicle; }
}