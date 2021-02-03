import java.util.*;
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

    public void showStats(int [] data, int sum, int maxmin, double avg, double stddev) {
        counter++;
        System.out.printf("Test %d\n",counter);
        System.out.printf(" Data: %s\n",Arrays.toString(data));
        StatisticalAnalyzer sa = new StatisticalAnalyzer(data);
        System.out.printf(" Stat: %10s %10s %10s %10s\n",
            "Sum","Max-Min","Average", "StdDev");
        System.out.printf(" Comp: %10d %10d %10.2f %10.3f\n",
            sa.getSum(),
            sa.getMaxMinusMin(),
            sa.getAverage(),
            sa.getStdDev() );
        System.out.printf(" Answ: %10d %10d %10.2f %10.3f\n",
            sum, maxmin, avg, stddev);
    }

    public void showSums (int max) {
        if (max >= 0) {
            counter++; 
            System.out.printf("Test %d\n",counter);
            StatisticalAnalyzer sa = new StatisticalAnalyzer(null);
            System.out.printf(" Sum to %d. Answer %d. Computed %d.\n",
                max, sa.iterativeSum(max), sa.recursiveSum(max));
        }
    }

    public static void main () {
        TestProg tp = new TestProg();
        int [] data1 = {1,2,3,4};
        tp.showStats(data1,10,3,2.5,1.3);
        int [] data2 = {10,50,30,40,20};
        tp.showStats(data2,150,40,30,15.8);
        //
        tp.showSums(5);
        tp.showSums(10);
    }
}
