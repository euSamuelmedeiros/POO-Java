package SformataçãoTest;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        // System.out.println(Calendar.getInstance());
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
         LocalDate data = LocalDate.of(2026, Month.MARCH, 2);
        System.out.println(data.getYear());
        System.out.println(data.getMonth());
        System.out.println(data.getMonthValue());
        System.out.println(data.getDayOfWeek());
        System.out.println(data);

    }
}
