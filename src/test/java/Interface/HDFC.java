package Interface;

public class HDFC implements Bank {

    public void onAccountBalance(String ACCOUNTTYPEONE) {
        System.out.println("in the account balance  "+ACCOUNTTYPEONE);
    }

    public void onTransferFunds() {

    }

    public void onDepositeFunds() {

    }

    public void securityInfo(String companyInfo) {
        System.out.println("company information  --- "+companyInfo);

    }


}
