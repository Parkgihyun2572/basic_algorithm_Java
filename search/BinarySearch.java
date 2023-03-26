/*
이진 검색(Binary Search)
  선행 조건 : 배열의 데이터가 정렬되어 있어야 함
  원소가 오름차순, 내림차순으로 정렬된 배열에서 좀 더 효율적으로 검색할 수 있는 알고리즘
  배열 중앙에 위치한 원소에 주목하여 검색값과 비교하여 배열의 절반을 검색 대상에서 제외
  위 과정을 반복하여 남은 부분의 절반을 검색 대상에서 제외시켜가며 스캔
 */

package search;

import java.util.Scanner;

public class BinarySearch {

	static int[] makeNewArray() {
		Scanner sc = new Scanner(System.in);

		System.out.print("만들 배열의 요솟수를 입력해주세요: ");
		int length = sc.nextInt();

		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextInt();
		}
		return array;
	}

	static void showArray(int[] array) {
		System.out.print("array = [");
		for (int i : array) {
			System.out.print(" " + i);
		}
		System.out.println(" ]");
	}

	public static void main(String[] args) {

		int[] array = makeNewArray();
		showArray(array);

		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값을 입력해주세요: ");
		int key = sc.nextInt();
		int idx = -1;

		int startIdx = 0;
		int endIdx = array.length - 1;
		int centerIdx = endIdx / 2;

		while (startIdx <= endIdx) {
			if (key == array[centerIdx]) {
				idx = centerIdx;
				break;
			} else if (key > array[centerIdx]) {
				startIdx = centerIdx + 1;
				centerIdx = (startIdx + endIdx) / 2;
			} else {
				endIdx = centerIdx - 1;
				centerIdx = (startIdx + endIdx) / 2;
			}
		}

		if (idx != -1) {
			System.out.println("찻는 값의 위치는 array[" + idx + "]에 있습니다.");
		} else {
			System.out.println("검색에 실패하였습니다.");
		}
	}
}
