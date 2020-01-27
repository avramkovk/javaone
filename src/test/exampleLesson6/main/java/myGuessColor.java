package test.exampleLesson6.main.java;

import java.util.Scanner;

public class myGuessColor {
    public static void main(String[] args) {
        System.out.println("Угадайте цвет");
        System.out.println("Для выхода из программы введите - exit");

        final int MAX = 10;
        int count = 0;
        String color = "black";
        Scanner myColor = new Scanner(System.in);

        while (count < MAX){
            count++;
            System.out.println("попытка " + count);
            String value = myColor.next();

            if(value.equals("exit")){
                break;
            }
            if(!value.equals(color)){
                continue;
            }
            System.out.println("Число угадано с попытки " + count);
            break;
        }
        System.out.println("конец игры");
    }
}
