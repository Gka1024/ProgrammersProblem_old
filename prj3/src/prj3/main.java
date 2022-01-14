package prj3;
//https://programmers.co.kr/learn/courses/30/lessons/60057
public class main {

	public static void main(String[] args) {
		String s =  "baabcdcdababcdcd";
		// 4abcdedededed
		String temps = s;
		
	
		int stringLength = temps.length();
		
		for(int i  = 1; i < s.length()/2 + 1; i++)
		{ // i를 유닛의 길이로 설정 - 유닛: 단위를 의미함
			temps = s;
			for(int j = 0; j < temps.length()+1 - (i * 2); j = j+ i)
			{ // j를 유닛의 시작 인덱스로 설정
				String stringUnit = temps.substring(j , j+ i);
				System.out.println("unit : "+stringUnit);
				
				String stringRemain = temps.substring(j + i,j+i+i);
				// remain은 유닛 다음의 유닛만큼의 문자열을 의미.
				System.out.println("remain : "+stringRemain);
				System.out.println("temps : "+temps);
				
				if(stringUnit.matches(stringRemain))
				{ // 만약 유닛과 리메인이 같다면
					int count = 1; // 반복 횟수
					while(stringUnit.matches(stringRemain))
					{
						System.out.println(count++);
						temps = temps.substring(0,j) + temps.substring(j, j+i) + temps.substring(j + i + i);
						// tempstring에 (유닛 전까지의 기존 문자열)+ (유닛) + (리메인 이후의 문자열) => (리메인 삭제)
						if(j + i + i >temps.length())
						{ //리메인 이후의 문자열이 유닛의 길이보다 짧다면
							break;
						}
						stringRemain = temps.substring(j + i,j+i+i);
						//리메인 재설정
					}
					System.out.println(count); 
					System.out.println("remain : "+stringRemain);
					temps = temps.substring(0,j) +count+ temps.substring(j);
					System.out.println("temps : "+temps);
					j = j + (int)(Math.log10(count)+1); 
					// 숫자가 temps에 들어가므로, 숫자의 자릿수만큼 j를 옮기는 작업
				}
				
				if(temps.length() < stringLength)
				{ // 만약 temps 의 길이가 기존 문자열의 길이보다 짧다
					stringLength = temps.length();
					System.out.println("changed!" + temps);
				}
				System.out.println(" ");
			}
			
		}
		
		System.out.println(stringLength);
	}
}

/* take1 - temps = temps.substring(0,j) + repeatNum + stringUnit + temps.substring(j+i);

String stringUnit = temps.substring(pointer, i+ 1);
System.out.println("sun : "+stringUnit);

String stringRemain = temps.substring(stringUnit.length());
System.out.println("sre : "+stringRemain);

if(stringUnit.matches(stringRemain.substring(0,stringUnit.length())))
{
	int repeatNum = 1;
	while(true)
	{
		if(stringUnit.matches(stringRemain.substring(0,stringUnit.length())))
		{
			stringRemain = stringRemain.substring(stringUnit.length());
			repeatNum++;
			System.out.println(repeatNum + "  " + stringRemain);
		}
		else
		{
			temps = repeatNum + stringUnit + stringRemain;
			System.out.println("tmp : " + temps);
			pointer = pointer + 1 + stringUnit.length(); 
			break;
		}
		
	}
}*/
		
		/* take2
		if(stringUnit.length() > stringRemain.length())
		{
			break;
		}
		if(stringUnit.matches(stringRemain.substring(0,stringUnit.length())))
		{
			int repeatNum = 1;
			while(true)
			{
				if(stringRemain.length()!= 0)
				{
					if(stringUnit.matches(stringRemain.substring(0,stringUnit.length())))
					{
						stringRemain = stringRemain.substring(stringUnit.length());
						repeatNum++;
						System.out.println(repeatNum + "-" + stringRemain);
					}
					else
					{
						temps = temps.substring(0,i)+ repeatNum + stringUnit + stringRemain;
						System.out.println("tmp : " + temps);
						i++;
						break;
					}
				}
				else
				{
					temps = temps.substring(0,i)+ repeatNum + stringUnit + stringRemain;
					System.out.println("tmp : " + temps);
					i++;
					break;
				}
				
			}
			break;
		}
	}
}
		*/