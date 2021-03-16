package java201521123118;
import java.util.Arrays;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String choice = sc.nextLine();
		while(sc.hasNextLine()){
		int x = choice2Int(choice);
		switch (x) {
		case 1:
			
			break;

		default:
			break;
		}
	}
}
	private static int choice2Int(String choice) {
		if(choice.equals("fib"))
		return 1;
		if(choice.equals())
		return 0;
	}
}
