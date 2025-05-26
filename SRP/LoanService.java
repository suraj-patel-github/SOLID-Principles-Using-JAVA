package SRP;

public class LoanService {
    public void getLoanInterstInfo(String loanType) {
        if(loanType.equals("homeloan")) {

            // write logic
            System.out.println("Homeloan");
        }
        if (loanType.equals("personalLoan")) {
            // some logic
            System.out.println("personal loan");
        }
        if (loanType.equals("carLoan")) {
            // some logic will be there
            System.out.println("Car loan");
        }
    }
}
