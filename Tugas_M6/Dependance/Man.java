package Dependance;

public class Man {
	String name;
	Man(String name){
		this.name = name;
	}
	Man(String name,Rod Tool){
		this.name = name;
		Tool.catchFishByRod();
	}
	public void catchFishByHand() {
		System.out.println("Caught a fish using barehand!");
	}
}
