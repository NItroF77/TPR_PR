package Task2;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Shape("purple",false);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		Square sq1 = new Square();
		System.out.println(sq1.toString());
	}
}
