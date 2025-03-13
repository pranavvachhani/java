import java.util.Scanner;

public class whatsapp {
    private String phone_number;
    private String otp;
    private Scanner sc;  // Declare Scanner globally

    public whatsapp() {
        sc = new Scanner(System.in);  // Initialize Scanner in constructor
    }

    void user_input() {
        System.out.println("Enter phone number:");
        phone_number = sc.nextLine();
        System.out.println("Enter OTP:");
        otp = sc.nextLine();
    }

    void open_app() {
        while (true) {
            if (phone_number.equals("997879678") && otp.equals("1234")) {
                System.out.println("WhatsApp is opened!");
                break;
            } else {
                System.out.println("Invalid phone number or OTP. Try again.");
                user_input();
            }
        }
        sc.close(); // Close scanner after use
    }

    public static void main(String[] args) {
        System.out.println("Welcome to WhatsApp!");
        whatsapp app = new whatsapp();
        app.user_input();
        app.open_app();
    }
}
