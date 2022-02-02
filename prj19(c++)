#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";
    int num = n;
		int remainder;
		while(num != 0)
		{
			remainder = num % 3;
			num /= 3;
			if(remainder == 0)
			{
				answer = "4" + answer;
				num --;
			}
			else if(remainder == 1)
			{
				answer = "1" + answer;
			}
            else if(remainder == 2)
            {
                answer = "2" + answer;
            }
		}
    return answer;
}
