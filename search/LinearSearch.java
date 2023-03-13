/*
선형검색
  정의 : 직선 모양(선형)으로 늘어선 배열에서 검색하는 경우에 원하는 키값을 가진 원소를 찾을 때까지 맨 앞부터 스캔하여 순서대로 검색하는 알고리즘
  일반적으로 무작위로 늘어놓은 데이터 모임에서 검색을 수행할 때 사용한다.

선형검색의 종료 조건
  1. 검색할 값을 찾지 못하고 배열의 맨 끝을 지나간 경우
  2. 검색할 값과 같은 원소를 찾는 경우
 */

package search;

import java.util.Scanner;

public class LinearSearch {

	static int linearSearch(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (key == a[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("만들 배열의 요솟수를 입력하세요 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			int t = sc.nextInt();
			a[i] = t;
		}

		System.out.print("a = ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.print("찾고자 하는 숫자를 입력하세요 : ");
		int key = sc.nextInt();

		int idx = linearSearch(a, key);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은(는) a[" + idx + "]에 있습니다.");
	}
}
