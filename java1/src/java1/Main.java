package java1;
import java.util.Arrays;
import java.util.Scanner;
 abstract class Shape{
     private double PI = 3.14;
     public abstract double getPerimeter();
     public abstract double getArea();
}
class Circle extends Shape{
	private int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public double getPerimeter(){
		return 2*(int)(Math.PI)*radius;
	}
	public double getArea(){
		return (int)(Math.PI*radius*radius);
	}
	public String toString(){
		return String.format("Circle [radius =%d]",radius);
	}
}
class Rectangle extends Shape{
	private int width;
	private int length;
	public Rectangle(int width,int length){
		this.width = width;
		this.length = length;
	}
	public double getPerimeter(){
		return 2*(width + length);
	}
	public double getArea(){
		return width*length;
	}
	public String toString(){
		return String.format("Rectangle [width=%d,length=%d]",width,length);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i=0;
	    Shape[] shape = new Shape[n];
		while(i==n){
			String s =sc.next();
			if(s.equals("rect")){
			shape[i] = new Rectangle(sc.nextInt(), sc.nextInt());
			}
			if(s.equals("cir")){
			shape[i] = new Circle(sc.nextInt());
			}
			i++;
		}
	}

}
