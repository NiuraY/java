package java1;
import java.util.Scanner;
//public class test{
//	private double radius;
//	public void setRadius(double radius){
//		this.radius = radius;
//	}
//	public double getRadius(){
//		return radius;
//		
//	}
//	public void showAre(){
//		System.out.println(Math.PI*radius*radius);
//	}
//	public static void main(String[] args){
//		
//		test a = new test();
//		Scanner sc = new Scanner(System.in);
//		double a1 = sc.nextDouble();
//		a.setRadius(a1);
//		a.showAre();
//	}
//}
//public class test{
//	public test(){
//		System.out.println("test is xxxxxxx");
//	}
//	public static void main(String args[]){
//		test a1 = new test();
//	}
//}
//class test{
//	private double radius;
//	public test(double radius){
//		this.radius = radius;
//	}
//	public void setRadius(double radius){
//	this.radius = radius;
//}
//	public static void main(String[] args){
//		final test ci = new test(10);
//		System.out.println(ci.radius);
//		ci.setRadius(20);
//		System.out.println(ci.radius);
//	}
//}
import java.util.Scanner;
class Person{
	private String name;
	private boolean gender;
	private int age;
	private int id;
	
	public Person(){
		
		System.out.println("This is constructor");
		System.out.println(name+","+age+","+gender+","+id);
	}
	public void getall(){
		System.out.println("This is constructor");
		System.out.println(name+","+age+","+gender+","+id);		
	}
	
	public Person(String name,int age,boolean gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public Person(int id){
		this.id=id;
	}
	
	public String getString(){
		return("This is static initialization block");
	}
	public String geString2(){
		return ("This is initialization block ,id is");
	}

        public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}
    
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		return String.format("Person [name=%s, age=%d, gender=%s, id=%d]",name,age,gender,id);
	}

	public char[] person() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class test {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		Person[] persons=new Person[n];
		for(int i=0;i<persons.length;i++){
			String name=in.next();
			int age =in.nextInt();
			boolean gender=in.nextBoolean();
	        persons[i]=new Person(name,age,gender);
		}
		System.out.println(persons[1].getString());
		for(int i = 0;i<persons.length;i++){
			System.out.println(persons[i].geString2()+" "+i);
			persons[i].setId(i);
		}
		for(int i=persons.length-1;i>=0;i--){
			System.out.println(persons[i].toString());
		}
		int a =3;
Person s=new Person(a);
System.out.println(s.geString2()+" "+a);
s.getall();
System.out.println(s);
	}

	
}