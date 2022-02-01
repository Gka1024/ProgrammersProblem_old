class Solution {
    
    static int GCD(int a, int b){ // 최대공약수
		if (a%b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}
    
    public long solution(int w, int h) {
        int gcd = GCD(w, h);
		long square;
		if(w == h)
		{
			square = 1;
		}
		else
		{
			square = (h / gcd) + ((w / gcd) - 1);
		}
		return (long)w*h - square*gcd;
    }
}
