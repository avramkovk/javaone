package javastarter.test.exampleLesson7.main.java;


public class rectProcedure {

    static void rect(int a){
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
rect(4); // а - высота прямоугольника

    }
}
