import java.util.*;

class Solution {
    
    public static Integer[] tuple(String s)
	{
		String temp = s.replace("{{", "").replace("}}", "");
		String[] strArr = temp.split("\\},\\{");
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		
		
		Arrays.sort(strArr, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        return s1.length() - s2.length();
		    }
		});
		
		for(int i = 0; i < strArr.length; i++)
		{
			for(int j = 0; j < strArr[i].split(",").length; j++)
			{
				linkedHashSet.add(Integer.parseInt(strArr[i].split(",")[j]));
			}
		}
		
		Integer[] arr = linkedHashSet.toArray(new Integer[0]);
		
		return arr;
	}
    
    public Integer[] solution(String s) {
        
        return tuple(s);
    }
}
