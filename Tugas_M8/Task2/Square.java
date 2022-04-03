package Task2;

public class Square extends Rectangle{
	Square(){
		super(1.0,1.0);
	}
	Square(double side){
		super(side,side);
	}
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	@Override 
	public void setLength(double side){
		super.setLength(side);
		super.setWidth(side);
	}
	@Override
	public double getArea() {
		return super.getWidth()*super.getWidth();
	}
	@Override
	public double getPerimeter() {
		return super.getWidth()*4;
	} 
	@Override
	public String toString() {
		return "A Square with side="
				+ getWidth()
				+ ", which is a subclass of "
				+ super.toString();
	}
}
