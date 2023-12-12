package cars;

public class Car {
	private Motor motor;

	public Car() {
		this.motor = new Motor();
	}

	public void accelerate() {
		this.motor.accelerate();
	}

	public void stop() {
		this.motor.stop();
	}

	public String getStats() {
		return motor.getStats();
	}
}
