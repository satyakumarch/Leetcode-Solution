// Java program to find maximum length equal
// character string with k changes

public class GFG
{
	// method to find the maximum length of
	// substring having character ch
	static int findLen(String A, int n, int k, char ch)
	{
		int maxlen = 1;
		int cnt = 0;
		int l = 0, r = 0;
		
		// traverse the whole string
		while (r < n) {
		
			/* if character is not same as ch
			increase count */
			if (A.charAt(r) != ch)
				++cnt;
	
			/* While count > k traverse the string
			again until count becomes less than k
			and decrease the count when characters
			are not same */
			while (cnt > k) {
				if (A.charAt(l) != ch)
					--cnt;
				++l;
			}
	
			/* length of substring will be rightIndex -
			leftIndex + 1. Compare this with the maximum
			length and return maximum length */
			maxlen = Math.max(maxlen, r - l + 1);
			++r;
		}
		return maxlen;
	}
	
	// method which returns maximum length of substring
	static int answer(String A, int n, int k)
	{
		int maxlen = 1;
		for (int i = 0; i < 26; ++i) {
			maxlen = Math.max(maxlen, findLen(A, n, k, (char) (i+'A')));
			maxlen = Math.max(maxlen, findLen(A, n, k, (char) (i+'a')));
		}
		return maxlen;
	}
	
	// Driver Method
	public static void main(String[] args)
	{
		int n = 5, k = 2;
		String A = "ABABA";
		System.out.println("Maximum length = " + answer(A, n, k));
	
		n = 6; k = 4;
		String B = "HHHHHH";
		System.out.println("Maximum length = " + answer(B, n, k));
	}
}
