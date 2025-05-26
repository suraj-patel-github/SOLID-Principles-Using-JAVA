package DIP;

public class ShoppingMall {

   /* private DebitCard debitCard;
    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }
    public void doPurchaseSomething(long amount) {
        debitCard.doTransaction(amount);
    }*/

    // now we create an instance of BankCard
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount) {
        bankCard.doTrasaction(amount);
    }


    public static void main(String[] args) {
        // with debit card
       /* DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000);*/

        // if I want to change from debit to credit card then I will have to change in many position.
        // CreditCard creditCard = new CreditCard();

        // to overcome this we will create a new interface

/*
        now we can use debitCard or creditCard in by changing only one line only because
        debitCard and creditCard are children class of bankCard.
*/
//        BankCard bankCard  = new DebitCard();
        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);


    }
}
