package test.main.java;

import java.util.Scanner;
/*
в цикле Дейкстры нет явного условия выхода из цикла, поэтому нужно ввести цикл,
который не соответствет ни одному условию в case.
*/

public class myDijkstraLoop {
    public static void main(String[] args) {
        char myChar;
        Scanner value = new Scanner(System.in);

        for(;;){
            myChar = value.next().charAt(0); //считываем первый символ строки

            switch (myChar){
                case 'G':
                    System.out.println("GOOD");
                    continue;
                case 'N':
                    System.out.println("NOT BAD");
                    continue;
                case 'F':
                    System.out.println("FUNTASTIC");
                    continue;
            }

            System.out.println("Ни одно из условий не выполнено. Выход из циклы через break");
                break;
        }
    }
}
