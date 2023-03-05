/*
Util 패키지의 Random 클래스를 이용하여 난수를 생성, 이 난수를 넣은 배열에서 최댓값을 찾기
 */
package dataStructure;

import java.util.Random;
import java.util.Scanner;

public class S03_MaxOfArrayRand {
	static int maxOfArray (int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력받은 사람 수만큼의 배열에서 최댓값을 구합니다.");
		System.out.print("사람 수 : "); int num = sc.nextInt();
		
		int[] heightArray = new int[num];
		for(int i = 0; i < num; i++) {
			heightArray[i] = 100 + rand.nextInt(90);
		}
		int max = maxOfArray(heightArray);

		for(int i = 0; i < num; i++) {
			System.out.println("heightArray[" + i + "] = " + heightArray[i]);
		}
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
