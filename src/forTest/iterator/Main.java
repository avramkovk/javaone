package forTest.iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("asd");
        set.add("a2sd");
        set.add("a1sd");
        set.add("1asd");

        System.out.println("Вывод множества на экран при помощи итератора");
        Iterator<String> iteratorSet = set.iterator();//получение итератора для списка
        while (iteratorSet.hasNext()) {//проверка, есть ли ещё элементы
            System.out.println(iteratorSet.next());//получение текущего элемента и переход на следующий
        }
        System.out.println("Вывод множества на экран при помощи foreach");

        for (String x : set) {
            System.out.println(x);
        }

        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");

        System.out.println("Вывод карты на экран при помощи итератора");
        Iterator<Map.Entry<String, String>> iteratorMap = map.entrySet().iterator();
        while (iteratorMap.hasNext()) {
            System.out.println(iteratorMap.next());
        }
        System.out.println("Вывод множества на экран при помощи foreach");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
