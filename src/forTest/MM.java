package forTest;

import java.util.Random;

public class MM {
    public static void main(String[] args) {
        Random r = new Random();
int[] ints = {0,3,0,50,0};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println("pppppppppppppppppp");
        while(ints[r.nextInt(ints.length)] == 0){
        for (int i = 0; i < ints.length; i++) {

                ints[r.nextInt(ints.length)] = 99;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
