package queue;

public class IntQueue {
	
	private int capacity;  // 큐의 용량
	private int front;  // 첫 번째 요소 커서
	private int rear;  // 마지막 요소 커서
	private int num;  // 현재 데이터 수
	private int[] queue;  // 큐 본체

	// 실행시 예외 : 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	// 실행시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	// 생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;  // 초기화
		capacity = capacity;
		try {
			queue = new int[capacity];  // 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) {  // 생성할 수 없음
			capacity = 0;
		}
	}
	
	// 큐에 데이터를 인큐
	public int enqueue(int x) throws OverflowIntQueueException {
		if(num >= capacity) {
			throw new OverflowIntQueueException();
		}
		queue[rear++] = x;
		num++;
		if (rear == capacity) {
			rear = 0;
		}
		return x;
	}
	
	// 큐에서 데이터를 디큐
	public int dequeue() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		int x = queue[front++];
		num--;
		if(front == capacity) {
			front = 0;
		}
		return x;
	}
	
	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		return queue[front];
	}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (queue[idx] == x) {
				return idx;	// 검색 성공
			}
		}
		return -1;
	}
	
	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	// 큐의 용량을 반환
	public int capacity() {
		return capacity;
	}
	
	// 큐에 쌓여 있는 데이터의 수를 반환
	public int size() {
		return num;
	}
	
	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= capacity;
	}
	
	// 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
	public void dump() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		} else {
			for(int i = 0; i < num; i++) {
				System.out.println(queue[(i + front) % capacity]);
			}
			System.out.println();
		}
	}
}
