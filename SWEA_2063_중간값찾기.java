package sweaWork;

import java.util.Scanner;

public class SWEA_2063_중간값찾기 {

	public static void main(String[] args)throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int counts = sc.nextInt();
		int arr[] = new int[counts]; // 입력한 수만큼 배열 생성
		
		for (int i = 0; i <= counts; i++) {
			arr[i] = sc.nextInt(); // i 번째 입력한 수를 배열 arr의 i번째 배열(arr[i])에 넣기
		}
		int mid = arr.length/2;
		System.out.println(mid);

	}

}
