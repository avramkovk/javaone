package forTest.example;

//Угадай букву
public class class2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'k';
        do {
            System.out.println("Загадана буква диапазоне от A до Z");
            System.out.print(" какая это буква ? ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** ВЕРНО**");
            else {
                System.out.print(" НЕВЕРНО. Нужная буква находится ");
                if (ch < answer) System.out.println("ближе к концу");
                else System.out.println("ближе к началу");
                System.out.println("Try again!\n");
            }
        } while (answer != ch);
    }
}
/*
public class class2 {
    public static void main(String[] args) throws IOException {
        String ch;
        String secret = "h";
        boolean success = false;
        System.out.println("Угадай букву: ");
        Scanner sc = new Scanner(System.in);

        while (!success) {
            ch = sc.next().toLowerCase();
            if(ch.equals(secret)){
                System.out.println("Верно");
                success = true;
            }else System.out.println("Повторите, попытку.");
        }
    }
}*/
