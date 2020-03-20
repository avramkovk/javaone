package forTest.app;

import javax.swing.*;
import java.io.IOException;
import java.util.Random;

public class App {



    public static void main(String[] args) {
        Random random = new Random();
        try {
            String a = ABC.values()[random.nextInt(5)].toString();
            System.out.println(a);
        }catch (ExceptionInInitializerError  e){
            System.out.println("Ошибка: исключение ExceptionInInitializerError");
        }catch ( ArrayIndexOutOfBoundsException  e){
            System.out.println("Ошибка: исключение ArrayIndexOutOfBoundsException");
        }
    }
}
