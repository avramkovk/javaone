package test.exampleLesson7.main.java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sumProcedure {
    public static void main(String[] args) {

        Scanner aValue = new Scanner(System.in);
        Scanner bValue = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int aNumber = aValue.nextInt();
        System.out.println("Введите первое число: ");
        int bNumber = bValue.nextInt();

        System.out.println("Сумма чисел равна " + procedure(aNumber,bNumber));

    }

    static int procedure(int aNumber, int bNumber){
        return aNumber + bNumber;
    }
}
