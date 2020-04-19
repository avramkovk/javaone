package forTest.LocalDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {

/*        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = "16/08/2016";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
        System.out.println(formatter.format(localDate));*/

/*        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        String date = "May 1 2000";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
        System.out.println(formatter.format(localDate));*/

        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        String date = "MAY 1 2000";
        Date date1 = dateFormat.parse(date);
        System.out.println(date1);
    }
}