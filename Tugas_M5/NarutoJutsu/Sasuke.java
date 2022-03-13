package NarutoJutsu;

public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	void printDojutsu() {
		super.printDojutsu(); 	//add super to call a methods from parent (itachi)
								//not really, he's sasuke's brother not parent.
		System.out.println(this.Dojutsu);
	}
}