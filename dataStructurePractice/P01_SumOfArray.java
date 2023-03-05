/*
자료구조와 함께 배우는 알고리즘 입문 자바편 02. 기본 자료구조 61p
Q3. 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
 */
package dataStructurePractice;

import java.util.Scanner;
import java.util.Random;

public class P01_SumOfArray {
	static int[] makeRandomArray(int num) {
		Random rand = new Random();
		
		int[] a = new int[num];
		for(int i = 0; i < num; i++) {
			a[i] = rand.nextInt(100);
		}
		return a;
	}
	
	static void showArray(int[] a) {
		System.out.print("a = [ ");
		for(int i = 0; i < a.length; i++ ) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	static int sumArray(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("만들 배열의 요솟수를 입력하세요 : "); int num = sc.nextInt();
		int[] randArray = makeRandomArray(num);
		showArray(randArray);
		int sum = sumArray(randArray);
		System.out.println("배열 a 요소의 합은 " + sum + "입니다.");
	}
}
