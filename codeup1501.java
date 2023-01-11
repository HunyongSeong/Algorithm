package day003;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1501 { // 코드업 1501 문제

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n x n 배열
		int arr[][] = new int[n][n];
		int allCount = 0;

		for (int r = 0; r < n; r++) { 		// 행
			for (int c = 0; c < n; c++) {	// 열
				allCount = allCount + 1;
				arr[r][c] = allCount;
				
				System.out.print(arr[r][c]+ " ");


			} // end 열
			System.out.println();
		} // end for 행

	}

}
