package prj6;

import java.util.Stack;

public class main6 {
//https://programmers.co.kr/learn/courses/30/lessons/12973
	public static int pairRemove(String s)
	{
		if(s.length() % 2 == 1)
		{
			return 0;
		}
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++)
		{
			
			if(stack.isEmpty())
			{
				stack.push(i);
				continue;
			}
			
			if(s.charAt(stack.peek()) == s.charAt(i))
			{
				stack.pop();
			}
			else
			{
				stack.push(i);
			}
		}
		
		if(!stack.isEmpty())
		{
			return 1;
		}
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		String s = "0";
		System.out.println(pairRemove(s));
	}

}
