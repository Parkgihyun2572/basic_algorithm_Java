package dataStructure;
import java.util.Scanner;

public class S02_MaxOfArray {
	static int maxOfArray(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("키를 비교할 사람 수를 입력해주세요 : "); int a = sc.nextInt();
		int[] heightArray = new int[a];
		
		for(int i = 0; i < a; i++) {
			System.out.print("height[" + i + "] = ");
			heightArray[i] = sc.nextInt();
		}
		
		int maxHeight = maxOfArray(heightArray);
		System.out.println("최댓값은 " + maxHeight + "입니다.");
	}
}
