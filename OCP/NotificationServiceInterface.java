package OCP;


/*Here we are creating an interface and defining the methods which needs to be implemented.
Here we are achieving ocp, let say some new service facebookNotificationService comes then
we do not need to modify the existing logic, but we are open to expand*/
public interface NotificationServiceInterface {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);
}
