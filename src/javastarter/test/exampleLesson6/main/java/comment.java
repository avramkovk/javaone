package javastarter.test.exampleLesson6.main.java;
/*
*
* Задача - 2. Создайте комментарий, который будет выполнятся.
* Есть один хитрый способ, как заставить Java-машину «легально» запустить комментарий на выполнение.
*
*
 */
public class comment {
    public static void main(String[] args) {
        // комментарий ниже будет выполнен!
        // \u000d System.out.println("выполняемый комментарий");
        // Причина в том, что компилятор Java считывает Unicod-символ как новую строку
    }
}