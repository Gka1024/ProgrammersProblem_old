package prj15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main15 {

	public static long maxNum(String s) {
		String[] stringArr = s.replaceAll("[^0-9]", ".").split("\\.");
		int[] arr = new int[stringArr.length];

		for (int i = 0; i < stringArr.length; i++) {
			arr[i] = Integer.parseInt(stringArr[i]);
		}

		List<Long> numList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			numList.add((long) arr[i]);
		}


		String[] operArr = s.replaceAll("[0-9]", "").split("");

		List<String> operList = new ArrayList<>(Arrays.asList(operArr));

		List<Long> tempNumList;
		List<String> tempOperList;
		long max = 0;

		tempNumList = new ArrayList<>(numList);
		tempOperList = new ArrayList<>(operList);
		max = Math.max(max, calcOrder("+", "-", "*", tempNumList, tempOperList));

		tempNumList = new ArrayList<>(numList);
		tempOperList = new ArrayList<>(operList);
		max = Math.max(max, calcOrder("+", "*", "-", tempNumList, tempOperList));

		tempNumList = new ArrayList<>(numList);
		tempOperList = new ArrayList<>(operList);
		max = Math.max(max, calcOrder("-", "+", "*", tempNumList, tempOperList));

		tempNumList = new ArrayList<>(numList);
		tempOperList = new ArrayList<>(operList);
		max = Math.max(max, calcOrder("-", "*", "+", tempNumList, tempOperList));

		tempNumList = new ArrayList<>(numList);
		tempOperList = new ArrayList<>(operList);
		max = Math.max(max, calcOrder("*", "+", "-", tempNumList, tempOperList));

		tempNumList = new ArrayList<>(numList);
		tempOperList = new ArrayList<>(operList);
		max = Math.max(max, calcOrder("*", "-", "+", tempNumList, tempOperList));

		return max;
	}

	public static long calcOrder(String op1, String op2, String op3, List<Long> tempNumList,
			List<String> tempOperList) {
		calculate(op1, tempNumList, tempOperList);
		calculate(op2, tempNumList, tempOperList);
		calculate(op3, tempNumList, tempOperList);
		return Math.abs(tempNumList.get(0));
	}

	public static void calculate(String oper, List<Long> tempNumList, List<String> tempOperList) {

		oper = "\\" + oper;

		for (int i = 0; i < tempOperList.size(); i++) {
			if (tempOperList.get(i).matches(oper)) {
				switch (oper) {
				case "\\+": {
					tempNumList.set(i, tempNumList.get(i) + tempNumList.get(i + 1));
					tempNumList.remove(i + 1);
					tempOperList.remove(i);
					i--;
					break;
				}
				case "\\-": {
					tempNumList.set(i, tempNumList.get(i) - tempNumList.get(i + 1));
					tempNumList.remove(i + 1);
					tempOperList.remove(i);
					i--;
					break;
				}
				case "\\*": {
					tempNumList.set(i, tempNumList.get(i) * tempNumList.get(i + 1));
					tempNumList.remove(i + 1);
					tempOperList.remove(i);
					i--;
					break;
				}
				default:
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expression = "50*6-3*2";

		System.out.println(maxNum(expression));

	}

}