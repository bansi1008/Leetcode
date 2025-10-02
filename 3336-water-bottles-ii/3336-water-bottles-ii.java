class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total=numBottles;

        int e=numBottles;
        while(e>=numExchange){
            e=e-numExchange;
            numExchange++;
            total++;
            e++;
            
        }
return total;


        
    }
}