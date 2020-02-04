
package forTest;

/*static boolean matches(String regex, CharSequence input) –
позволяет проверить регулярное выражение, переданное в параметре regex на соответствие тексту,
переданному в параметре input. Возвращает:

true – если текст соответствует шаблону;
false – в противном случае;*/

import java.util.regex.Pattern;

public class exampleRegex2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("А.+а","Алла"));//true
        System.out.println(Pattern.matches("А.+а","Алла Александр"));//false
    }
}
