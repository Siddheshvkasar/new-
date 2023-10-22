package BankAccountConsole;

public class MMCurrentAcc extends CurrentAcc {
    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + getCreditLimit() >= amount) {
            setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Amount is not available and credit limit.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
