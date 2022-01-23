import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		
		
		ArrayList<String> str1List = new ArrayList<String>();
		ArrayList<String> str2List = new ArrayList<String>();
		
		ArrayList<String> intsec = new ArrayList<String>();
		ArrayList<String> union = new ArrayList<String>();
		
		for(int i = 0; i < str1.length()-1;i++)
		{ // str1에서 구하는 부분집합 
			if(i != str1.length()-2)
			{
				if(str1.charAt(i) >= 97 && str1.charAt(i) <= 122 && str1.charAt(i+1) >= 97 && str1.charAt(i+1) <= 122)
				{
					str1List.add(str1.substring(i, i+2)) ;
				}
			}
			else
			{
				if(str1.charAt(i) >= 97 && str1.charAt(i) <= 122 && str1.charAt(i+1) >= 97 && str1.charAt(i+1) <= 122)
				{
					str1List.add(str1.substring(i)) ;
				}
			}
		}
		
		for(int i = 0; i < str2.length()-1;i++)
		{ // str2 에서 구하는 부분집합 
			if(i != str2.length()-2)
			{
				if(str2.charAt(i) >= 97 && str2.charAt(i) <= 122 && str2.charAt(i+1) >= 97 && str2.charAt(i+1) <= 122)
				{
					str2List.add(str2.substring(i, i+2)) ;
				}
			}
			else
			{
				if(str2.charAt(i) >= 97 && str2.charAt(i) <= 122 && str2.charAt(i+1) >= 97 && str2.charAt(i+1) <= 122)
				{
					str2List.add(str2.substring(i)) ;
				}
			}
		}
		
		for(int i = 0; i < str1List.size(); i++)
		{// 합집합 = "str1 집합 + str2 집합" - 교집합 
			union.add(str1List.get(i));
		}
		for(int i = 0 ; i < str2List.size(); i++)
		{ 
			union.add(str2List.get(i));
		}
		
		for(int i = 0; i < str1List.size(); i++)
		{ // 교집합 
			if(str2List.contains(str1List.get(i)))
			{
				intsec.add(str1List.get(i));
				str2List.remove(str1List.get(i));
			}
		}
		
		for(int i = 0; i < intsec.size(); i++)
		{
			union.remove(intsec.get(i));
		}
		
		
		double ratio;
		if(intsec.size() == 0 && union.size() == 0)
		{ // 비
			ratio = 1;
		}
		else
		{
			ratio = (double)intsec.size() / (double)union.size();
		}

		int answer = (int)Math.floor(ratio * 65536);
        return answer;
    }
}
