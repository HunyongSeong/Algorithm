package day003;

import java.util.Iterator;
import java.util.Scanner;

public class SWEA_1209_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = 100; // 행렬의 크기, size*size
		for (int test_case = 0; test_case < 10; test_case++) {

			int tc = sc.nextInt();// 여기 입력값은 1번째 값이라는 의미로 1 먼저 넣기 때문. <- 문제 잘 확인
			int[][] arr = new int[size][size]; // 100*100 행렬

			for (int i = 0; i < arr.length; i++) { // 행의 개수
				for (int j = 0; j < arr[0].length; j++) { // 열의 개수
					int temp = sc.nextInt();
					arr[i][j] = temp; // i행 j열에 입력한 temp의 값을 차례로 입력
				}
			} // end for

			// 행 순회
			int maxNum = -111; // 최댓값을 구할 값

			for (int i = 0; i < arr.length; i++) {
				int sum = 0;
				for (int j = 0; j < arr.length; j++) {
					sum = sum + arr[i][j];
				} // end for : sum 계산 완료
				maxNum = Math.max(maxNum, sum); // 한 행을 순회할 때 나오는 값의 합이 최대인경우 계속해서 maxNum에 대입
			}

			// 열 순회
			for (int j = 0; j < arr.length; j++) {
				int sum = 0; // int sum 초기화
				for (int i = 0; i < arr.length; i++) {
					sum = sum + arr[i][j];
				} // end for : sum 계산 완료
				maxNum = Math.max(maxNum, sum); // 한 행을 순회할 때 나오는 값의 합이 최대인경우 계속해서 maxNum에 대입
			} // maxNum 과 sum 중 큰 값을 넘기는 함수

			// 대각 순회, 오른쪽 아래
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i][i]; // 대각선 / 0,0 1,1 2,2 3,3 4,4 ... 9,9
			}
			maxNum = Math.max(maxNum, sum); // 최종적으로 가장큰 maxNum이 나오면 바로 초기화 하기 위해 계속 사용
			sum = 0;

			// 대각선 순회, 왼쪽 아래 방향
			for (int i = 0; i < arr.length; i++) { // i=행, 행과 열의 값의 합이 2가 되었을 때 왼쪽 대각선 순회가 이루어짐
				sum += arr[i][arr.length -1 -i]; // ex)  0,0   0,1  (0,2) //[i][j] i+j = length -1 이 되어야함.
			}									 //		 1,0  (1,1)  1,2  // index num은 length -1 이기 때문		
												 //		(2,0)  2,1   2,2
			maxNum = Math.max(maxNum, sum);
			System.out.println("#" + tc + " " + maxNum);
		}
		

	}

}
