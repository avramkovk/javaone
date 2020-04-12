package forTest.innerClasses;

public class Main {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Peugeot", 120, 40);
        Bicycle.Seat seat = bicycle.new Seat();


    }
}