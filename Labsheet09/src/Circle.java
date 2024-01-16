
public class Circle {
	//public constant
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//define 2 private attribute
	private double radius;
	private String color;
	
	//Default Constructor
	Circle() {
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//constructor with parameter radius and default color
	Circle(double radius){
		this.radius=radius;
		this.color = DEFAULT_COLOR;
	}
	Circle(double radius,String color){
		this.radius=radius;
		this.color =color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return "Circle[radius="+radius+", color="+color+"]";
	}
	public double getArea() {
		return Math.PI*getRadius()*getRadius();
	}
	public double getCircumference() {
		return 2.0*Math.PI*getRadius();
	}

}
