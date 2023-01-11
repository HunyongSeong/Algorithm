package sweaWork;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1984_001_중간평균값구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();

		for (int i = 0; i < test_case; i++) { 		// 입력한 test_case 수만큼 실행하기
			int num_length = sc.nextInt(); 		// 입력할 길이 지정
			int arr[] = new int[num_length]; 	// 입력한 길이의 배열 생성

			for (int j = 0; j < num_length; j++) { 	// 입력한 길이만큼 배열에 숫자 넣기
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr); 	// 배열정렬
			for (int j = 0; j < num_length; j++) { 	// ㅇ 
				System.out.println(arr[j]);
			}

		}


	}

}
