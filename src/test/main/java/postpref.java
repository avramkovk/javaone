package test.main.java;

public class postpref {
    public static void main(String[] args) {
        int a = 6, b = 4;
        a = ++a + b++ + a++;
        int c = --a + b--;
        System.out.println(a + "+" + b + "+" + c);
    }
}
