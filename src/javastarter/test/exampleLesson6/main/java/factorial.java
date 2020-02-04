package javastarter.test.exampleLesson6.main.java;

public class factorial {
    public static void main(String[] args) {
        int count = 5;
        int factorial = 1;
        System.out.print("факториал " + count + "! = ");
        do{
            factorial *= count--;
        } while (count > 0);
        System.out.println(factorial);
    }
}
