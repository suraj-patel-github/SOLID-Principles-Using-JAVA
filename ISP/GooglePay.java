package ISP;

public class GooglePay implements UPIPayments, CashBackManager {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAcCreditBalance() {
        // gpay supports this feature
    }
}
