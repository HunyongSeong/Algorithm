package day003;

import java.util.Scanner;

public class MainClass { // 2차원 배열 SUM

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 100; // 행렬의 크기
		int arr[][] = new int[size][size];

		for (int test_case = 1; test_case <= 10; test_case++) { // test_case번 실행
			int startNum = sc.nextInt();
			int sum = 0;
			int max = 0;
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[0].length; c++) {
					arr[r][c] = sc.nextInt();					

				} // end 열
			} // end 행
		} // end for

	}

}
