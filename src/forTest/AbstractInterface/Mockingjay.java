package forTest.AbstractInterface;

public class Mockingjay extends Bird{

    @Override
    public void flay() {
        System.out.println("Лети, птичка");
    }

    public static void main(String[] args) {
        Mockingjay someBird = new Mockingjay();
        someBird.setAge(19);
        System.out.println(someBird.getAge());
    }
}
