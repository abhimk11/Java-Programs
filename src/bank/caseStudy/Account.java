package bank.caseStudy;

public class Account {
    private long accNum;
    private double balance;

    private Person accHolder;

    @Override
    public String toString() {
        return "Account{" +
                "accNum=" + accNum +
                ", balance=" + balance +
                ", accHolder=" + accHolder +
                '}';
    }

    public void deposit(double amt){
        balance=balance+amt;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    public void withdraw(double amt){
        balance=balance-amt;
    }

    public double getBalance(){
        return balance;
    }
}
