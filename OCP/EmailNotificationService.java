package OCP;

public class EmailNotificationService implements NotificationServiceInterface {

    @Override
    public void sendOTP(String medium) {
        System.out.println("send otp via email");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("send transaction report via email");
    }
}
