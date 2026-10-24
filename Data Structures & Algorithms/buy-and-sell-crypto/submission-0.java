class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int smallest = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (prices[i] < smallest){
                smallest = prices[i];
            } else if (prices[i] > smallest){
                if (diff < prices[i] - smallest){
                    diff = prices[i] - smallest;
                }
            }

            


        }
        return diff;


        
    }
}
