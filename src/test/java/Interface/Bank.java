package Interface;

public interface Bank {

    String ACCOUNTTYPEONE = "savings";
    String ACCOUNTTYPETWO = "current";

    void onAccountBalance(String ACCOUNTTYPEONE);

    void onTransferFunds();
    void onDepositeFunds();

    void securityInfo(String companyInfo);

}
