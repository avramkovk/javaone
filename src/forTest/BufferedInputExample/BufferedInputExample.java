package forTest.BufferedInputExample;

import java.io.*;

public class BufferedInputExample {
    public static void main(String[] args) throws IOException {
        DataOutputStream os = new DataOutputStream(new FileOutputStream("src\\forTest\\BufferedInputExample\\test.txt"));
       os.writeUTF("hhh hhh");
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;

        inputStream = new FileInputStream("src\\forTest\\BufferedInputExample\\test.txt");
    bufferedInputStream = new BufferedInputStream(inputStream);
    while (bufferedInputStream.available() > 0){
        System.out.print((char)bufferedInputStream.read());
    }
    inputStream.close();
    bufferedInputStream.close();
    }
}
