package forTest.example;

import com.sun.security.jgss.GSSUtil;

import java.io.IOException;

public class switchClass {
    public static void main(String[] args) throws IOException {
        char choice;

        System.out.println("1. AAA");
        System.out.println("2. BBB");
        System.out.println("Ввод: ");
        choice = (char) System.in.read();

        switch (choice){
            case '1':
                System.out.println("Выбран вариант 1");
                break;
            case '2':
                System.out.println("Выбран вариант 2");
                break;
            default:
                System.out.println("Повторите попытку");
        }
    }
}
