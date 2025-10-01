class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       

     
        int total=numBottles;
        while(numBottles>=numExchange){
            int newb=numBottles/numExchange;
           
           int rem=numBottles % numExchange;
           total+=newb;
            numBottles=rem+newb;
             
        }

           return total;
        
    }
}