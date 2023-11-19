package cars;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Dashboard.printDashboard(car.getStats());
        car.accelerate();
        Dashboard.printDashboard(car.getStats());
        car.stop();
        Dashboard.printDashboard(car.getStats());
    }
}
