/*
서기 년월일을 필드로 갖는 클래스를 만들어라.

생성자 : YMD(int y, int m, int d)

메서드
	ㅇ after : n일 뒤의 년월일을 구함.
	ㅇ before : n일 전의 년월일을 구함.
 */
package dataStructurePractice;

import java.util.Scanner;

public class P04_YMD_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		class YMD {

			int[][] leapYear = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
					{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

			int y;
			int m;
			int d;
			int isLeapYear = 0;

			void checkLeapYear(int year) {
				if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
					isLeapYear = 1;
				} else {
					isLeapYear = 0;
				}
			}

			public YMD(int y, int m, int d) {
				this.y = y;
				this.m = m;
				this.d = d;
				checkLeapYear(y);
			}

			public void after(int n) {
				int days = d + n; // 현재 일자와 추가 일자를 더해 총 일자를 구한다.
				while (leapYear[isLeapYear][m - 1] < (days)) {
					days -= leapYear[isLeapYear][m - 1]; // 총 일자에서 현재 월의 일수를 빼고
					m++; // 다음월로 옮긴다.
					if (m >= 13) { // 만약 월이 13 이상이 되면, 월을 1로 바꾸고, 년을 하나 올린다.
						m = 1;
						checkLeapYear(++y);
					}
				}
				d = days;
			}

			public void before(int n) {
				int days = n - d; // 그 전월의 말일을 기준으로 하여 며칠이나 더 뒤로 가야하는지 확인
				while (days >= 0) { // 아직 더 가야한다면
					m--;	// 월을 하나 바꾸고
					if (m < 1) {
						m = 12;
						checkLeapYear(--y);
					}
					days -= leapYear[isLeapYear][m - 1]; // 그 월의 일수를 뺀다.
				}
				d = days * (-1); 
			}
		}

		YMD today = new YMD(2023, 3, 13);

		System.out.println("오늘은 " + today.y + "년 " + today.m + "월 " + today.d + "일 입니다.");
		System.out.print("오늘로 부터 며칠 전의 년월일을 구해볼까요? : ");
		int n = sc.nextInt();
//		today.after(n);
		today.before(n);
		System.out.println("오늘로부터 " + n + "일 전은 " + today.y + "년 " + today.m + "월 " + today.d + "일 입니다.");
	}

}
