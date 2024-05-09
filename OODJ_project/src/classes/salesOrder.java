package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class salesOrder {
    // Attributes
    public String salesOrderId, dateTime, furniture,type, url, rate, delivery, sale, price, quantity, approveStatus;
    
    // Constructors 1
    public salesOrder(String salesOrderId,String dateTime, String furniture,String type, String url, String rate, String delivery, String sale, String price, String quantity, String approveStatus){
        this.salesOrderId = salesOrderId;
        this.dateTime = dateTime;
        this.furniture = furniture;
        this.type = type;
        this.url= url;
        this.rate = rate;
        this.delivery = delivery;
        this.sale = sale;
        this.price = price;
        this.quantity = quantity;
        this.approveStatus = approveStatus;
    }
    
    // Constructor 2
    public salesOrder(String salesOrderId){
        this.salesOrderId = salesOrderId;
    }
    
     //Static method to retrieve data (example)
    public static List<salesOrder> retrieveData(){
        
        List<salesOrder> salesOrderDetails = new ArrayList<>();
        // Implementation
        try (
            BufferedReader reader = new BufferedReader(new FileReader("SalesOrder.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line using the pipe character as the delimiter
                String[] parts = line.split("\\|");
                    // Calling constructor to initialize all attributes
                    salesOrder details = new salesOrder(
                            parts[1].trim(), 
                            parts[2].trim(),
                            parts[3].trim(),
                            parts[4].trim(),
                            parts[5].trim(),
                            parts[6].trim(),
                            parts[7].trim(),
                            parts[8].trim(),
                            parts[9].trim(),
                            parts[10].trim(),
                            parts[11].trim()
                    );
                    salesOrderDetails.add(details);
            }
        } catch (IOException e) {
            
        }
        return salesOrderDetails;
    }
}
