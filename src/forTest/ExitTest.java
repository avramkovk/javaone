package forTest;

import java.util.Scanner;

public class ExitTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a==1) {
            System.out.println("A");
        }
            else if (a==0){
                System.exit(0);
            }
        }
    }

