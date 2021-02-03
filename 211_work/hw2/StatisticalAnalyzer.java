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
        
        if (max != 0) {
            return max + recursiveSum(max - 1);
        } else {
            return max;
        }
    }

    public int getSum () {
        int sum = 0; 
        for(int i = 0; i < data.length; i++){
            
            sum += data[i];
            
        }
        return sum;
    }
    
    public int getMax () {
        
        int max = -1000000; 
        for(int i = 0; i < data.length; i++){
        
            if(data[i] > max){
                
                max = data[i] ;
            
            }
        
        }
        return max;
    }
    
    public int getMin () {
        
        int min = 1000000; 
        for(int i = 0; i < data.length; i++){
        
            if(data[i] < min){
                
                min = data[i] ;
            
            }
        
        }
        return min;
    }


    public int getMaxMinusMin() {
        
        return getMax() - getMin() ;
        
    }

    public double getAverage () {
       
        return getSum() / (double)data.length ;
        
    }    

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

}
