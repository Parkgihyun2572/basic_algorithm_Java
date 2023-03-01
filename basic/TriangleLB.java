/*
다중 루프를 이용한 왼쪽 아래가 직각인 이등변 삼각형 출력
 */
package basic;
import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 단 삼각형을 출력하시겠습니까? : ");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
