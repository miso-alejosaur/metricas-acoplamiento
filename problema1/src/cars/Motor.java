package cars;

public class Motor implements IMotor {
	
	public int speed;
	public int rpm;
	public float oilLevel;
	public float gasLevel;
	
	public Motor() {
		
	}

	public void stop() {
		this.rpm -= 0;
		this.speed -= 0;
		this.oilLevel -= 0.1;
		this.gasLevel -= 0;
	}

	public void accelerate() {
		this.rpm += 100;
		this.speed += 10;
		this.oilLevel -= 0.1;
		this.gasLevel -= 0.5;
	}

	public String getStats() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------------------------");
		sb.append("\nDASHBOARD:");
		sb.append("\n\t RPM: " + this.rpm);
		sb.append("\n\t Speed: " + this.speed);
		sb.append("\n\t Oil level: " + this.oilLevel);
		sb.append("\n\t Gas level: " + this.gasLevel);

		return sb.toString();
	}
}
