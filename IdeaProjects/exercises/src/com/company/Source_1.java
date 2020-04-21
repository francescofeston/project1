package com.company;

import java.util.*;
public class Source_1 {
	//Method to check if two strings are anagram of each other or not
	public static boolean check(String str1, String str2){
	
	 //check two strings length and return false if they are different in length
        if(str1.length() !=  str2.length()) {
            return  false;
        }

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        // Sort both strings
        arrange(ch1);
        arrange(ch2);

        // Compare sorted strings
        for (int i = 0; i < ch1.length; i++)
            if (ch1[i] != ch2[i])
                return false;

        return true;
	}
	//Method to sort the character array
	public static void arrange(char[] ch){
		//Write your code here
		Arrays.sort(ch);
	}
	
	public static void main(String[] x){
		Map<String,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String key;
		String value;
		for(int i = 1; i <= num; i++){
			key = sc.next();
			value = sc.next();
			map.put(key,value);
		}
		boolean anagramExists = false;
        for(String keyString : map.keySet()){
            if(check(keyString, map.get(keyString))) {
                System.out.println(keyString + " : " + map.get(keyString));
                anagramExists = true;
            }
        }

        if(!anagramExists) {
            System.out.println("false");
        }
	}
}
