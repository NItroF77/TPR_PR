package Dependance;

public class RidingVehicle {
	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car",4);
		move move = new move(car);
		move.accelerate();
		move.deccelerate();
	}
}
