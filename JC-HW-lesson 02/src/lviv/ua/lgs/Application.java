package lviv.ua.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle (2.2, 3.3);
		
//		System.out.println(r1);
//		System.out.println(r2);
		
		r1.setLength(20.2);
		r1.setWidth(0.5);
		System.out.println(r1);
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(1.1, 2.0);
		
//		System.out.println(c1);
//		System.out.println(c2);
		
		c1.setDiameter(0.2);
		c1.setRadius(2.2);
		System.out.println(c1);
	}
	
}
