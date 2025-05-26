package OCP;

public class WhatsappNotificationService implements NotificationServiceInterface{

    @Override
    public void sendOTP(String medium) {
        System.out.println("otp via whatsapp");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("reports via whats app");
    }
}
