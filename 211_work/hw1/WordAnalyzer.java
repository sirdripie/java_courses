/**
 * The WordAnalyzer class accepts a word and contains a method
 * that can count the number of vowels in that word.
 * 
 * @author Travis Green, II
 * @version v0.1
 */
public class WordAnalyzer {
    private String word;
    
    /**
     * WordAnalyzer constructor 
     * 
     * @param word sets private String
     */
    public WordAnalyzer(String word)    {
        this.word = word;
    }
    
    /**
     * How many vowels are in the private String
     * 
     * @return numOfVowels - the number of vowels in the String
     */
    public int countVowels () {
        int numOfVowels = 0;
        for(int i=0; i<word.length(); i++ ){    
            char current = Character.toUpperCase(word.charAt(i));
            if(current == 'A' || current == 'E' || current == 'I' || current == 'O' || current == 'U') {        
              numOfVowels++;      
            }
        }
        return numOfVowels;
    }
}
