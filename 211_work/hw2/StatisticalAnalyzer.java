// TO DO: Remove this comment.
// TO DO: Add JavaDoc throughout this class.
public class StatisticalAnalyzer {
    int [] data;
    public StatisticalAnalyzer (int [] data) {
        this.data = data;
    }

    public int iterativeSum (int max) {
        int answer = 0;
        while (max>0) {
            answer += max--;
        }
        return answer;
    }

    public int recursiveSum (int max) {
        return 0; // TO DO: fix this.
        // You must use recursion. 
        // Return sum of numbers from i to zero.
        // Assume i>=0 and include i in the sum.
    }

    public int getSum () {
        return 1; // TO DO: fix this. 
        // Use iteration.
    }

    public int getMaxMinusMin() {
        return 2; // TO DO: fix this. 
        // Use iteration and variables that track min and max.
    }

    public double getAverage () {
        return 3.0; // TO DO: fix this. 
        // Use getSum() and division.
        // Don't use integer division!
    }    

    public double getStdDev () {
        return 4.0; // Extra credit
        // Compute the standard deviation.
        // Use getAverage(), Math.pow(x,2), and Math.sqrt().
    }

}
