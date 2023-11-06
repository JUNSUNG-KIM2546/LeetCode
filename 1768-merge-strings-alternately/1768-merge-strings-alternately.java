import java.util.Scanner;
class Solution {
    public String mergeAlternately(String word1, String word2) {
			String merged = "";
			int j = 0;
			
			if(1 <= word1.length() && word2.length() <= 100) {
				if (word1.length() <= word2.length()) {
					for (int i=0; i < word1.length(); i++) {
						merged += word1.substring(i,i+1) + word2.substring(i,i+1);
						j = i;
					}
					if (j < word2.length()) {
						merged += word2.substring(j+1);
					}
				}
				
				else {
					for (int i=0; i < word2.length(); i++) {
						merged += word1.substring(i,i+1) + word2.substring(i,i+1);
						j = i;
					}
					if (j < word1.length()) {
						merged += word1.substring(j+1);
					}
				}
				System.out.println(merged.toLowerCase());
				return merged.toLowerCase();
			}
			
			else {
				merged = "Not String";
				System.out.println(merged);
				return merged;
			}
		}
}