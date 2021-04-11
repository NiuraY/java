package java1;
import java.util.Scanner;
import java.util.Arrays;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayIntegerStack arr =new ArrayIntegerStack(sc.nextInt());
		int m=sc.nextInt();
		for(int i=0;i<m;i++){
			arr.push((Integer)sc.nextInt());
		}
		System.out.println(arr.peek()+","+arr.empty()+","+arr.size());
		System.out.println(arr.toString());
		int x = sc.nextInt();
		for(int j=0;j<x;j++){
			System.out.println(arr.pop());
		}
		System.out.println(arr.peek()+","+arr.empty()+","+arr.size());
		System.out.println(arr.toString());
		}

}

 class ArrayIntegerStack implements IntegerStack {

	private Integer[] a;
	public ArrayIntegerStack(int x){
		a=new Integer[x];
	}
	@Override
	public String toString() {
		return Arrays.toString(a);
	}
	private int i=0;
	public int getI() {
		return i;
	}
	@Override
	public Integer push(Integer item) {
		// TODO Auto-generated method stub
		if(item==null)
			return null;
		if(i>a.length)
			return null;
		else {
			a[i]=item;
			i++;
			System.out.println(item);
			return item;
		}
	}

	@Override
	public Integer pop() {
		// TODO Auto-generated method stub
		if(this.empty())
			return null;
		else{
			Integer b;
			b=a[i-1];
			i--;
			return b;
		}
	}

	@Override
	public Integer peek() {
		// TODO Auto-generated method stub
		if(this.empty())
			return null;
		else
		return a[i-1];
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		if(a[0]==null)
			return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return i;
	}
}
abstract interface IntegerStack {
	public abstract Integer push(Integer item);
	public abstract Integer pop(); 
	public abstract Integer peek(); 
	public abstract boolean empty(); 
	public abstract int size();
}
