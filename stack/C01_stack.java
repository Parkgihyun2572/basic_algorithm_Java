/*
# 스택이란?
	스택(stack)은 데이터를 일시적으로 저장하기 위해 사용하는 자료구조
	데이터의 입력과 출력 순서는 후입선출
	푸쉬 : 스텍에 데이터를 넣는 작업
	팝 : 스택에서 데이터를 꺼내는 작업
	탑 : 푸쉬와 탑을 하는 위치
	바텀 : 스택의 가장 아랫부분
	
 */
package stack;

public class C01_stack {
	
	public static void main(String[] args) {
		
		IntStack s = new IntStack(10);
		
		s.pop();
		
	}
	
}
