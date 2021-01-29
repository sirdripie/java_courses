/**
 * This program tests the WordAnalyzer classs
 * @author Jason Miller
 * @version 1.0
 */
public class TestProg {
    int counter;
    public TestProg () {
        counter = 0;
    }
    public void countVowels(String word, int answer) {
        counter++;
        System.out.printf("Test %d: %s ... ",
        counter,word);
        WordAnalyzer wa = new WordAnalyzer(word);
        int guess = wa.countVowels();
        if (guess==answer) {
            System.out.printf("%d Perfect!\n",guess);
        } else {
            System.out.printf("%d Wrong! should be %d\n",
            guess,answer);
        }
    }
    public static void main () {
        TestProg tp = new TestProg();
        tp.countVowels("yellow",2);
        tp.countVowels("YELLOW",2);
        tp.countVowels("aeiou",5);
    }
}
