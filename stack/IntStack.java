package stack;

public class IntStack {

	private int capacity; // 스택 용량
	private int pointer; // 스택 포인터
	private int[] stack; // 스택 본체

	// 실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// 생성자
	public IntStack(int capacity) {

		pointer = 0;
		capacity = capacity;

		try {
			stack = new int[capacity]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError error) { // 생성할 수 없음
			capacity = 0;
		}

	}

	// 푸쉬 메서드
	public int push(int x) throws OverflowIntStackException {

		if (pointer >= capacity) {
			throw new OverflowIntStackException();
		}

		return stack[pointer++] = x;
	}

	// 팝 메서드
	public int pop()throws EmptyIntStackException {

		if (pointer <= capacity) {
			throw new EmptyIntStackException();
		}

		return stack[--pointer];
	}

	// 피크 메서드
	public int peak() throws EmptyIntStackException {

		if (pointer <= capacity) {
			throw new EmptyIntStackException();
		}

		return stack[pointer - 1];
	}

	// indexOf : 검색 메서드
	// 스택에서 x를 찾아 인덱스(없으면 -1)을 반환
	public int indexOf(int x) {
		for (int i = (pointer - 1); i >= 0; i--) {	// 정상 쪽에서 선형 검색
			if (stack[i] == x) {
				return i;	// 검색 성공
			}
		}
		return -1;	// 검색 실패
	}
	
	// clear : 스택의 모든 요소를 삭제하는 메서드
	public void clear() {
		pointer = 0;
	}
	
	// capacity : 스택의 용량을 확인하는 메서드
	public int capacity() {
		return capacity;
	}
	
	// size : 데이터 수를 확인하는 메서드
	public int size() {
		return pointer;
	}
	
	// isEmpty : 스택이 비어 있는지 검사하는 메서드
	public boolean isEmpty() {
		return pointer <= 0;
	}
	
	// isFull : 스택이 가득 찼는지 검사하는 메서드
	public boolean isFull() {
		return pointer >= capacity;
	}
	
	// dump : 스택 안의 모든 데이터를 표시하는 메서드
	public void dump() {
		if(pointer <= 0) {
			System.out.println("스택이 비어있습니다.");
		} else {
			for(int i = 0; i < pointer; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}
}
