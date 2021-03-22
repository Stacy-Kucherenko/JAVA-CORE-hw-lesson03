package lviv.ua.lgs;

public class Circle {

	private double radius;
	private double diameter;
	
	public Circle() {
		
	}
	
	public Circle (double radius, double diameter) {
		this.diameter = diameter;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getCircleLength() {
		return 2  * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle area = " + getArea() + "; Circle length = "
				+ getCircleLength();
	}
	
	
	
	
}
