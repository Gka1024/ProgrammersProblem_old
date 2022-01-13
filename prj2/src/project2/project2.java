package project2;
import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/81301
public class project2 {

	public static void main(String[] args) {
		String s = "";
		String[] engArray = {"zero", "one","two","three","four","five","six","seven","eight","nine","ten"};
		
		s = s + "*";
		 // 마지막에 영어로 끝나는 경우 제대로 동작하지 않음. 따라서 추가 문자열을 부착하여 마지막이 아니도록 함.
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{ // 만약 문자열에 알파벳이 있다면
				for(int j = i + 1; j < s.length(); j++)
				{ // i 번째부터 j 번째까지의 문자열을 추출하여 temp에 저장
					String temp= s.substring(i, j);
					if(Arrays.asList(engArray).contains(temp))
					{ // temp가 engArray에 있다면 temp에 해당하는 문자열을 engArray의 인덱스로 변환하여 문자열에 저장
						s = s.substring(0, i) + Arrays.asList(engArray).indexOf(temp) + s.substring(j);
						break;
					}
				}
			}
		}
		s = s.substring(0,s.length()-1); // 추가 문자열 제거
		int answer = Integer.parseInt(s);
       
	}

}
