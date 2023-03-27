/*
# 자료구조와 함께 배우는 알고리즘 입문 자바편 117p Q3.

요솟수가 n인 배열에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
일치한 요솟수를 반환하는 메서드를 작성하세요.

방법은 나도 동일하게 생각했으나, 이 해법은 idx가 0인 위치에 찾는 key값이 있을 경우, 이를 찾아내지 못한다는 문제가 있음..
java에서는 배열의 수를 지정하기에 하나를 추가하기가 쉽지 않은데, 방법이 있을까?
 */
package searchPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Prac01 {
	
	//--- 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 모든 요소의 인덱스를  ---//
	//--- 배열 idx의 앞쪽부터 순서대로 저장하고 일치하는 요솟수를 반환합니다 ---//
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;								// key와 일치하는 요솟수
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				idx[count++] = i; 
		System.out.println(Arrays.toString(idx));
		return count;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];					// 요솟수가 num 인 배열 
		int[] y = new int[num];					// 요솟수가 num 인 배열 

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색 값 : "); 					// 키값을 입력받음
		int ky = stdIn.nextInt();

		int count = searchIdx(x, num, ky, y);		// 배열 x안의 값이 ky인 요소를 y에 copy 

		if (count == 0)
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else
			for (int i = 0; i < count; i++)
				System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
		
	}
}
