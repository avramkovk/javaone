package test.exampleLesson6.main.java;

import java.util.Scanner;
public class sum {

        public static void main(String[] args) {
            Scanner first = new Scanner(System.in);
            Scanner second = new Scanner((System.in));

            System.out.println("Введите первое число: ");
            int a = first.nextInt();
            System.out.println("Введите второе число: ");
            int b = second.nextInt();


            System.out.println("Сумма чисел равна: " + mySum(a,b));
            //напишите тут ваш код
        }

        public static int mySum(int a, int b) {
            return a + b;
        }
    }

