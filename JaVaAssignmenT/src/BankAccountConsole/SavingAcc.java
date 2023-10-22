package BankAccountConsole;

public abstract class SavingAcc extends BankAcc {
    private boolean isSalary;
    private static final float MINBAL = 1000.0f;
    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
        super(accNo, accNm, accBal);
        this.isSalary = isSalary;
    }
    @Override
    public abstract void withdraw(float amount);
    @Override
    public String toString() {
        return "Savings Current["+super.toString() + ", Salaried: " + isSalary+"]";
    }
}