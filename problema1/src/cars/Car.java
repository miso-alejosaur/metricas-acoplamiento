package cars;

public class Car implements IPrintable{
	private IMotor motor;

	public Car(IMotor motor) {
		this.motor = motor;
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
