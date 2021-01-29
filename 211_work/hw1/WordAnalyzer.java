// TO DO: Remove this comment.
// TO DO: Add JavaDoc throughout this class.
public class WordAnalyzer {
    private String word;
    public WordAnalyzer(String word)    {
        this.word = word;
    }

    // TO DO: Remove this comment.
    // TO DO: Fix this method.
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
