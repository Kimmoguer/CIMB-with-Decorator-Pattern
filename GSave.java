public class GSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    @Override
    public Double showBenefits() {
        return null;
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public String toString() {
        return "Standard Savings Account, GCash Transfer";
    }
}