/*
다차원 배열
배열을 구성요소로 하는 것이 2차원 배열, 2차원 배열을 구성요소로 하는 것이 3차원 배열

1. 2차원 배열 선언 방법
	int[][] x = new int[(행의 개수)][(열의 개수)];
	Java에는 엄밀한 의미에서 다차원 배열이 없다.
	배열 x의 형은 "int형을 구성 자료형으로 하는 배열"을 구성 자료형으로 하는 배열"
	
2. 3차원 배열 선언 방법
	long[][][] y = new long[(행의 개수)][(열의 개수)][(축의 개수)];
	"long형을 구성 자료형으로 하는 배열을 구성 자료형으로 하는 배열"을 구성 자료형으로 하는 배열
*/
package dataStructure;

public class S08_MultiDimensionalArray {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int[][]secDimArray = new int[x][y];		// 행이 2개, 열이 3개인 2차원 배열
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.println("[" + i + "][" + j + "] = " + secDimArray[i][j]);
			}
		}
	}
}

