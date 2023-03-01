package basicPractice;

import java.util.Scanner;

public class NumPyramid {
	static void makeNumPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((i - 1)*2 + 1); j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 단 피라미드를 출력하시겠습니까? : ");
		int n = stdIn.nextInt();
		makeNumPyramid(n);
	}
}
