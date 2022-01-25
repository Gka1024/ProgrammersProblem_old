public class main13 {
 // https://programmers.co.kr/learn/courses/30/lessons/77485
	public static int[] matrix_roll(int rows, int columns, int[][] queries) {
		int[][] arr = new int[rows][columns];
		int num = 1;
		int[] result = new int[queries.length];

		for (int i = 0; i < rows; i++) { // 배열에 수 집어넣기
			for (int j = 0; j < columns; j++) {
				arr[i][j] = num++;
			}
		}

		for (int i = 0; i < rows; i++) { // test
			for (int j = 0; j < columns; j++) {
				System.out.print(String.format("%5d", arr[i][j]));
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < queries.length; i++) {
			int[] qurArr = queries[i]; // 2, 2, 5, 4
			int width = qurArr[3] - qurArr[1]; // 2
			int height = qurArr[2] - qurArr[0]; // 3
			int minNum = rows * columns;

			int RT = arr[qurArr[0] - 1][qurArr[3] - 1];
			int RB = arr[qurArr[2] - 1][qurArr[3] - 1];
			int LB = arr[qurArr[2] - 1][qurArr[1] - 1];

			for (int j = 0; j < width; j++) {
				minNum = Math.min(minNum, arr[qurArr[0] - 1][qurArr[3] - 1 - j]);
				arr[qurArr[0] - 1][qurArr[3] - 1 - j] = arr[qurArr[0] - 1][qurArr[3] - j - 2];
			}

			for (int j = 0; j < height; j++) {
				minNum = Math.min(minNum, arr[qurArr[2] - 1 - j][qurArr[3] - 1]);
				arr[qurArr[2] - 1 - j][qurArr[3] - 1] = arr[qurArr[2] - 2 - j][qurArr[3] - 1];
			}

			for (int j = 0; j < width; j++) {
				minNum = Math.min(minNum, arr[qurArr[2] - 1][qurArr[1] - 1 + j]);
				arr[qurArr[2] - 1][qurArr[1] - 1 + j] = arr[qurArr[2] - 1][qurArr[1] + j];
			}

			for (int j = 0; j < height; j++) {
				minNum = Math.min(minNum, arr[qurArr[0] - 1 + j][qurArr[1] - 1]);
				arr[qurArr[0] - 1 + j][qurArr[1] - 1] = arr[qurArr[0] + j][qurArr[1] - 1];
			}

			arr[qurArr[0]][qurArr[3] - 1] = RT;
			arr[qurArr[2] - 1][qurArr[3] - 2] = RB;
			arr[qurArr[2] - 2][qurArr[1] - 1] = LB;

			result[i] = minNum;
		}

		for (int i = 0; i < rows; i++) { // test
			for (int j = 0; j < columns; j++) {
				System.out.print(String.format("%5d", arr[i][j]));
			}
			System.out.println();
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] queries = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };
		matrix_roll(6, 6, queries);

	}

}

/*
 * take1 - 3번부터 실패 public static int [] matrix_roll(int rows, int columns, int[]
 * [] queries) { int[][] arr = new int[rows][columns]; int num = 1; int []
 * result = new int [queries.length];
 * 
 * for(int i = 0; i < rows; i++) { // 배열에 수 집어넣기 for(int j = 0; j < columns;
 * j++) { arr[i][j] = num++; } }
 * 
 * for(int i = 0; i < queries.length; i++) { int minnum = rows * columns; int
 * chgrow = queries[i][2] - queries[i][0]; int chgcol = queries[i][3] -
 * queries[i][1];
 * 
 * int RT = arr[queries[i][0]-1][queries[i][3]-1]; int RB =
 * arr[queries[i][2]-1][queries[i][3]-1]; int LB =
 * arr[queries[i][2]-1][queries[i][1]-1]; int LT =
 * arr[queries[i][0]-1][queries[i][1]-1];
 * 
 * for(int j = 0; j < chgcol; j++) { arr[queries[i][0] - 1][queries[i][3] - 1 -
 * j] = arr[queries[i][0] - 1][queries[i][3] - 1 - j - 1]; if(arr[queries[i][0]
 * - 1][queries[i][3] - 1 - j - 1] < minnum) { minnum = arr[queries[i][0] -
 * 1][queries[i][3] - 1 - j - 1]; } }
 * 
 * for(int j = 0; j < chgrow; j++) { arr[queries[i][2] - 1 - j][queries[i][3] -
 * 1] = arr[queries[i][2] - 1 - j - 1][queries[i][3] - 1]; if(arr[queries[i][2]
 * - 1 - j - 1][queries[i][3] - 1] < minnum) { minnum = arr[queries[i][2] - 1 -
 * j - 1][queries[i][3] - 1]; } }
 * 
 * arr[queries[i][0]][queries[i][3]-1] = RT;
 * 
 * for(int j = 0; j < chgcol; j++) { arr[queries[i][2] - 1][queries[i][1] - 1 +
 * j] = arr[queries[i][2] - 1][queries[i][1] - 1 + j + 1]; if(arr[queries[i][2]
 * - 1][queries[i][1] - 1 + j + 1] < minnum) { minnum = arr[queries[i][2] -
 * 1][queries[i][1] - 1 + j + 1]; } }
 * 
 * arr[queries[i][2] - 1][queries[i][3]-2] = RB;
 * 
 * for(int j = 0; j < chgrow; j++) { arr[queries[i][0] - 1 + j][queries[i][1] -
 * 1] = arr[queries[i][0] + j][queries[i][1] - 1]; if(arr[queries[i][0] +
 * j][queries[i][1] - 1] < minnum) { minnum = arr[queries[i][0] +
 * j][queries[i][1] - 1]; } }
 * 
 * arr[queries[i][2]-2][queries[i][1]-1] = LB;
 * 
 * if(RT < minnum) { minnum = RT; } if(RB < minnum) { minnum = RT; } if(LB <
 * minnum) { minnum = RT; } if(LT < minnum) { minnum = LT; }
 * 
 * result[i] = minnum;
 * 
 * }
 * 
 * for(int i = 0; i < rows; i++) { for(int j = 0; j < columns; j++) {
 * System.out.print(String.format("%4d", arr[i][j])); } System.out.println(); }
 * 
 * for(int i = 0; i < result.length; i++) { System.out.println(result[i]); }
 * 
 * return result; }
 */
