import java.util.*;

class Solution {
    
    static HashMap<String, Integer> orderCountHM = new HashMap<>();
	
	public static void menu(String order, int courseNum, boolean[] isVisited, int depth)
	{
		if (courseNum == 0) {
	        put(order, isVisited, order.length());
	        return;
	    }

	    if (depth == order.length()) {
	        return;
	    }

	    isVisited[depth] = true;
	    menu(order, courseNum -1, isVisited, depth+1);
	    isVisited[depth] = false;
	    menu(order, courseNum, isVisited, depth+1);
	}
	
	public static void put(String order, boolean[] isVisited, int length)
	{
		String temp = "";
		for (int i = 0; i < length; i++) {
            if (isVisited[i]) {
                temp = temp + order.charAt(i);
            }
        }
		char[] tempArray = temp.toCharArray();
		Arrays.sort(tempArray);
		temp = new String(tempArray);
		
        if(orderCountHM.containsKey(temp))
        {
        	orderCountHM.put(temp, orderCountHM.get(temp) + 1);
        }
        else
        {
        	orderCountHM.put(temp, 1);
        }
	}
    
    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> menuList = new ArrayList<>();
		boolean[] isVisited;
		
		for(int i = 0; i < course.length; i++)
		{
			int max = 0;
			for(int j = 0; j < orders.length; j++)
			{
				isVisited = new boolean[orders[j].length()];
				menu(orders[j],course[i],isVisited,0);
			}
			
			for(String key : orderCountHM.keySet())
			{
				max = Math.max(max, orderCountHM.get(key));
			}
			
			for(String key : orderCountHM.keySet())
			{
				if(orderCountHM.get(key) == max && 2 <= max)
				{
					menuList.add(key);
				}
			}
			orderCountHM.clear();
		}
		
		Collections.sort(menuList);
		String[] answer = menuList.toArray(new String[menuList.size()]);
        return answer;		
    }
}
