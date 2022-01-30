class Solution {
    static char[] friends = { 'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T' };
	static char[] order = new char[friends.length];
	static boolean[] isVisited = new boolean[friends.length];
	static int count = 0;

	public static void group_photo(int depth, String[] data, int n) {

		if (depth == friends.length) {

			String orderString = new String(order); // ex) TRNFAMCJ

			int correctCondition = 0;

			for (int i = 0; i < n; i++) {
				String temp = data[i]; // "M~C<2"
				int pos1 = orderString.indexOf(Character.toString(temp.charAt(0)));
				int pos2 = orderString.indexOf(Character.toString(temp.charAt(2)));
				int betweenNum = Math.abs(pos1 - pos2) - 1;
				int checkNum = Character.getNumericValue(temp.charAt(4));

				if (temp.charAt(3) == '=') {
					if (betweenNum == checkNum) {
						correctCondition++;
						continue;
					}
				}
				if (temp.charAt(3) == '<') {
					if (betweenNum < checkNum) {
						correctCondition++;
						continue;
					}
				}
				if (temp.charAt(3) == '>') {
					if (betweenNum > checkNum) {
						correctCondition++;
						continue;
					}
				}
			}

			if (correctCondition == n) {
				count++;
			}

		} else {
			for (int i = 0; i < friends.length; i++) {
				if (isVisited[i] == false) {
					isVisited[i] = true;
					order[depth] = friends[i];
					group_photo(depth + 1, data, n);
					isVisited[i] = false;
				}
			}
		}
	}
    
    public int solution(int n, String[] data) {
        count = 0;
        group_photo(0, data, n);
		return count;
    }
}
