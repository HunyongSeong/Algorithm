package sweaWork;

import java.util.Scanner;

public class SWEA_1204_최빈수구하기 {

	public static void main(String[] args)throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt(); // 테스트 횟수
		int arrScore[] = new int[101]; // 0~100

		for (int test_case = 1; test_case <= T; test_case++) {

			for (int i = 0; i < 1000; i++) { // 1000개의 입력값
				arrScore[sc.nextInt()]++; // 0-100 값중 하나를 넣으면 해당하는 자리의 배열값이 1씩 증가
			}
			
			int max = 0; // 각 배열 자리의 값( 0 - 100 값의 개수)
			int index = 0; // 각 배열의 자리 ( 0 - 100 값중 어느 값인지를 확인)
			
			for(int j=0; j<101; j++) {
				if(max <= arrScore[j]) {
					max = arrScore[j];
					index = max;
				}
			}
			System.out.println(index);

		}
	}

}
