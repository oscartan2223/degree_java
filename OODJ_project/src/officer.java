//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JOptionPane;
//import org.mindrot.jbcrypt.BCrypt;
//
//public class officer extends user {
//
//    // Attributes
//    private String userId, username, password, email, gender, contact, status;
//
//    // Constructor 1
//    public officer(String username, String password, String email, String gender, String contact, String status) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.gender = gender;
//        this.contact = contact;
//        this.status = status;
//    }
//
//    //read user input every 5 seconds
//    // Constructor 2, for search purposes
//    public officer(String userId) {
//        this.userId = userId;
//    }
//
//    // Since this class inheri user class so the verifylogin and manageProfile method must be have implementation
//    // Method 1
//    public String verifyLogin() {
//        //try
//        String result = "fail";
//        try {
//            FileReader reader = new FileReader("Officer.txt");
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            List<String> lines = new ArrayList<String>();
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                lines.add(line);
//            }
//            bufferedReader.close();
//            for (String item : lines) {
//                String[] list = item.split("\\|");
//                if (list[2].trim().equals(email) && BCrypt.checkpw(password, list[1].trim())) {
//                    result = "Found";
//                }
//            }
//        } catch (FileNotFoundException e) {
//            JOptionPane.showMessageDialog(null, "No record added, please register to proceed.", "Error", JOptionPane.ERROR_MESSAGE);
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, "Invalid input, please try again", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        return result;
//    }
//
//    // Method 2
//    public String managePersonalProfile() {
//
//        String result = "fail";
//
//        // Implementation
//        return result;
//    }
//
//    // Method 3
//    public String searchSalesOrder(salesOrder object) {
//
//        String result = "fail";
//        // Implementation
//        return result;
//
//    }
//
//    // Method 4 
//    public String editSalesOrderStatus(salesOrder object) {
//
//        String result = "fail";
//        // Implementation
//        return result;
//    }
//
//    //Method 5
//    public String generateInvoice() {
//
//        String result = "fail";
//        //Implementation
//        return result;
//    }
//
//    // Method 6
//    public report generateReport(report object) {
//        report obj = null;
//        // Implementation
//        return obj;
//    }
//
//    // Static method to retrieve data from text file
//    public static List<officer> retrieveData() {
//
//        List<officer> obj = new ArrayList<>();
//        // Implementation
//        return obj;
//    }
//}
