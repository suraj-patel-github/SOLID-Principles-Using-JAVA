package SRP;


public class NotificationService {
    public  void sendOTP(String medium) {
        if (medium.equals("email")) {
            // some email related logic
            System.out.println("OTP via Email");
        }
        if (medium.equals("mobile")) {
            // some logic for mobile otp
            System.out.println("OTP via mobile");
        }
    }
}
