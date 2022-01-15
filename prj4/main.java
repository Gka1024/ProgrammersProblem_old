package prj4;

import java.util.*;
import java.util.stream.Collectors;
//https://programmers.co.kr/learn/courses/30/lessons/42586
public class main {

	public static void main(String[] args) {

		int[] progresses = { 93, 30, 55, 60, 40, 65 };
		int[] speeds = { 1, 30, 5, 10, 60, 7 };

		int[] arr = new int[progresses.length];

		for (int i = 0; i < progresses.length; i++) {
			arr[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
					: ((100 - progresses[i]) / speeds[i]) + 1;
		}
		List<Integer> List = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> answer = new ArrayList<>();

		int temp = Collections.max(List);
		for (int i = 0; i < temp; i++) {

			for (int j = 0; j < List.size(); j++) {
				if (List.get(j) != 0)
					List.set(j, List.get(j) - 1);
			}

			if (List.get(0) == 0) {
				int count = 0;
				for (int j = 0; j < List.size(); j++) {
					count++;
					if (List.get(j) != 0) {
						count--;
						break;
					}
				}
				answer.add(count);
				for (int j = 0; j < count; j++) {
					List.remove(0);
				}
			}
		}
		
		int[] ans = answer.stream().mapToInt(i -> i).toArray();
		
		System.out.println(Arrays.toString(ans));

	}
}
