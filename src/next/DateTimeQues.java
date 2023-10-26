package next;

import java.time.LocalDate;

public class DateTimeQues {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015,8,5);
        String ls = localDate.getDayOfWeek().toString();
       // String s  = ls.toString();
        System.out.println(ls);
    }
}
