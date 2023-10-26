package nextString;

import java.util.Scanner;

public class ReadInte {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.trim().split(" ");
        int sum = 0;
        System.out.println("The Numbers are: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println("The Sum is: " + sum);

    }
}
