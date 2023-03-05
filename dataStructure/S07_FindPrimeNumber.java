/*
# 소수 찾기
소수를 찾는 방법은 다양하다. 그 중 아래와 같은 단계를 거쳐 알고리즘이 발달한다.
	1단계 : 소수 n은 2부터 n-1까지 어떠한 정수로도 나누어 떨어지지 않는다.
	2단계 : 소수 n은 2부터 n-1까지 어떠한 소수로도 나누어 떨어지지 않는다.
	3단계 : 소수 n은 n의 제곱근 이하의 어떤 소수로도 나누어 떨어지지 않는다.
	
	따라서 3단계 알고리즘을 적용하여 소수 찾기 프로그램을 작성한다.
	
	1. "2"는 소수임으로 짝수는 제외하고 홀수에 대해서만 확인한다.
 */
package dataStructure;

public class S07_FindPrimeNumber {
	public static void main(String[] args) {
		int counter = 0;									//곱셈과 나눗셈이 이뤄지는 횟수를 세는 변수 : 성능 확인 용
		int[] prime = new int[500];							//소수를 저장할 배열 만들기
		int primes = 0;										//소수의 개수를 카운트하는 변수
		
		prime[primes++] = 2;
		prime[primes++] = 3;								// 2와 3은 소수임이 명백하기에 미리 배열에 추가
		
		for(int n = 5; n <= 1000; n += 2) {					// 5부터 확인하며, 짝수는 제외하고 확인
			boolean flag = false;							
			for(int i = 1; prime[i]*prime[i] <= n; i++) {	// n 제곱근 이하의 소수에 대해서만 확인
				counter += 2;								// 곱셈 한 번, 나눗셈 한 번 카운트
				if (n % prime[i] == 0) {					// 나누어 0이면 즉시 종료하고 다음 수 확인
					flag = true;
					break;
				}
			}
			if (!flag) {									// n 제곱근보다 작은 소수로 확인하였으나, 나누어 떨어지지 않는다면
			prime[primes++] = n;							// 소수 목록에 추가
			counter++;
			}
		}
		
		for(int i = 0; i < prime.length; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈의 횟수는 " + counter + "입니다.");
	}

}
