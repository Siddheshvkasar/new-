package BankAccountConsole;

public class TestBankAcc {
    public static void main(String[] args) {
        BankFactory bankFactory = new MMBankFactory();

        SavingAcc savingAcc = new MMSavingAcc(101, "Ram", 5000, true);
        CurrentAcc currentAcc = new MMCurrentAcc(102, "Sita", 10000, 2000);

        savingAcc.withdraw(1000);
        currentAcc.withdraw(5000);

        System.out.println(savingAcc.toString());
        System.out.println(currentAcc.toString());
    }
}
