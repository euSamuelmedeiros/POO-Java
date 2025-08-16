
import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); // mostra sau data e hora
        df[1] = DateFormat.getDateInstance();// mostra sua data e o ano
        df[2] = DateFormat.getDateTimeInstance();// data
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);//
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);//
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);//
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);// data com dia da semana

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }

}
