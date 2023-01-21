package Interface;

public class Main {
    public static void main(String[] args) {

        HDFC b= new HDFC();
        b.onAccountBalance("abcdefghijk");
        b.onDepositeFunds();
        b.onTransferFunds();
        b.securityInfo("----->  TCS");
    }
}
