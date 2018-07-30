//Given an array find if it has Unique characters
// Assuming ASCII 128 characters String

import java.util.*;

public class CCI_1_1{
	
	public static boolean checkUnique(String inputStr){
	
	if(inputStr.length()>128)
		return false;
	
	boolean[] charSet = new boolean[128];
	Arrays.fill(charSet,false);
	for(int i=0;i<inputStr.length();i++){
		int val = inputStr.charAt(i);
		if(charSet[val]){
			return false;
		}
		charSet[val] = true;
	}
	return true;
	}
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		System.out.println(checkUnique(str));
	}
}