package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDivisors {
	
	static int countDivisors(int num) {
		int count = 0;
		List<Integer> divisors = new ArrayList<>();
		
		// 1. 숫자 num의 제곱근까지의 수 중에 100을 그 수로 나누었을 때 나누어 떨어지는지 확인
		for(int i = 1; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				divisors.add(i);
				count++;
				// 2. 그 수로 num을 나눈 수도 약수이다. 다만 같으면 한 번만 센다.
				if(i != (num / i)) {
					divisors.add((num / i));
					count++;
				}
			}
		}
			
		System.out.println(divisors);
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int numberOfDivisors = countDivisors(num);
		System.out.println(numberOfDivisors);
	}
}
