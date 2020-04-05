package Ex01;

import java.util.Scanner;

public class Main {
	
	public static int sumNumber(int n1,int n2) {
		return n1+n2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int sum = sumNumber(n1,n2);
		
		System.out.println(sum);
		
		sc.close();
	}
}
