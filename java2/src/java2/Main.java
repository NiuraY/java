package java2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		PersonSortable2[] per = new PersonSortable2[n];
		for(int i = 0;i<n;i++){
			per[i]= new PersonSortable2(sc.next(),sc.nextInt());
		}
		Arrays.sort(per, new NameComparator());
		System.out.println("NameComparator:sort");
		for(int j=0;j<n;j++){
			System.out.println(per[j]);
		}
		Arrays.sort(per,new AgeComparator());
		System.out.println("AgeComparator:sort");
		for(int j=0;j<n;j++){
			System.out.println(per[j]);
		}
		sc.close();
		System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
		System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));
	}

}
class PersonSortable2{
	private String name;
	private int age;
	public PersonSortable2(String name,int age){
		setName(name);
		setAge(age);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
    public String toString(){
    	return name+"-"+age;
    }
}
class NameComparator implements Comparator<PersonSortable2>{

	@Override
	public int compare(PersonSortable2 o1, PersonSortable2 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class AgeComparator implements Comparator<PersonSortable2>{

	@Override
	public int compare(PersonSortable2 o1, PersonSortable2 o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
	
}