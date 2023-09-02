package exercicios5;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		double result = width * height;
		return result;
	}
	
	public double perimetro() {
		double perimeter = width + width + height + height;
		return perimeter;
	}
	
	public double diagonal() {
		double d = Math.sqrt((height* height) + (width * width));
		return d;
	}
}
