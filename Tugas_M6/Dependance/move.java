package Dependance;

public class move {
	Vehicle vehicle;
	move(Vehicle vehicle){
		this.vehicle = vehicle;
	}
	public void accelerate() {
		System.out.println("Accelerating...");
	}
	public void deccelerate() {
		System.out.println("Deccelerating...");
	}
}
