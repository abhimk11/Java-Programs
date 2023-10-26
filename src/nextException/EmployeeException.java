package nextException;

import java.util.Scanner;

public class EmployeeException {

    public static void main(String[] args) throws SalaryLowException {
        System.out.println("Enter salary of Try.Employee: ");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        if (salary < 3000) {
            throw new SalaryLowException("Given salary is less than 3000");
        } else {
            System.out.println("Salary is: " + salary);
        }
    }
}

class SalaryLowException extends Exception {
    public SalaryLowException(String msg) {
        super(msg);
    }
}
