package classes;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class officer extends user {

    // Attributes
    private String userId, username, password, email, gender, contact, status, profile;

    // Constructor 1
    public officer(String userId, String username, String password, String email, String gender, String contact, String status, String profile) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.contact = contact;
        this.status = status;
        this.profile = profile;
    }

    // Constructor 2, for search purposes
    public officer(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    // Constructor 3 as known as Setter for encapsulation
    public officer(String userId) {
        this.userId = userId;
    }
    
    //Empty Constructor
    public officer() {
    }
    
    // Getter is needed in order to enable other classes to access attributes from this class
    public String getUserId(){
        return userId;
    }
    
    public String getName(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getContact(){
        return contact;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getProfileImage() {
        return profile;
    }
    
    public String getStatus(){
        return status;
    }
    
    // Method 1
    public String verifyLogin() {
        //try
        String result = "fail";
        try {
            FileReader reader = new FileReader("Officer.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<String> lines = new ArrayList<String>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
            for (String item : lines) {
                String[] list = item.split("\\|");
                if (list[1].trim().equals(userId) && BCrypt.checkpw(password, list[3].trim())) {
                    result = "Success";
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No record added, please register to proceed.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Invalid input, please try again", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    // Method 2
    public String managePersonalProfile() {

        String result = "fail";
        // Implementation
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        try {
            FileReader reader = new FileReader("Officer.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<String> lines = new ArrayList<String>();
            String line;
            // Read the content of the file into the list
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
            // Identify and replace the entire row
            for (int i = 0; i < lines.size(); i++) {
                int Count = 1;
                Count += 1;
                String[] list = lines.get(i).split("\\|");
                if (list[1].trim().equals(userId)) {
                    // Replace the entire row with a new line
                    lines.set(i, Count + "." + " | " + "SID_" + Count + " | " + username + " | " + hashedPassword + " | " + email + " | " + gender + " | " + contact + " | " + status);  // Replace with the new values
                    result = "Success";
                }
            }
            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Officer.txt"));
            for (String modifiedLine : lines) {
                writer.write(modifiedLine);
                writer.newLine();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No record added, please register to proceed.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Invalid input, please try again", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
    
    // Method 3
    public String searchSalesOrder(salesOrder object) {

        String result = "fail";
        // Implementation
        return result;

    }

    // Method 4 
    public String editSalesOrderStatus(salesOrder object) {

        String result = "fail";
        // Implementation
        return result;
    }

    //Method 5
    public String generateInvoice() {

        String result = "fail";
        //Implementation
        return result;
    }

    // Method 6
    public report generateReport(report object) {
        report obj = null;
        // Implementation
        return obj;
    }

    //Method 8
    public List<officer> retrieveDataByOwnId() {

        List<officer> OfficerDetails = new ArrayList<>();
        // Implementation
        try (BufferedReader reader = new BufferedReader(new FileReader("Officer.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line using the pipe character as the delimiter
                String[] parts = line.split("\\|");
                if (parts[1].trim() == null ? userId == null : parts[1].trim().equals(userId)) {
                    // Calling constructor to fetch all details
                    officer officers = new officer(
                            parts[1].trim(), // User id
                            parts[2].trim(), // Full Name
                            parts[3].trim(), // Password
                            parts[4].trim(), // Email
                            parts[5].trim(), // Gender
                            parts[6].trim(), // Contact
                            parts[7].trim() // Status (assuming it's an integer)
                    );
                    OfficerDetails.add(officers);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No record found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return OfficerDetails;
    }
    
    public String getOfficerName(String userID) {
        String user_name = null;

        try (BufferedReader br = new BufferedReader(new FileReader("Officer.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                
                // Using user ID to find the username
                for (String part : parts) {
                    if (part.trim().equals(userID.trim())) {
                        if (parts.length > 1) {
                            user_name = parts[2].trim();
                            break;
                        }
                    }
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user_name;
    }
}
