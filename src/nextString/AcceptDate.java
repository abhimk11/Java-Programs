package nextString;

import java.time.LocalDate;
import java.util.Date;

public class AcceptDate {

    static void dateAccept(LocalDate date){
        System.out.println("Duration in Days: "+ date.getDayOfYear());
        System.out.println("Duration (Date) in Day of the Month: "+ date.getDayOfMonth());
        System.out.println("Duration in Months: "+ date.getMonth());
        System.out.println("Duration in Years: " + date.getYear());
    }

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        dateAccept(localDate);
    }
}
