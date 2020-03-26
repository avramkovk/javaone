package forTest.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exampleRegex {
    public static void main(String[] args) {
        String text = "Егор Алла Александр";
        Pattern pattern1 = Pattern.compile("А.+а");
        Matcher matcher1 = pattern1.matcher(text);
        Pattern pattern2 = Pattern.compile("А.++а");
        Matcher matcher2 = pattern2.matcher(text);
        Pattern pattern3 = Pattern.compile("А.+?а");
        Matcher matcher3 = pattern3.matcher(text);
        System.out.println("1--------------------------------------");
        while (matcher1.find()) {
            System.out.println(text.substring(matcher1.start(), matcher1.end()));
        }
        System.out.println("2--------------------------------------");
        while (matcher2.find()) {
            System.out.println(text.substring(matcher2.start(), matcher2.end()));
        }
        System.out.println("3--------------------------------------");
        while (matcher3.find()) {
            System.out.println(text.substring(matcher3.start(), matcher3.end()));
        }
    }
}
