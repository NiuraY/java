package java1;
import java.util.Scanner;
class Day{
	private static int day;
	Day(int day){
		this.day=day;
	}
	public static boolean isMondayToFriday(int day){
	if(day==6||day==7)
		return false;
	else
		return true;
	}
}
public class test {
public static void main(String[] ages){
	Scanner scanner=new Scanner(System.in);
	while(scanner.hasNext()){
	int LocaDate=scanner.nextInt();
	if(Day.isMondayToFriday(LocaDate)){
		System.out.println("今天上班");
	}
	else{
		System.out.println("今天休息");
	}
	}
  }
}
