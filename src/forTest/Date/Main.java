package forTest.Date;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("Разница дат: " + (date2.getTime()-date1.getTime()) + " ms");
    }
}
