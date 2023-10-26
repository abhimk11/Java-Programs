package bank.caseStudy;

public class SavingsAcc extends Account{
    final int minBal=500;
    @Override
    public void withdraw(double amt) {
        if (getBalance()>minBal && (getBalance()-amt>minBal)){
            setBalance(getBalance()-amt);
        }
        else {
            System.out.println(amt + " ,Account transaction can't process less than Minimum Balance: "+minBal);
        }
    }
}
