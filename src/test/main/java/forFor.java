package test.main.java;

public class forFor {
    public static void main(String[] args) {

        //прямоугольник 5 на 10
/*
        for(int i=0; i<5; i++){

            for(int j=0; j<10; j++){
                System.out.print("+");
            }
            System.out.println();
        }
*/

        System.out.println("-------------------------------------------------------");

        //треугольник
        for(int i=0; i<5; i++){

            for(int j=0; j<i; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
