package ISP;

public class Paytm implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

//    @Override
//    public void getCashBackAcCreditBalance() {
//        // not applicable for paytm
//    }

}

/* Here if we force paytm class to use UPIPayments interface then paytm is forced to implement the
getCashBackAcCreditBalance, here the ISP is getting failed. To overcome this we can create another interface
like cashbacManager
* */