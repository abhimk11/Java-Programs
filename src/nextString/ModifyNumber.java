package nextString;

import java.util.Scanner;

public class ModifyNumber {

    static int modifyNumber(int number){
        String numberStr = String.valueOf(number);
        StringBuilder modifiedDigits = new StringBuilder();
        for (int i=0;i<numberStr.length()-1;i++)
        {
            int difference = Math.abs(Character.getNumericValue(numberStr.charAt(i)) -
                    Character.getNumericValue(numberStr.charAt(i+1)));
            modifiedDigits.append(difference);
        }
        modifiedDigits.append(numberStr.charAt(numberStr.length()-1));
        int modifiedNumber = Integer.parseInt(modifiedDigits.toString());
        return modifiedNumber;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int modified = modifyNumber(number);
        System.out.println(modified);
    }
}
