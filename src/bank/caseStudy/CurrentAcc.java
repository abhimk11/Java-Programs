package bank.caseStudy;

public class CurrentAcc extends Account{
    int overDraftLimit = 500;
    @Override
    public void withdraw(double amt) {
        if (getBalance()>overDraftLimit && (getBalance()-amt>overDraftLimit)){
            System.out.println("False, Overdraft Limit Not Reached!!!");
        }
        else {
            System.out.println("True, Overdraft Limit Reached!!!");
        }
    }
}
