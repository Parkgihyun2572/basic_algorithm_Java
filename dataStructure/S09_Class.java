/*
# 클래스 : 임의의 데이터형을 자유로이 조합하여 만들 수 있는 자료구조

1. 클래스 선언 방법

2. 클래스형 변수 사용 방법
	ㅇ 먼저 클래스형 변수(실체를 참조하는 변수)를 만든다.
	ㅇ 그리고 실체인 클래스 인스턴스를 생성한다.
	
0. 클래스에 대한 내용 간단히 정리
	ㅇ 클래스 본체에서는 다음과 같은 내용은 선언할 수 있다.
		- 멤버(필드/메서드/중첩(nested) 인터페이스)
		- 클래스 초기화 / 인스턴스 초기화
		- 생성자
	ㅇ 필드/메서드/생성자를 선언할 때 public/protected/private을 지정할 수 있다.
		- 공개 클래스 : 클래스 접근 제한자 public을 붙여 선언한 클래스로, 다른 패키지에서 사용할 수 있는 공개 클래스
	ㅇ 메서드/생성자는 다중으로 정의(오버로드)할 수 있다.
		* 오버로드 : 메서드나 생성자를 정의할 때 형식은 다르지만 같은 이름을 붙이는 것
	ㅇ final로 선언한 필드는 한 번만 값을 대입할 수 있다.
		- final 클래스 : 클래스 접근 제한자 final을 붙여 선언한 클래스고, 서브 클래스를 가질 수 없습니다.(새로운 클래스를 상속할 수 없습니다.)
	ㅇ 생성자는 새로 생성한 인스턴스의 초기화를 위해 사용된다.
	
0. 추가 내용
	ㅇ 파생 클래스
		- 클래스 A를 직접 상위 클래스(direct superclass)로 하려면 선언할 때, extends A를 추가해야한다.
		- 이 때 선언한 클래스는 클래스 A의 직접 서브 클래스가 됩니다.
		- 클래스 선언에 extends가 없는 클래스의 상위 클래스는 Object 클래스가 됩니다.
			* Object는 상위 클래스를 갖지 않는 유일한 클래스입니다.
		ex) class C extends A {
				//
			}
	ㅇ 인터페이스 구현
		- 인터페이스 X를 구현하려면 선언에 implements X를 추가해야 합니다.
		ex) class Y implements X {
				//...
			}
	ㅇ 추상 클래스
		- 클래스 접근 제한자 abstract를 붙여 클래스를 선언하면 추상 메서드를 가질 수 있는 추상 클래스가 된다.
		- 추상 클래스형은 불완전한 클래스이므로 인스턴스를 만들 수 없다.
	ㅇ 중첩 클래스
		- 클래스 또는 인터페이스 안에 선언한 클래스는 중첩(nested class)가 된다.
		- 멤버 클래스(member class)는 그 선언이 다른 클래스 또는 인터페이스 선언에 둘러싸인 클래스
		- 내부 클래스(inner class)는 명시적으로도 암묵적으로도 정적(static)으로 선언되지 않는 중첩 클래스. 정척 초기화나 멤버 인터페이스 선언을 
		  할 수 없다. 그리고 컴파일을 할 때 상수 필드가 아닌 한 정적 멤버를 선언할 수 없다.
		- 지역 클래스(local class)는 이름이 주어진 중첩 클래스인 내부 클래스. 어떤 클래스의 멤버도 될 수 없다.
 */
package dataStructure;

public class S09_Class {
	public static void main(String[] args) {
		/* 1. 클래스 선언 방법 */
		class XYZ { // 클래스 이름 : XYZ
			int x; // 3개의 데이터 요소를 가지고 있으며, 데이터 요소를 필드라고 한다.
			long y;
			double z;
		}

		/* 2. 클래스형 변수 사용 방법 */
//		XYZ a; // XYZ형의 클래스형 변수 a 선언
//		a = new XYZ(); // XYZ형의 클래스 인스턴스(실체)를 생성
		XYZ a = new XYZ();	//변수와 인스턴스 생성을 한꺼번에 선언

		/* 간단한 클래스의 예시 */
		class A {
			private int f1; // 비공개 필드
			protected int f2; // 한정 공개 필드
			public int f3; // 공개 필드

			static final int S1 = 0; // 정적 상수 필드

			public A() { // 생성자
				f1 = f2 = f3 = 0;
			}

			public A(int f1, int f2, int f3) { // 생성자
				this.f1 = f1;
				this.f2 = f2;
				this.f3 = f3;
			}
			
			public void setF1(int f) { // 메서드 F1의 setter
				f1 = f;
			}
			
			public int getF1() { // 메서드 F1의 getter
				return f1;
			}
		}

	}
}
