/*
한 해의 경과 일 수를 계산하는 프로그램을 작성하시오.
 */
package dataStructurePractice;

import java.util.Scanner;

public class P02_DayOfYear {
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		// 윤년 추가 규칙
		// 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
		// 100년으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다.
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? 1 : 0;
	}
	
	static int countDays(int year, int month, int day) {
		int days = day;
		
		if (month != 1) {
			for(int i = 0; i < month - 1; i++) {
				days += mdays[isLeap(year)][i];
			}
		}
		return days;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("그 해의 경과 일 수를 구합니다.");
		System.out.print("년 : "); int year = sc.nextInt();
		System.out.print("월 : "); int month = sc.nextInt();
		System.out.print("일 : "); int day = sc.nextInt();
		
		int days = countDays(year, month, day);
		
		System.out.println("그 해의 경과 일 수는 " + days + "입니다.");
	}

}
