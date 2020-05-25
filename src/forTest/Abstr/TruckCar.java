package forTest.Abstr;

public class TruckCar extends AbstractCar{
    @Override
    public void ring() {
        System.out.println( name + ": TRUCK!!!!");
    }

    public static void main(String[] args) {
        TruckCar truck = new TruckCar();
        truck.name = "VW";

        truck.ring();
    }
}
