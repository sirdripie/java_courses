/**
 * The StatisticalAnalyzer class accepts multiple integers and contains
 * a method that can complete multiple statistical functions.
 * 
 * @author Travis Green, II
 * @version v0.1
 */
public class StatisticalAnalyzer {
    int [] data;
    /**
     * StatisticalAnalyzer constructor
     * 
     * @param data - sets array
     */
    public StatisticalAnalyzer (int [] data) {
        this.data = data;
    }
    
    /**
     * What is the sum from 0 to max (iterative) 
     * 
     * @param max     - the max integer to add up to
     * @return answer - the sum from 0 to max
     */
    public int iterativeSum (int max) {
        int answer = 0;
        while (max>0) {
            answer += max--;
        }
        return answer;
    }
    
    /**
     * What is the sum from 0 to max (recursive)
     * 
     * @param max     - the max integer to add up to
     * @return answer - the sum from 0 to max
     */
    public int recursiveSum (int max) {
        int answer = 0;
        if (max != 0) {
            answer = max + recursiveSum(max - 1);
        } else {
            answer = max;
        }
        return answer;
    }
    
    /**
     * What is the sum of data 
     * 
     * @return sum - numbers in data array are added together
     */
    public int getSum () {
        int sum = 0; 
        for(int i = 0; i < data.length; i++){
            
            sum += data[i];
            
        }
        return sum;
    }
    
    /**
     * What is the max of data
     * 
     * @return max - largest number of data array
     */
    public int getMax () {
        
        int max = -1000000; 
        for(int i = 0; i < data.length; i++){
        
            if(data[i] > max){
                
                max = data[i] ;
            
            }
        
        }
        return max;
    }
    
    /**
     * What is the min of data
     * 
     * @return min - smallest number of data array
     */
    public int getMin () {
        
        int min = 1000000; 
        for(int i = 0; i < data.length; i++){
        
            if(data[i] < min){
                
                min = data[i] ;
            
            }
        
        }
        return min;
    }
    
    /**
     * What is the max of data minus the min of data
     * 
     * @return getMax() - getMin() - max minus min
     */

    public int getMaxMinusMin() {
        
        return getMax() - getMin() ;
        
    }
    
    /**
     * What is the average of data
     * 
     * @return getSum() / (double)data.length - the average of data array
     */
    public double getAverage () {
       
        return getSum() / (double)data.length ;
        
    }    
    
    /**
     * What is the standard deviation of data
     * 
     * @return stdDev - the standard deviation of data array
     */
    public double getStdDev () {
        
        double mean = getAverage();
        double variance = 0;
        double stdDev = 0;
        for(int i=0; i < data.length; i++){
        
            variance += Math.pow(data[i] - mean , 2) ; 
        
        }
         variance /= (double)data.length ;
         stdDev = Math.sqrt(variance);
         return stdDev;
        
    }
    /**
     * The given StdDev sum is off by a bit. 
     */
}
