/*
# 진수 변환
1. 진수 변환하고자 하는 음이 아닌 정수(10진수)를 입력받는다.

2. 변환하고자 하는 진수(2 ~ 35)를 입력받는다.

3. 진수로 변환하고자 하는 정수를 나누어 나머지는 문자 배열에 저장하고, 몫은 다시 진수로 나눈다.
*/
package dataStructure;

import java.util.Scanner;

public class S06_ConvertInteger {
	static char[] converInteger(int num, int convNum) {
		int digits = 0; // 변환된 수의 자릿수를 저장하기 위하여 변수 선언 및 할당
		char[] saveSpace = new char[32];
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 나머지에 대응하는 진수 자리표를 초기화해둠
		
		int remainder = 0;
		int share = 0;
		System.out.println(convNum + "|      " + num);		
		do {
		System.out.println(" +--------");
		remainder = num % convNum;
		share = num/convNum;
		num = share;  // 몫 저장
		if(share != 0)
			System.out.println(convNum + "|      " + num + " ... " + remainder);
		else
			System.out.println("        " + num + "... " + remainder);
		saveSpace[digits++] = dchar.charAt(remainder); // 문자 배열의 첫 번째부터 나머지에 대응하는 문자를 dchar에서 찾아 저장하고 자릿수를 하나 올림
		// ++가 앞에 붙으면 전위형 증가 연산자, 뒤에 붙으면 후위형 증가 연산자
		// 전위형은 식을 평가하고 값이 증가하고, 후위형은 값을 증가시키고 식을 평가
		} while(num != 0);
		
		char[] result = new char[digits]; // 자릿수만큼의 새로운 문자 배열을 만들어서 순서대로 배열
		for(int i = 0; i < digits; i++) {
			result[i] = saveSpace[digits - 1 - i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 1. 진수 변환하고자 하는 음이 아닌 정수(10진수)를 입력받는다. */
		int num = 0;
		do {
		System.out.print("진수 변환을 하고자 하는 음이 아닌 정수를 입력해주세요. : "); num = sc.nextInt();
		if (num < 0)
			System.out.println("입력한 수가 0보다 작습니다.");
		} while (num < 0);
		
		/* 2. 변환하고자 하는 진수를 입력받는다. */
		int convNum = 0;
		do {
		System.out.print("변환하고자 하는 진수(2~35)를 입력해주세요. : "); convNum = sc.nextInt();
		if (convNum < 1 || convNum > 36)
			System.out.println("입력한 수가 범위를 벗어납니다.");
		} while (convNum < 2 || convNum > 35);
		
		char[] result = converInteger(num, convNum);
		
		System.out.print(convNum + "진수로 ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		System.out.println("입니다.");
	}
}
