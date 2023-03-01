/*
주어진 3개의 수 중에서 최댓값 찾기
 */
package basic;
import java.util.Scanner;  //java.util 패키지에 있는 Scanner 클래스를 프로그램에 포함시킴
                           //전체 프로그램 앞머리(클래서 선언보다 앞)에 작성

public class FindMax3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//Scanner 객체 생성, System.in은 지금은 키보드에서 입력을 받는다는 뜻으로 이해
		//변수명 stdIn은 변경해도 무방
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		//변수명.nextInt : 입력받은 변수를 -2,147,483,648 ~ 2,147,483,647로 제한
		//실수, 문자 등을 입력받으면 오류 발생
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
