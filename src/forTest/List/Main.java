package forTest.List;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Double> listA = new ArrayList<>();
        List<Double> listL = new LinkedList<>();
        Map<Long,Long> map = new HashMap<>();
        int index = 600000;
long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            listA.add(Math.random());
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Время заполнения ArrayList: " + (time2-time1));

        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            listL.add(Math.random());
        }
        long time4 = System.currentTimeMillis();
        System.out.println("Время заполнения LinkedList: " + (time4-time3));

        long timeA100000_start = System.currentTimeMillis();
            listA.remove(index);
        long timeA100000_end = System.currentTimeMillis();
        System.out.println("Время вставки 100_000-го элемента в ArrayList: " + (timeA100000_end-timeA100000_start));

        long timeL100000_start = System.currentTimeMillis();
            listL.remove(index);
        long timeL100000_end = System.currentTimeMillis();
        System.out.println("Время вставки 100_000-го элемента в LinkedList: " + (timeL100000_end-timeL100000_start));
    }
}
