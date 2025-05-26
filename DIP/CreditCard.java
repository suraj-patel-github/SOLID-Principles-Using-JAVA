package DIP;

//public class CreditCard {
//
//    public void doTrasaction(long amount) {
//        System.out.println("payment Using Credit card");
//    }
//}

public class CreditCard implements BankCard{

    public void doTrasaction(long amount) {
        System.out.println("payment Using Credit card");
    }
}
