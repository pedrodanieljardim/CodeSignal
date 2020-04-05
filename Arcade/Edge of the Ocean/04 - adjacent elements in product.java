package Ex04;

import java.util.Scanner;

public class Main {
	public static int adjacentElementsProduct(int[] inputArray) {
		int big=0,small=0,v=0;
		for(int i=0;i<inputArray.length;i++) {
			if(v==0 && inputArray[i]>0) {
				small=inputArray[i];
				v=1;
			}
			
			if(inputArray[i]>big && inputArray[i]>0) {
				big = inputArray[i];
			}
			if(inputArray[i]<small && inputArray[i]>0) {
					small = inputArray[i];
			}
		}
		return big*small;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[6];
		int i;
		for(i=0;i<6;i++) {
			vetor[i] = sc.nextInt();
		}
		int adjacent = adjacentElementsProduct(vetor); 
		System.out.println(adjacent);
		sc.close();
	}
}
