package nextException;

import java.util.Scanner;

public class ValidateFullName {

    public static void main(String[] args) throws blankNameException {
        System.out.println("Enter The First Name of the Try.Employee: ");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        System.out.println("Enter The Last Name of the Try.Employee: ");
        String lastName = sc.nextLine();

        if (firstName.isBlank()) {
            throw new blankNameException("First Name is Blank");
        } else if (lastName.isBlank()) {
            throw new blankNameException("Last Name is Blank");
        } else {
            System.out.println("Name is :" + firstName + " " + lastName);
        }
    }
}

class blankNameException extends Exception {
    public blankNameException(String str) {
        super(str);
    }
}
