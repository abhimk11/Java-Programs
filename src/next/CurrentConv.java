package next;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrentConv {
    public static void main(String[] args) {
        double payment = 12324.134;
        Locale locale = new Locale("en","IN");
        //Locale US = new Locale("en","US");

        NumberFormat india = NumberFormat.getCurrencyInstance(locale);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat kor = NumberFormat.getCurrencyInstance(Locale.KOREAN);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat taiwan = NumberFormat.getCurrencyInstance(Locale.TAIWAN);

        System.out.println("Taiwan: "+taiwan.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("US: "+ us.format(payment));
        System.out.println("Korea: " + kor.format(payment));
        System.out.println("Canada: "+ china.format(payment));
    }
}
