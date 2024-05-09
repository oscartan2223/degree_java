package classes;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate; // import the LocalDate class
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class staticMethod {
    // Attributes
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "@#$%";

    public static String userProfileValidation(int number, String inputValue) {

        String output = "Error";
        // Calling function emptyValidation

        switch (number) {
            case 1:
                // Validate user id 
                String regexPattern = "(AID_\\d+)?( SID_\\d+)?( OID_\\d+)?";
                // Create a Pattern object
                Pattern pattern = Pattern.compile(regexPattern);
                // Create a Matcher object
                Matcher matcher = pattern.matcher(inputValue);
                // Check if at least one of the substrings is present
                if (matcher.find() == true) {
                    output = "Success";
                }
                break;
            case 2:
                // Validation for password
                if (inputValue.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$")) {
                    output = "Success";
                }
                break;
            case 3:
                // Validation for email
                if (inputValue.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-z]{2,}\\b")) {
                    output = "Success";
                }
                break;
            case 4:
                // Validation for contact number
                if (inputValue.matches("\\d{3}-\\d{7}")) {
                    output = "Success";
                }
                break;
            case 5:
                // Validation for OTP only
                if (inputValue.matches("[0-9]+") && inputValue.length() == 6) {
                    output = "Success";
                }
                break;
            case 6:
                // Validation for image
                String[] parts = inputValue.split("\\.");
                if(!"jpg".equals(parts[1]) && !"png".equals(parts[1].trim()) && !"jpeg".equals(parts[1]) && !"svg".equals(parts[1]) && !"webp".equals(parts[1])){
                    System.out.println("Hola");
                } else{
                    output = "Success";
                }
                break;
            case 7: 
                // Validation for numbers
                if(inputValue.matches("[0-9]+")){
                    output = "Success";
                }
                break;
            default:
                break;
        }
        return output;
    }

    // Password double confirm method
    public static String passwordConfirm(String passwordOne, String passwordTwo) {
        String output = "Error";
        if (passwordOne == null ? passwordTwo == null : passwordOne.equals(passwordTwo)) {
            output = "Pass";
        }
        return output;
    }

    public static String emptyValidation(String inputValue) {
        String output = "Error";
        if (!inputValue.isEmpty()) {
            output = "Pass";
        }
        return output;
    }

    private static String generateOTP() {

        // Generate a random 6-digit OTP
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);

    }

    public static Session sendEmail(String userEmail, String authKey) {

        // Email configuration
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        // Create a session with the email server
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userEmail, authKey);
            }
        });

        return session;
    }

    public static String forgotPassword(String userEmail, String authKey, String receiver) {

        // Generate a random 6-digit OTP
        String otp = generateOTP();
        // Calling sendEmail method
        Session session = sendEmail(userEmail, authKey);
        try {
            // Create a message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(userEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
            message.setSubject("Your One-Time Password (OTP)");
            message.setText("Your OTP is: " + otp);

            // Send the message
            Transport.send(message);
            System.out.println("OTP sent successfully!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        return otp;
    }

    // On the screen side there, remember to assign the value of generated OTP to a String type variable then assign it to this method as second parameter
    public static String verifyOTP(String inputValue, String generatedOTP) {
        String output = "Error";
        if (inputValue == null ? generatedOTP == null : inputValue.trim().equals(generatedOTP)) {
            output = "Pass";
        }
        return output;
    }

    public static void notifyUser(int type, String userEmail, String authKey, String receiver, String password) {

        String msgOne = "";
        if (type == 1) {
            msgOne = "Sales Person password: " + password;
        } else if (type == 2) {
            msgOne = "Officer password: " + password;
        }

        // Calling sendEmail method
        Session session = sendEmail(userEmail, authKey);
        try {
            // Create a message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(userEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
            message.setSubject("Your account have been created and remember to change the current password");
            message.setText(msgOne);

            // Send the message
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String randomPasswordGenerator() {

        SecureRandom random = new SecureRandom();
        // Ensure at least one character from each category
        char digit = DIGITS.charAt(random.nextInt(DIGITS.length()));
        char lowercase = LOWERCASE.charAt(random.nextInt(LOWERCASE.length()));
        char uppercase = UPPERCASE.charAt(random.nextInt(UPPERCASE.length()));
        char specialCharacter = SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length()));

        // Generate additional characters to meet the fixed length requirement (8 characters)
        StringBuilder randomChars = new StringBuilder();
        for (int i = 4; i < 8; i++) { // Change the loop condition to generate only 4 additional characters
            String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
            randomChars.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle all characters and insert the required ones at the beginning
        String allChars = "" + digit + lowercase + uppercase + specialCharacter + randomChars.toString();
        char[] shuffledChars = allChars.toCharArray();
        for (int i = shuffledChars.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = shuffledChars[index];
            shuffledChars[index] = shuffledChars[i];
            shuffledChars[i] = temp;
        }

        return new String(shuffledChars);
    }

    public static String getLocalCurrentDateTime() {

        String dateTime = "";
        LocalDate object = LocalDate.now(); // Create a date object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dateTime = object.format(formatter);

        return dateTime;
    }

    public static String resetPassword(int fileType, String id, String password) {

        String result = "fail", file = "";

        if (fileType == 1) {
            file = "SalesPerson.txt";
        } else if (fileType == 2) {
            file = "Officer.txt";
        } else if (fileType == 3) {
            file = "Administrator.txt";
        }

        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        try {
            FileReader reader = new FileReader(file);
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
                if (list[1].trim().equals(id)) {
                    // Replace the entire row with a new line
                    lines.set(i, list[0].trim() + " | " + id + " | " + list[2].trim() + " | " + hashedPassword + " | " + list[4].trim() + " | " + list[5].trim() + " | " + list[6].trim() + " | " + list[7].trim() + " | " + list[8].trim());  // Replace with the new values
                    result = "Success";
                }
            }
            // Write the modified data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
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

    // Image picker
    public static String displayImage(JLabel profileImage, String filePath,File selectedFile, String file) {

        String image = "default_pic.png";
        filePath = selectedFile.getAbsolutePath();
        image = file;

        try {
            // Read the image from file
            BufferedImage originalImage = ImageIO.read(new File(filePath));
            // Resize the image to fit the desired size
            int targetWidth = 230; // Set the desired width
            int targetHeight = 250; // Set the desired height
            Image resizedImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
            // Create a new ImageIcon with the resized image
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            // Set the resized ImageIcon to the "test" component
            profileImage.setIcon(resizedIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    // Save image to specific folder (images)
    public static void uploadImage(File selectedFile) {

        String getLocalDirectory = System.getProperty("user.dir");

        try {
            // Specify the destination folder
            String destinationFolder = getLocalDirectory + "\\src\\images";
            // Create a Path for the destination folder
            Path destinationPath = Paths.get(destinationFolder);
            // Copy the selected file to the destination folder
            Files.copy(selectedFile.toPath(), destinationPath.resolve(selectedFile.getName()), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
