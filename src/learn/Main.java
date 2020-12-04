package learn;

import java.util.HashSet;

public class Main {
	
	static int MAX_CHAR = 26;
	
	public static void main(String[] args) {
		System.out.println("Hello!");
		int[] a = {8,7,2,5,3,1};
		int sum = 10;
		findPair(a, sum);
		
		String s = "abcdeebfcda";
		firstRepeatingChar(s);
		substring();
	}
	
	public static void findPair(int[] input, int sum) {
		for(int i=0; i<=input.length-1;i++) {
			for(int j=i+1;j<=input.length;j++) {
				if(input[i]+input[j]==sum) {
					System.out.println("findPair - Output : "+i+" and "+j);
					return;
				}
			}
		}
		System.out.println("Pair not found");
	}
	
	public static void firstRepeatingChar(String s) {
		char[] arr = s.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			char c = arr[i];
			
			if(hs.contains(c)) {
				System.out.println("firstRepeatingChar : "+c);
				return;
			}
			
			hs.add(c);
		}
		
		System.out.println("Not Exist");
	}
	
	public static void substring() {
		String s = "aabbcc"; 
	    int k = 2; 
	    System.out.println(substrings(s, k)); 
	  
	    s = "aabbc"; 
	    k = 2; 
	    System.out.println(substrings(s, k));
	}
	
	static int substrings(String s, int k) 
	{ 
	    int res = 0; // Initialize result 
	  
	    // Pick a starting point 
	    for (int i = 0; i< s.length(); i++) 
	    {
	  
	        // Initialize all frequencies as 0 
	        // for this starting point 
	        int freq[] = new int[MAX_CHAR]; 
	  
	        // One by one pick ending points 
	        for (int j = i; j<s.length(); j++)  
	        { 
	  
	            // Increment frequency of current char  
	            int index = s.charAt(j) - 'a'; 
	            freq[index]++; 
	  
	            // If frequency becomes more than 
	            // k, we can't have more substrings 
	            // starting with i 
	            if (freq[index] > k) 
	                break; 
	  
	            // If frequency becomes k, then check 
	            // other frequencies as well. 
	            else if (freq[index] == k &&  
	                check(freq, k) == true) 
	                res++; 
	        }
	    } 
	    return res; 
	}
	
	static boolean check(int freq[], int k) 
	{ 
	    for (int i = 0; i < MAX_CHAR; i++) 
	        if (freq[i] !=0 && freq[i] != k) 
	            return false; 
	    return true; 
	}
}
