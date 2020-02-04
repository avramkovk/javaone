package javastarter.test.exampleLesson6.main.java;

import java.util.Scanner;

public class mySpiderLoop {
    public static void main(String[] args) {
        char myChar;
        Scanner value = new Scanner(System.in);

        for(;;){
            myChar = value.next().charAt(0);

                switch (myChar) {
                    case 'A': {
                        System.out.println("AAAAAAAAAAAAAAAAAAAA");
                        continue;
                    }
                    case 'B': {
                        System.out.println("BBBBBBBBBBBBBBBBBBBB");
                        continue;
                    }
                }
                    switch (myChar){
                        case 'x': {
                            System.out.println("exit. Выход из программы.");
                            break;
                        }
                            case 'y': {
                                System.out.println("stop. Выход из программы.");
                                break;
                        }
                        default:{
                            System.out.println("Не выполнено ни одно из условий. Выход из программы.");
                    }
                }
                break;
            }
        }
    }

