package lab;

public class Main {

	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		// Display results
		System.out.println("Circle1 area: " + c1.getArea()); 
		System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
		System.out.println(
			"Does circle1 contain the point (3, 3)? " + c1.contains(3, 3)); 
		System.out.println(
			"Does circle1 contain the circle centered at (4, 5) and radius 10.5? " 
			+ c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(
			"Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " 
			+ c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}

class Circle2D {
	double x, y, r;
	
	Circle2D(){
		this.x = 0.0;
		this.y = 0.0;
		this.r = 1;
	}
	
	Circle2D(double x1, double y1, double r1){
		this.x = x1;
		this.y = y1;
		this.r = r1;
	}
	
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	double getRadius() {
		return r;
	}
	
	double getArea() {
		return 3.14 * r * r;
	}
	
	double getPerimeter() {
		return 2 * 3.14 * r;
	}
	
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < r;
	}

	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= Math.abs(r - circle.getRadius());
	}
	
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= r + circle.getRadius();
	}
}
