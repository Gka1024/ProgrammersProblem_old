package prj15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main15 {

	public static int[] lightRoute(String[] grid) {
		char[][] charArr = new char[grid.length][grid[0].length()];
		boolean[][][] isVisited = new boolean[grid.length][grid[0].length()][4];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < grid[0].length(); j++) {
				charArr[i][j] = grid[i].charAt(j);
			}
		}

		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < grid[0].length(); j++) {
				for (int d = 0; d < 4; d++) { // d�� ������ �ǹ��մϴ�. 0�� ��, 1�� ��, 2�� ��, 3�� �� �����Դϴ�.
					int temp = lightMove(charArr, i, j, d, isVisited);
					if (temp != 0) {
						list.add(temp);
					}
				}
			}
		}
		Collections.sort(list);
		return list.stream().mapToInt(i -> i).toArray();
	}

	public static int lightMove(char[][] charArr, int i, int j, int d, boolean[][][] isVisited) {
		int height = charArr.length;
		int width = charArr[0].length;
		int count = 0;
		while (true) {
			if (isVisited[i][j][d]) {
				break;
			} else {
				isVisited[i][j][d] = true;
			}

			if (charArr[i][j] == 'L') {
				d = (d + 1) % 4;
			} else if (charArr[i][j] == 'R') {
				d = (d + 3) % 4;
			}
			switch (d) {
			case 0: // ��
			{
				i = (i + 1) % height;
				break;
			}
			case 1: // ��
			{
				j = (j + width - 1) % width;
				break;
			}
			case 2: // ��
			{
				i = (i + height - 1) % height;
				break;
			}
			case 3: // ��
			{
				j = (j + 1) % width;
				break;
			}
			default:
				break;
			}
			count++;
		}

		return count;
	}

	public static void main(String[] args) {

		String[] grid = { "S" };
		System.out.println(Arrays.toString(lightRoute(grid)));
	}

}
