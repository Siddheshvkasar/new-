package BankAccountConsole;

public class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 1000.0f;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
