package prj8;
import java.util.*;
public class main8 {
	
	public static int sco_function(int[] sco, int k)
	{
		int count = 0;
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for(int i = 0; i < sco.length; i++)
		{
			heap.add(sco[i]);
		}
		
		while(heap.peek() < k && heap.size() != 1)
		{
			int temp1 = heap.poll();
			int temp2 = heap.poll();
			temp1 = temp1 + temp2 * 2;
			heap.add(temp1);
			count++;
		}
		if(heap.size() == 1 && heap.peek() < k)
		{
			return -1;
		}
		return count;
	}

	public static void main(String[] args) {
		int [] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		int r = sco_function(scoville, k);
		System.out.println(r);
	}

}

/*
public class heap
{ // Âü°í : https://go-coding.tistory.com/25
	ArrayList<Integer> List = new ArrayList <>();
	public heap()
	{
		List.add(0);
	}
	
	public void insert(int value)
	{
		List.add(value);
		int pointer = List.size() -1;
		while(pointer > 1 && List.get(pointer / 2) > List.get(pointer))
		{
			int temp = List.get(pointer/2);
			List.set(pointer/ 2, value);
			List.set(pointer, temp);
		}
	}
	
	public void scoville()
	{
		int temp = List.get(1) + List.get(2) * 2;
		List.remove(1);
		List.remove(2);
		insert(temp);
	}
	
}*/