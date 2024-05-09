package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class administrator extends user {

    // testing comment
    // Attributes
    private String userId, username, password, email, gender, contact, status, profile;

    // Constructor 1
    public administrator(String userId, String username, String password, String email, String gender, String contact, String status, String profile) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.contact = contact;
        this.status = status;
        this.profile = profile;
    }

    // Constructor 2, for login purposes
    public administrator(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    // Constructor 3
    public administrator(String userId) {
        this.userId = userId;
    }

    // Getter is needed in order to enable other classes to access attributes from this class
    public String getUserId() {
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

    public String getStatus() {
        return status;
    }

    //Abstract method 1
    public String verifyLogin() {

        String result = "fail";
        // Implementation
        try {
            FileReader reader = new FileReader("Administrator.txt");
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

    //Abstract method 2
    public String managePersonalProfile() {

        String result = "fail";
        // Implementation
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        try {
            FileReader reader = new FileReader("Administrator.txt");
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
                String[] list = lines.get(i).split("\\|");
                if (list[1].trim().equals(userId)) {
                    // Replace the entire row with a new line
                    lines.set(i, list[0].trim() + " | " + list[1].trim() + " | " + username + " | " + hashedPassword + " | " + email + " | " + gender + " | " + contact + " | " + status + " | " + profile);  // Replace with the new values
                    result = "Success";
                }
            }
            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Administrator.txt"));
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
    public String manageWorkerProfile() {

        String result = "fail";
        // Implementation
        return result;
    }

    // Method 4
    public report generateReport(report object) {

        report obj = null;
        // Implementation
        return obj;
    }

    // Method 5
    public String registration(int type) {

        // Implementation
        String result = "fail";
        String fileType = "";
        String id = "";
        // Hash the password
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        if (type == 1) {
            fileType = "SalesPerson.txt";
            id = "SID_";
        } else if (type == 2) {
            fileType = "Officer.txt";
            id = "OID_";
        } else if (type == 3) {
            fileType = "Administrator.txt";
            id = "AID_";
        }

        try {
            FileWriter File = new FileWriter(fileType, true);
            FileReader Read = new FileReader(fileType);
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
            Write.println(Count + "." + " | " + id + Count + " | " + username + " | " + hashedPassword + " | " + email + " | " + gender + " | " + contact + " | " + status + " | " + profile);
            JOptionPane.showMessageDialog(null, "System sending password through email to user, pls wait!", "Success", JOptionPane.INFORMATION_MESSAGE);
            Write.close();
            result = "Success";
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No record added, please try again", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Invalid input, please try again", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    // Static method 1 to retrieve data from text file
    public List<administrator> retrieveDataById() {
        List<administrator> adminDetails = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Administrator.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line using the pipe character as the delimiter
                String[] parts = line.split("\\|");
                if (parts[1].trim().equals(userId)) {
                    // Calling constructor to fetch all details
                    administrator admin = new administrator(
                            parts[1].trim(), // User id
                            parts[2].trim(), // Full Name
                            parts[3].trim(), // Password
                            parts[4].trim(), // Email
                            parts[5].trim(), // Gender
                            parts[6].trim(), // Contact
                            parts[7].trim(), // Status (assuming it's an integer)
                            parts[8].trim() // add profile picture
                    );
                    adminDetails.add(admin);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading data from file.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return adminDetails;
    }

}
