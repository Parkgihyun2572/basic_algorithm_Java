// 왼쪽 위가 직각인 이등변 삼각형 출력
package basicPractice;
import java.util.Scanner;

public class TriangleLU {
	static void makeTriLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n+1-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 단 삼각형을 출력하시겠습니까? : ");
		int n = stdIn.nextInt();
		makeTriLU(n);
	}
}
