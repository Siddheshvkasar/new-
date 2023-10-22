package BankAccountConsole;

public abstract class BankAcc {
    private int accNo;
    private String accNm;
    private float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccBal(float accBal) {
        this.accBal = accBal;
    }

    public float getAccBal() {
        return accBal;
    }

    public abstract void withdraw(float amount);
    public void deposit(float amount) {
        accBal += amount;
    }

    @Override
    public String toString() {
        return "Account No: " + accNo + ", Account Name: " + accNm + ", Balance: " + accBal;
    }
}