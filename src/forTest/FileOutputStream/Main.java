package forTest.FileOutputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //запись через FileOutputStream
        //создаем объект типа File и передаем в конструкторе путь
/*        File file = new File("src\\forTest\\FileOutputStream\\test.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            String string = "Text";
            fos.write(string.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //чтение через FileInputStream
        long time1 = System.currentTimeMillis();

        try {
            FileInputStream fis = new FileInputStream("src\\forTest\\FileOutputStream\\test.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();

        System.out.println();

        //чтение через BufferedInputStream
        long time3 = System.currentTimeMillis();
        try {
            FileInputStream fis1 = new FileInputStream("src\\forTest\\FileOutputStream\\test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis1,1000);
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }

            fis1.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long time4 = System.currentTimeMillis();
        System.out.println();

        System.out.println("Время чтения файла через FileInputStream: " + (time2-time1));
        System.out.println("Время чтения файла через BufferedInputStream: " + (time4-time3));
    }
}
