package cars;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Car car = new Car(motor);

        Dashboard.printDashboard(car);
        car.accelerate();
        Dashboard.printDashboard(car);
        car.stop();
        Dashboard.printDashboard(car);
    }
}
