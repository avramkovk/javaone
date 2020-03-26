
package forTest.example;

/*Метод boolean find() ищет очередное совпадение в тексте с шаблоном. С помощью этого метода и оператора цикла
можно производить анализ всего текста по событийной модели (осуществлять необходимые операции при наступлении
события – нахождении совпадения в тексте). Например, с помощью методов этого класса int start() и int end()
можно определять позиции совпадения в тексте, а с помощью методов String replaceFirst(String replacement)
и String replaceAll(String replacement) заменять в тексте совпадения на другой текст replacement. */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exampleRegex4 {
    public static void main(String[] args) {
        String text = "Егор Алла Анна";
        Pattern pattern = Pattern.compile("А.+?а");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }
        System.out.println(matcher.replaceFirst("Ира"));
        System.out.println(matcher.replaceAll("Ольга"));
        System.out.println(text);
    }
}
