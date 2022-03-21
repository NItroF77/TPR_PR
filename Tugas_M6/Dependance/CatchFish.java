package Dependance;

public class CatchFish {
	public static void main(String[] args) {
		Rod rod = new Rod();
		Man p1 = new Man("Udin",rod);
		p1.catchFishByHand();
	}
}
