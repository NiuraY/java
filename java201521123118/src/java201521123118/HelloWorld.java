package java201521123118;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(Math.abs(a)>1000)
            	System.out.println("a<=1000");
            else
                System.out.println(a + b);
        }
    }
}