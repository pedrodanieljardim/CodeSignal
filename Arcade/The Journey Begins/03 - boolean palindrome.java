package Ex03;

import java.util.Scanner;

public class Main {
	public static boolean testPalindrome(String inputString) {
		int i= 0;
		int j= inputString.length()-1;
		int count=0;
		int k= 0;
		
		while(k<inputString.length()) {
			if(inputString.charAt(i) == inputString.charAt(j)) {
				count++;
			}else {
				if(inputString.charAt(i) != inputString.charAt(j)) {
					count--;
				}
			}
			i++;
			j--;
			k++;
		}
		
		if(count == inputString.length()) {
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String tst = sc.nextLine();
		
		boolean test = testPalindrome(tst);
		
		System.out.println(test);
		
		sc.close();
	}
}
