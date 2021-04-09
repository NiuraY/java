package java1;

import java.util.Scanner;
import java.util.Arrays;
class PersonSortable implements Comparable<PersonSortable>{
    private String name;
    private int age;
    public PersonSortable(String name,int age){
    	this.name = name;
    	this.age = age;
    }
	@Override
	public String toString() {
		return name+"-"+age;
	}
	@Override
	public int compareTo(PersonSortable o) {
		// TODO Auto-generated method stub
		if (name.compareTo(o.name) > 0) return 1;
		if (name.compareTo(o.name) < 0) return -1;
		if (name.compareTo(o.name) == 0){
			if (age > o.age) return 1;
			if (age < o.age) return -1;
		}
		return 0;
	}
}
public class Main1{
public static void main(String[] ages){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PersonSortable[] persons = new PersonSortable[n];
		for(int i = 0;i<n;i++){
			persons[i]=new PersonSortable(sc.next(),sc.nextInt());
		}
		Arrays.sort(persons);
		for (PersonSortable personSortable : persons) {
			System.out.println(personSortable);
		}
                System.out.println(Arrays.toString(PersonSortable.class.getInterfaces()));

	}
}