package java8;

public class doloop {
    public static void main(String[] args) {
        int iVal = 80;
        do{
            System.out.println(iVal);
            System.out.println(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        }while(iVal<25);
    }

}
