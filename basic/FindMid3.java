package basic;
import java.util.Scanner;

public class FindMid3 {
	static int mid3(int a, int b, int c) {
		if (a >= b)
			if (b >= c) return b;
			else if (a <= c) return a;
			else return c;
		else if (a > c)  // b > a
			return a;
		else if (b > c)
			return c;
		else return b;
	}
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수 중 중간값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		
		int mid = mid3(a, b, c);
		System.out.println("중간값은 " + mid + "입니다.");
	}
}
