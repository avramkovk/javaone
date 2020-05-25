package forTest.example;

public class StringTest {
    private static char[] num = {'a','b','c','d','e'};
    private static String str = new String(num,1,2);

    public static void main(String[] args) {
        System.out.println(str);
    }
}
