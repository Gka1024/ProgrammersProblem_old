package prj20;

import java.util.Collections;
import java.util.HashMap;

public class prj20 {
	
	public static int[] coloring(int[][] picture, int h, int w)
	{
		int color, colorPointer = 1;
		String key;
		HashMap <String, Integer> map = new HashMap<>();
		for(int i = 0; i < h; i++)
		{
			for(int j = 0; j < w; j++)
			{
				if(picture[i][j] != 0)
				{
					color = picture[i][j];
					key = Integer.toString(colorPointer++);
					map.put(key, 0);
					color_Reculsive(picture, i, j, color, map, key);
				}
			}
		}
		int[] answer = new int[2];
		answer[0] = map.size();
		answer[1] = Collections.max(map.values());
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		return answer;
	}
	
	public static void color_Reculsive(int [][] picture, int i, int j, int color, HashMap map, String key)
	{
		if(picture[i][j] != color)
		{
			return;
		}
		
		picture[i][j] = 0;
		map.put(key, (int) map.get(key) + 1);
		
		if(i != 0)
		{ // 위 방향 체크
			color_Reculsive(picture, i - 1, j, color, map, key);
		}
		if(i < picture.length - 1)
		{ // 아래 방향 체크
			color_Reculsive(picture, i + 1, j, color, map, key);
		}
		if(j != 0)
		{ // 왼쪽 방향 체크
			color_Reculsive(picture, i, j - 1, color, map, key);
		}
		if(j < picture[0].length - 1)
		{ // 오른쪽 방향 체크
			color_Reculsive(picture, i, j + 1, color, map, key);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 13, n = 16;
		int[][] picture =  {{0, 1, 0}, {1, 1, 0}, {}}
				//{{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0}, {0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}};
		coloring(picture, m, n);
	}

}
