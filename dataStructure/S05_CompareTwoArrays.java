/*
# 두 배열의 비교
1. 두 배열의 요솟수(길이)가 같은지 비교
	길이가 다르다면 배열이 같지 않은 것이 분명함으로 false 반환
	
2. 반복문을 통해 두 배열을 처음부터 스캔, 그 과정에서 다른 요소를 발견하면 false 반환

3. 끝까지 다른 요소를 만나지 않는다면 true 반환
 */
package dataStructure;
import java.util.Scanner;

public class S05_CompareTwoArrays {
	static void showArray(int[] a) {
		System.out.print("[ ");
		for(int i = 0; i < a.length; i++ ) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	static int[] makeArray(int num) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.print("array[" + i + "] = "); int a = sc.nextInt();
			array[i] = a;
		}
		return array;
	}
	
	static boolean compareArrays(int[] a, int[] b) {
		if (a.length != b.length) // 배열 a,b의 요솟수가 다르다면 false 반환
			return false;
		
		for(int i = 0; i < a.length; i++) { // 배열 a와 b의 요소를 처음부터 비교하여 다르다면 false 반환
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true; // 두 배열의 요솟수도 같고, 처음부터 비교하여 다르지 않다면 true 반환
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요솟수를 입력해주세요 : "); int a = sc.nextInt();
		int[] arrayA = makeArray(a);
		System.out.print("배열 b의 요솟수를 입력해주세요 : "); int b = sc.nextInt();
		int[] arrayB = makeArray(b);
		showArray(arrayA);
		showArray(arrayB);
		boolean equal = compareArrays(arrayA, arrayB);
		System.out.println("배열 a와 b는 " + (equal ? "같습니다" : "같지 않습니다."));
	}
}
