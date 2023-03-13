/*
주어진 클래스를 요소로 하는 배열을 이용하여 아래 과제를 해결하시오.
1. 신체검사 리스트 출력
2. 평균 키 출력
3. 시력 분포도 출력
 */
package dataStructurePractice;

import java.util.Scanner;

public class P03_PhysicalExamination {

	static class PhyscData {
		/* 데이터 요소(필드) */
		String name;
		int height;
		double vision;

		/* 생성자 */
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PhyscData[] x = { // PhyscData를 요소로 하는 배열 x와 그 요소들에 인스턴트를 생성
				new PhyscData("박현규", 162, 0.3), new PhyscData("함진아", 173, 0.7), new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5), new PhyscData("이수진", 168, 0.4), new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8), };

		/* 신체검사 리스트 출력 */
		System.out.println("ㅁ 신체검사 리스트 ㅁ");
		System.out.println("이름\t키\t시력");
		System.out.println("--------------------");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i].name + "\t" + x[i].height + "\t" + x[i].vision);
		}

		/* 키의 평균 출력 */
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i].height;
		}
		double avg = sum / x.length;
		System.out.println("평균 키 : " + Math.round(avg*10)/10.0 + "cm");

		/* 시력분포도 출력 */
		int VMAX = 21;
		int[] vdist = new int[VMAX];
		for(PhyscData i : x) {
			vdist[(int)(i.vision * 10)]++;
		}
		
		System.out.println("시력 분포");
		for(int i = 0; i < vdist.length; i++) {
			System.out.println(i/10.0 + " ~ : " + vdist[i] + "명");
		}
	}
}
