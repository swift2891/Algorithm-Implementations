public class mySubString{
	static Hashtable<Character,Integer> codes = new Hashtable<Character, Integer>();
	
	public static int getHash(){
		
	}
		
	//Rabin-Karp Algorithm
	public boolean searchStr(String inputStr, String targetStr){
		//Hashtable of codes
		
		for(character ch='a';ch<='z';ch++){
			codes.put(ch, Character.getNumericValue(ch));
		}
		
		//Hash value of search string
		int targetHash = getHash(targetStr);
		
		//compute hashes of main string
		//if there is a match,compare strings
		
		int prevHash = getHash(inputStr.subString(0,targetStr.length()));
		if(prevHash == targetHash)
			return true;
		//Compute consequtive Hashes
		int currentHash=0;
		for(j=0;j<inputStr.length()-targetStr.length();j++){
			currentHash = prevHash - (codes.get(inputStr.charAt(j))*(128^(targetStr.length()-1))) + codes.get(inputStr.charAt(j+targetStr.length()));
			if(currentHash == targetHash){
				//Compare Strings here. return if true.
			}
				
		}
		return false;
	}
	
	//Tester:		
	public static void main(String[] args){
		String str = args[0];
		String searchStr = args[1];
		//System.out.println(str+" "+searchStr);
		System.out.println(searchString(str, searchStr));
	}
	
}