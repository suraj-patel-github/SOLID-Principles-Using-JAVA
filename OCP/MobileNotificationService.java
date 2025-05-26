package OCP;

public class MobileNotificationService implements NotificationServiceInterface{

    @Override
    public void sendOTP(String medium) {
        System.out.println("send OTP via mobile");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("send transaction reports via mobile");
    }
}
