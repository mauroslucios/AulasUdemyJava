package AulasUdemyJava.exercicios.poo;

public class Retangulo {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width * 2.0)+(height * 2.0);
	}
	
	public double diagonal() {
		return Math.sqrt((width * width) + (height + height));
	}
}
