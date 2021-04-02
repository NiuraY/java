package java1;
import java.util.Arrays;
import java.util.Scanner;
class Circle{
	private int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public int getPerimeter(){
		return 2*(int)(Math.PI)*radius;
	}
	public int getArea(){
		return (int)(Math.PI*radius*radius);
	}
	public String toString(){
		return String.format("Circle [radius =%d]",radius);
	}
}
class Rectangle{
	private int width;
	private int length;
	public Rectangle(int width,int length){
		this.width = width;
		this.length = length;
	}
	public int getPerimeter(){
		return 2*(width + length);
	}
	public int getArea(){
		return width*length;
	}
	public String toString(){
		return String.format("Rectangle [width=%d,length=%d]",width,length);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle[] re = new Rectangle[2];
		Circle[] cc = new Circle[2];
		re[0] = new Rectangle(sc.nextInt(),sc.nextInt());
		re[1] = new Rectangle(sc.nextInt(),sc.nextInt());
		cc[0] = new Circle(sc.nextInt());
		cc[1] = new Circle(sc.nextInt());
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0;i<2;i++){
			sum1+=re[i].getPerimeter()+cc[i].getPerimeter();
			sum2+=re[i].getArea()+cc[i].getArea();
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(Arrays.deepToString(re));
		System.out.println(Arrays.toString(cc));
	}

}
