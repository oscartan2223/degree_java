package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.JOptionPane;

public class product {

    // Attributes 
    public String furnitureId, furnitureName, type, url, rate, delivery, sale, price;

    // Constructor 1 
    public product(String furnitureId, String furnitureName, String type, String url, String rate, String delivery, String sale, String price) {
        this.furnitureId = furnitureId;
        this.furnitureName = furnitureName;
        this.type = type;
        this.url = url;
        this.rate = rate;
        this.delivery = delivery;
        this.sale = sale;
        this.price = price;
    }

    // Constructor 2
//    public product(String furnitureId){
//        this.furnitureId = furnitureId;
//    }
    
    public static List<product> retrieveData() {
        List<product> productDetails = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("product.csv"))) {
            // Read the data
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = parseCSVLine(line);
                product details = new product(
                        data[0].trim(),
                        data[1].trim(),
                        data[2].trim(),
                        data[3].trim(),
                        data[4].trim(),
                        data[5].trim(),
                        data[6].trim(),
                        data[7].trim()
                );
                productDetails.add(details);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return productDetails;
    }

//    public List<product> searchProduct() {
//        List<product> productDetails = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader("product.csv"))) {
//            // Read the data
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] data = parseCSVLine(line);
//                if (data[0].trim().equals(furnitureId)) {
//                    product details = new product(
//                            data[0].trim(),
//                            data[1].trim(),
//                            data[2].trim(),
//                            data[3].trim(),
//                            data[4].trim(),
//                            data[5].trim(),
//                            data[6].trim(),
//                            data[7].trim()
//                    );
//                    productDetails.add(details);
//                    break;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return productDetails;
//    }

    private static String[] parseCSVLine(String line) {
        List<String> values = new ArrayList<>();
        StringBuilder currentField = new StringBuilder();
        boolean inQuotes = false;
        for (char c : line.toCharArray()) {
            if (c == '"') {
                inQuotes = !inQuotes;
            } else if (c == ',' && !inQuotes) {
                values.add(currentField.toString().trim());
                currentField.setLength(0);
            } else {
                currentField.append(c);
            }
        }
        values.add(currentField.toString().trim());

        return values.toArray(new String[0]);
    }
}
