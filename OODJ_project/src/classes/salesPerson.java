package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class salesPerson extends user {

    // Attributes
    private String userId, username, password, email, gender, contact, status, profile;

    // Constructor 1 for add and modify profile
    public salesPerson(String userId, String username, String password, String email, String gender, String contact, String status, String profile) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.contact = contact;
        this.status = status;
        this.profile = profile;
    }

    // Constructor 2, for login 
    public salesPerson(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    // Constructor 3 as known as Setter for encapsulation
    public salesPerson(String userId) {
        this.userId = userId;
    }
    
    // Getter is needed in order to enable other classes to access attributes from this class
    public String getUserId(){
        return userId;
    }
    
    public String getName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getGender() {
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

        String result = "fail";
        try {
            FileReader reader = new FileReader("SalesPerson.txt");
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
            FileReader reader = new FileReader("SalesPerson.txt");
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
                    lines.set(i, list[0].trim() + " | " + list[1].trim() + " | " + username + " | " + hashedPassword + " | " + email + " | " + gender + " | " + contact + " | " + status + " | " + profile);  // Replace with the new values
                    result = "Success";
                }
            }
            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("SalesPerson.txt"));
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
    public String addSalesOrder(salesOrder object) {

        String result = "fail";
        try {
            FileWriter File = new FileWriter("SalesOrder.txt", true);
            FileReader Read = new FileReader("SalesOrder.txt");
            BufferedReader bufferedReader = new BufferedReader(Read);
            List<String> lines = new ArrayList<String>();
            String Line;
            while ((Line = bufferedReader.readLine()) != null) {
                lines.add(Line);
            }
            bufferedReader.close();
            PrintWriter Write = new PrintWriter(File);
            int Count = 1;
            for (String Item : lines) {
                Count += 1;
            }
            // Overwrite into text file
            Write.println(Count + "." + " | " + "SIOD_" + Count + " | " + object.dateTime + " | " + object.furniture + " | " + object.type +" | " + object.url + " | " + object.rate + " | " + object.delivery + " | " + object.sale + " | " + object.price + " | " + object.quantity + " | " + object.approveStatus);
            Write.close();
            result = "Success";
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No record added, please try again", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Invalid input, please try again", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    // Method 4 
    public String editSalesOrder(salesOrder object) {

        String result = "fail";
        // Implementation
        try {
            FileReader reader = new FileReader("SalesOrder.txt");
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
                if (list[1].trim().equals(object.salesOrderId)) {
                    lines.set(i,list[0].trim() + " | " + object.salesOrderId + " | " + object.dateTime + " | " + list[3].trim() + " | " + list[4].trim() + " | " + list[5].trim() + " | " + list[6].trim() + " | " + list[7].trim() + " | " + list[8].trim() +" | " + object.price + " | " + object.quantity + " | " + list[11].trim());
                    result = "Success";
                }
            }
            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("SalesOrder.txt"));
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

    // Method 5
    public String removeSalesOrder(salesOrder object) {

        String result = "fail";
        try {
            FileReader reader = new FileReader("SalesOrder.txt");
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
                if (list[1].trim().equals(object.salesOrderId)) {
                    // Replace the entire row with a new line
                    lines.remove(i);
                    result = "Success";
                }
            }
            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("SalesOrder.txt"));
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

    //Method 6
    public List<salesPerson> retrieveDataByOwnId() {

        List<salesPerson> salesPersonDetails = new ArrayList<>();
        // Implementation
        try (BufferedReader reader = new BufferedReader(new FileReader("SalesPerson.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line using the pipe character as the delimiter
                String[] parts = line.split("\\|");
                if (parts[1].trim() == null ? userId == null : parts[1].trim().equals(userId)) {
                    // Calling constructor to fetch all details
                    salesPerson salesMan = new salesPerson(
                            parts[1].trim(), // User id
                            parts[2].trim(), // Full Name
                            parts[3].trim(), // Password
                            parts[4].trim(), // Email
                            parts[5].trim(), // Gender
                            parts[6].trim(), // Contact
                            parts[7].trim(), // Status (assuming it's an integer)
                            parts[8].trim() // Profile
                    );
                    salesPersonDetails.add(salesMan);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No record found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return salesPersonDetails;
    }

    // Static method to retrieve all data from sales Person file. (For admin to view all salesPerson details) 
    public static List<salesPerson> retrieveData() {

        List<salesPerson> salesPersonDetails = new ArrayList<>();
        // Implementation
        try (BufferedReader reader = new BufferedReader(new FileReader("SalesPerson.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line using the pipe character as the delimiter
                String[] parts = line.split("\\|");

                // Calling constructor to fetch all details
                salesPerson salesMan = new salesPerson(
                        parts[1].trim(), // User id
                        parts[2].trim(), // Full Name
                        parts[3].trim(), // Password
                        parts[4].trim(), // Email
                        parts[5].trim(), // Gender
                        parts[6].trim(), // Contact
                        parts[7].trim(), // Status (assuming it's an integer)
                        parts[8].trim()
                );
                salesPersonDetails.add(salesMan);
            }
        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, "No record found", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return salesPersonDetails;
    }
}
