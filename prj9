import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> usrinfo = new HashMap<String, String>();
		ArrayList<String> answerList = new ArrayList<String>();
		
		for (int i = 0; i < record.length; i++)
		{
			if(record[i].split(" ")[0].matches("Leave"))
			{
				continue;
			}
			
			usrinfo.put(record[i].split(" ")[1],record[i].split(" ")[2]);
						
		}
		
		for(int i = 0; i < record.length; i++)
		{
            if(record[i].split(" ")[0].matches("Change"))
            {
                continue;
            }
			if(record[i].split(" ")[0].matches("Enter"))
			{
				answerList.add(usrinfo.get(record[i].split(" ")[1]) +"님이 들어왔습니다.");
			}
			else if(record[i].split(" ")[0].matches("Leave"))
			{
				answerList.add(usrinfo.get(record[i].split(" ")[1]) +"님이 나갔습니다.");
			}
		}
		
		String[] answer = new String[answerList.size()];
		answerList.toArray(answer);
        return answer;
    }
}
