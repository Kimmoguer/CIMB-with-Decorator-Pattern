public class SavingsAccount implements BankAccount {

    private String accountNumber;
    private String accountName;
    private Double balance;

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = String.valueOf(accountNumber);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }

    @Override
    public Double showBenefits() {
        return null;
    }

    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\n"
             + "Account name: " + accountName + "\n"
             + "Balance: " + balance;
    }
}