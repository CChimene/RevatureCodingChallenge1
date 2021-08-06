public class Problem1 {
	public int longestCommonSubsequence(String a, String b) {
		int max = 0;
		int current = 0;
		
		for(int i=0; i<b.length(); i++) {
			for(int j=0; j<a.length(); j++) {
				if(b.charAt(i) == a.charAt(j)) {
					current++;
					if(current > max) {
						max = current;
					}
				}
				else {
					current = 0;
				}
			}
		}
		
		return max;
	}
}