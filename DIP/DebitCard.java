package DIP;

//public class DebitCard {
//
//    public void doTransaction(long amount) {
//        System.out.println("payment using debit card");
//    }
//}

public class DebitCard implements BankCard{

    @Override
    public void doTrasaction(long amount) {
        System.out.println("payment using debit card");
    }
}