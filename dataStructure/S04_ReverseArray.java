/*
# 주어진 배열을 역순으로 재배열
1. 교환횟수
	짝수 : 배열의 길이/2
	홀수 : (배열의 길이 - 1)/2
  
2. 교환 방법
	제 3의 변수를 선언 후 삼각교환
	int t;
	t = array[idx1]; array[idx1] = array[idx2]; array[idx2] = t;

3. 삼각교환을 배열의 길이에 맞는 교환 횟수에 따라 교환
 */
package dataStructure;

import java.util.Scanner;
import java.util.Random;

public class S04_ReverseArray {
	static void swap(int[] a, int idx1, int idx2) {
		int t;
		t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - 1 - i);
			System.out.println("a[" + i + "]과(와) a[" + (a.length - 1 - i) + "]를 교환합니다.");
			showArray(a);
		}
	}
	
	static void showArray(int[] a) {
		System.out.print("a = [ ");
		for(int i = 0; i < a.length; i++ ) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("만들 배열의 요솟수를 입력해주세요 : "); int num = sc.nextInt();
		int[] a = new int[num];
		for(int i = 0; i < num; i++) {
			a[i] = rand.nextInt(100);
		}
		showArray(a);
		reverse(a);
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}
