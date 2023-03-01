package basicPractice;
import java.util.Scanner;

public class JudgeTens {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("자릿수를 판별할 양의 정수 n을 입력해주세요.");
		int n;
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
			if (n <= 0) {
				System.out.println("1 이상의 양의 정수를 입력해주세요.");
			}
		} while (n <= 0);
		
		int checkNum = n;
		int theNumbersOfTens = 1; 
		while (checkNum > 10) {
			checkNum = checkNum/10;
			theNumbersOfTens++;
		}
		System.out.println(n + "은 " + theNumbersOfTens + "자리입니다.");
	}
}
