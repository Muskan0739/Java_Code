//package Java_API;

import java.time.*;

public class DT2 {
    public static void main(String[] args) {
        LocalDate ld= LocalDate.now();
        System.out.println(ld);

        int day=ld.getDayOfMonth();
        int month=ld.getMonthValue();
        int year=ld.getYear();
        int dayOfYear= ld.getDayOfYear();

        System.out.println(day + "/" + month + "/"+ year + "/"+ dayOfYear);

        LocalTime lt= LocalTime.now();

        System.out.println(lt);

        int hour= lt.getHour();
        int min= lt.getMinute();
        int second =lt.getSecond();
        System.out.println(hour + ":" + min + ":" + second);

    }
}
