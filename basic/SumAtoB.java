package basic;
import java.util.Scanner;

public class SumAtoB {
/*	while문 반복
	static int sumAtoB(int a, int b) {
		int big = b;
		int small = a;
		
		if (b < a) {
			big = a;
			small = b;
		}

		int n = (big - small);
		int sum = small;
		int i = 1;
		
		while (i <= n) {
			sum += (small + i);
			i++;
		}
		return sum;
	}
*/
	
// for문 반복  * 하나의 변수를 사용하는 반복문은 while문 보다 for문을 사용하는 것이 좋다.
	static int sumAtoB(int a, int b) {
		int big = b;
		int small = a;
		
		if (b < a) {
			big = a;
			small = b;
		}

		int n = (big - small);
		int sum = small;

		for (int i = 1; i <= n; i++) {
			sum += (small + i);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("입력된 a부터 b까지 정수의 합을 구합니다.");
		
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		
		int sum = sumAtoB(a, b);
		System.out.println(a + "부터 " + b +"까지 정수의 합은 " + sum + "입니다.");
	}
}
