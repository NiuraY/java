package java1;
import java.util.Scanner;
import java.lang.String;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String[] str=new String[n];
     for(int i=0;i<n;i++){
    	 str[i]=sc.next();
     }
     while(sc.hasNext()){
    	 String choice=sc.next();
    	 switch (choice) {
		case "sort1":
			String str2;
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
				int x=Integer.parseInt(str[i].substring(6, 13));
				int y=Integer.parseInt(str[j].substring(6, 13));
				if(x>y){
					str2=str[i];str[i]=str[j];str[j]=str2;
				}
					
				}
			}
			for(int i=0;i<n;i++){
			System.out.println(str[i].substring(6, 10)+"-"+str[i].substring(10, 12)+"-"+str[i].substring(12, 14));
			}
			break;
		case "sort2":
			String str3;
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
				int x=Integer.parseInt(str[i].substring(6, 13));
				int y=Integer.parseInt(str[j].substring(6, 13));
				if(x>y){
					str3=str[i];str[i]=str[j];str[j]=str3;
				}
					
				}
			}
			for(int i=0;i<n;i++){
				System.out.println(str[i]);
			}
			break;

		default:
			System.out.println("exit");
		}
    	 
     }
	}

}
