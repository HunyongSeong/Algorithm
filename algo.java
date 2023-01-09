//package algo001;
//
//public class algo {
//
//	public static void main(String[] args) {
//		int[] arr = { 3, 17, 1, 39, 8, 41, 2, 32, 99, 2 };
//		int[] arr2 = { 22, 8, 5, 123, 7, 2, 63, 7, 3, 46 };
//		int[] arr3 = { 6, 63, 2, 3, 58, 76, 21, 33, 8, 1 };
//
//		int temp = -111;
//
//		for (int j = 0; j < 10; j++) // 총 10번 실행
//		{
//			if (temp < arr[j]) {
//				temp = arr[j];
//			}
//
//		}
//		System.out.println(temp);
//		temp = -111;
//		
//
//		for (int j = 0; j < 10; j++) // 총 10번 실행
//		{
//			if (temp < arr2[j]) {
//				temp = arr2[j];
//			}
//		}
//		System.out.println(temp);
//		temp = -111;
//
//		for (int j = 0; j < 10; j++) // 총 10번 실행
//		{
//			if (temp < arr3[j]) {
//				temp = arr3[j];
//			}
//		}
//		System.out.println(temp);
//		temp = -111;
//	}
//
//}
package algo001;

import java.util.Scanner;
import java.io.FileInputStream;

class algo {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T; // 테스트 케이스 수
		int arr[] = new int[10]; // 정적배열 선언
		T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int temp = -111; // 새로운 테스트 마다 temp 값 초기화
			for (int s = 0; s < 10; ++s) // 입력한 숫자를 배열에 넣는과정
				arr[s] = sc.nextInt();

			for (int j = 0; j < 10; j++) // 만들어진 배열 값의 비교과정
			{
				if (temp < arr[j]) { // 최대값 구하기
					temp = arr[j];
				}

			}
			System.out.printf("#%d %d\n", i + 1, temp); // "#%d %d\n" <- %d에는 뒤에오는 숫자들이 들어갑니다.

		}
	}
}