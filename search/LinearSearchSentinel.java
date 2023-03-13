/*
# 보초법
	선형검색의 종료조건은 2가지이다.
		1. 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
		2. 검색할 값과 같은 요소를 발견한 경우
	이 비용을 반으로 줄이는 방법이 보초법이다.
	검색하기 전에 검색하고자 하는 키 값을 맨 끝 요소에 저장하고 이 때 저장하는 값을 보초라고 한다.
	이렇게 하면 원하는 키 값을 찾지 못했을 때를 판단하는 종료 조건 1번을 하지 않아도 되기에 종료 판단 횟수를 2회에서 1회로 줄이는 역할을 한다.
 */

package search;

import java.util.Scanner;

public class LinearSearchSentinel {
	
	static int linearSearchSentinel(int[]a, int key) {
		a[a.length - 1] = key;
		
		int i = 0;
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i == a.length ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("만들 배열의 요솟수를 입력하세요 : ");
		int n = sc.nextInt();
		int[] a = new int[n + 1];
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
		
		int idx = linearSearchSentinel(a, key);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은(는) a[" + idx + "]에 있습니다.");
	}
}
