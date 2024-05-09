package classes;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class salesInvoice {
    
    // Attributes
    public String invoiceID, salesOrderID, productName, salesOrderQuantity, unitPrice, customerName, officerID, createdDate;
    
    // Constructor 1
    public salesInvoice(String invoiceID, String salesOrderID, String productName, String salesOrderQuantity, String unitPrice, String customerName, String officerID, String createdDate){
        this.invoiceID = invoiceID;
        this.salesOrderID = salesOrderID;
        this.productName = productName;
        this.salesOrderQuantity = salesOrderQuantity;
        this.unitPrice = unitPrice;
        this.customerName = customerName;
        this.officerID = officerID;
        this.createdDate = createdDate;
    }
    
    
    // Static method to retrieve data from text file
   public static List<salesInvoice> retrieveData(){
       
       List<salesInvoice> salesInvoiceDetails = new ArrayList<>();
        // Implementation
        
        try (
            BufferedReader reader = new BufferedReader(new FileReader("SalesOrder.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line using the pipe character as the delimiter
                String[] parts = line.split("\\|");
                // Calling constructor to fetch all details
                salesInvoice details= new salesInvoice(
                        parts[0].trim(),  // Invoice Id
                        parts[1].trim(),  // sales Order id
                        parts[2].trim(),  // product Name
                        parts[3].trim(),  // sales Order Quantity
                        parts[4].trim(),  // unit Price
                        parts[5].trim(),  // customer Name
                        parts[6].trim(), // officer Id
                        parts[7].trim() // createdDate
                );
                salesInvoiceDetails.add(details);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading data from file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return salesInvoiceDetails;
   }
    
}
