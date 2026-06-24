package immersion.BankSystem;

public class InsufficientBalanceException
        extends Exception {

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}