/*
# 배열
같은 자료형의 변수로 이루어진 구성 요소가 모인 것

1. 배열의 선언 방법
	int[] a;	//a는 자료형이 int인 배열 : 형식 A
	int a[];	//a는 자료형이 int인 배열 : 형식 B
	int형인 배열임을 나타내는 형식 A를 훨씬 많이 사용한다.
	int[] a = new int[5];	//구성 요솟수가 5인 배열을 선언 및 참조
	
2. 배열의 요솟값을 초기화하며 배열 선언하기
	int[] a = new int[] {1, 2, 3, 4, 5};
	
3. 배열의 복제(클론)
	배열 이름.clone()
	이 수식은 배열을 복제하고 복제한 배열에 대한 참조를 생성합니다.
 */
package dataStructure;

public class S01_Array {
	public static void main(String[] args) {
		/* 배열의 선언과 참조 */
		int[] a = new int[5]; //배열의 선언
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i = 0; i < a.length; i++) { //배열명.length = 배열의 길이
			System.out.println("a[" + i + "] = " + a[i]);
		}
		//배열의 구성 요소는 자동으로 0으로 초기화되는 규칙. 다른 변수는 초깃값이 없다.
		//배열의 자료형에 따라 초기화되는 값은 다르다.
		System.out.println("===========");
		
		
		/* 배열의 요솟값을 초기화하며 배열 선언하기 */
		int[] b = new int[] {1, 2, 3, 4, 5};
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}	
		System.out.println("===========");

		
		/* 배열의 복제(클론) */
		int[] c = new int[] {5, 4, 3, 2, 1};
		int[] clone = c.clone();
		
		System.out.print("c =");
		for(int i = 0; i < c.length; i++ ) {
			System.out.print(" " + c[i]);
		}
		
		System.out.println();
		System.out.print("clone =");
		for(int i = 0; i < clone.length; i++ ) {
			System.out.print(" " + clone[i]);
		}
	}
}
