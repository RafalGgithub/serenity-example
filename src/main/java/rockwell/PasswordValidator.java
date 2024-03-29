package rockwell;

import java.io.IOException;
import java.util.Scanner;

import static rockwell.FileReader.readFileFromResources;
import static rockwell.SHA256Encryptor.encryptString;

public class PasswordValidator {
    private static final String PASSWORD;

    static {
        try {
            PASSWORD = readFileFromResources("password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password:");

        while (true) {
            String enteredPassword = encryptString(scanner.nextLine());

            if (enteredPassword.equals(PASSWORD)) {
                System.out.println("Password correct");
                break;
            } else {
                System.out.println("Wrong password. Try again:");
            }
        }
        scanner.close();
    }


}
