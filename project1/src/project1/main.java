package project1;

import java.util.*;
// https://programmers.co.kr/learn/courses/30/lessons/64061
public class main {
	public static void main(String[] args) {
		
		int [] [] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		
		int answer = 0;
		
		ArrayList<Integer> basket = new ArrayList<>();
		
		for(int i = 0; i < moves.length; i++)
		{
			for(int j = 0 ; j < board.length; j++)
			{
				int pickup = board[j][moves[i]-1];
				
				if(pickup != 0)
				{
					if(basket.size() == 0)
					{
						System.out.println(pickup + "을 넣습니다.");
						basket.add(pickup);
					}
					else	if(basket.size() != 0)
					{
						if(basket.get(basket.size() - 1) != pickup)
						{
							System.out.println(pickup + "을 넣습니다.");
							basket.add(pickup);
							
						}
						else if(basket.get(basket.size() - 1) == pickup)
						{
							System.out.println(pickup + "을 넣습니다.");
							basket.remove(basket.size() - 1);
							answer += 2;
						}
					}
					board[j][moves[i]-1] = 0;
					break;
				}
			}
			
			
		}
		System.out.println(basket);
		System.out.println(answer);
	}
}
