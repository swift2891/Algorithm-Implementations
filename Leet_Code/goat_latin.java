import java.util.*;

public class goat_latin {
    public String toGoatLatin(String S) {

    	//Null Check
    	if(S == null)
    		return S;
        
      String[] splitInput = S.split("\\s+");
      String eachWord=" ", output;
      char firstLetter=' ';

      for(int i=0;i<splitInput.length;i++){
      	eachWord = splitInput[i];
        System.out.println("original word - "+eachWord);
      	firstLetter = eachWord.charAt(0);
      	if(firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i'
      		|| firstLetter == 'o'|| firstLetter == 'u'||firstLetter == 'A' || firstLetter == 'E' 
          || firstLetter == 'I' || firstLetter == 'O'|| firstLetter == 'U'){

      		eachWord = eachWord + "ma";
      		
          for(int j=0;j<i+1;j++){
            eachWord = eachWord+"a";
          }
          System.out.println(eachWord);
          splitInput[i] = eachWord;
     	 	}
     	 	else{
          System.out.println("substring - " + eachWord.substring(1,eachWord.length()));
     	 		eachWord = (eachWord.substring(1 , eachWord.length()))+firstLetter+"ma";
          for(int j=0;j<i+1;j++){
            eachWord = eachWord+"a";
          }
     	 		System.out.println(eachWord);
          splitInput[i] = eachWord;
     	 	}
      }
      // output = Arrays.toString(" ",splitInput);
      output = String.join(" ", splitInput);
      return output;

    }

    public static void main(String[] args){
      goat_latin tg=new goat_latin();
      System.out.println(tg.toGoatLatin("The quick brown fox jumped over the lazy dog"));

    }
}