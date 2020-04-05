package Ex02;

import java.util.Scanner;

public class Main {
	public static int getCentury (int year) {
		if(year%100==0){
	        return year/100;
	    }else{
	        return year/100+1;
	    }
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int Century = getCentury(year);
		System.out.println(Century);
		sc.close();
	}
}
