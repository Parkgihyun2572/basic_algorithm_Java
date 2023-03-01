package basicPractice;
import java.util.Scanner;

public class MinusBtoA {
	static int minusBtoA(int a, int b) {
		int minus = (b - a);
		return minus;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("b에서 a를 뺀 값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		
		int b;
		//do문 while(제어식) : 일단 루프 본문을 한 번 실행한 다음에 계속 반복할 것인지를 판단하는 사후 판단문
		do {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if (b <= a) {
				System.out.println("a보다 큰 값을 입력하세요.");
			}
		} while (b <= a);
		
		int minus = minusBtoA(a, b);
		System.out.println(b + "에서 " + a +"를 뺀 값은 " + minus + "입니다.");
	}
}
