package forTest.Abstr;

public class B extends A{
    @Override
    public void run() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.run();
    }
}
