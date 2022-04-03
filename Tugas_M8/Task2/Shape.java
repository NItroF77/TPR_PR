package Task2;

public class Shape {
	private String color;
	private boolean filled;
	Shape(){
		this.color = "green";
		this.filled = true;
	}
	Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public boolean isFilled() {
		return this.filled;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		if(this.filled)
			return 	"A Shape with color of " 
					+ this.color 
					+ " and filled";
		
		return 	"A Shape with color of " 
		+ this.color 
		+ " and Not filled";
	}
}
