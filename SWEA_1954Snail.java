package day003;

import java.util.Scanner;

public class SWEA_1954Snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] dr = { 0, 1, 0, -1 }; // dr = row: 행 / (우, 하, 좌, 상)<- 문제의 달팽이 숫자 경로
		int[] dc = { 1, 0, -1, 0 };// dc = column: 열

		int test_case = sc.nextInt();
		for (int tc = 1; tc <= test_case; tc++) { // test 횟수 만큼 반복
			int N = sc.nextInt(); // 달팽이의 크기 설정 ex) n = 4, 4x4 달팽이
			int status = 0; // 달팽이 경로 상태(우, 하, 좌, 상), 시작은 '우' % 연산자를 활용하여 설정할 예정
			int now = 1; // 반복을 세기 위함, 그리고 값을 넣기 위해서 존재
			int[][] snail = new int[N][N];
			snail[0][0] = 1; // 달팽이 숫자 시작 [0][0] 자리값은 1
			int row = 0; // 현재 행 (위치)
			int col = 0; // 현재 열 (위치)
			while (now < N * N) {
				// 앞으로 진행
				int nr = row + dr[status]; // 행
				int nc = col + dc[status]; // 열
				if (nr >= 0 && nr < N && nc >= 0 && nc < N && snail[nr][nc] == 0) {
					snail[nr][nc] = ++now;
					row = nr; // 앞으로 가는 행 최신화
					col = nc; // 앞으로 가는 열 최신화
				}
				
				else {
					status = (status + 1) % 4; // 우 하 상 좌 무한반복
				}
			}
			System.out.println("#" +tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
				
			}
		}
	}

}
