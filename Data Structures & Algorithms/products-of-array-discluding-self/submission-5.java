class Solution {
    public int[] productExceptSelf(int[] nums) {
        // create a prefix product array
        // [1,2,4,6]
        // [1,1,2,   8,48]
        int[] prefix = new int[nums.length + 1];
        int[] news = new int[nums.length];
        int zeros = 0;
        prefix[0] = 1;

        for (int i = 0; i < nums.length; i++){
            if (prefix[i] * nums[i] == 0){
                prefix[i+1] = prefix[i];
                zeros++;
            } else{

            
            prefix[i + 1] = prefix[i] * nums[i];
            }
        }

        for (int i=0; i < nums.length; i++){
            if (zeros > 1){
                return new int[nums.length];
            }
            else if (nums[i] == 0){
                news[i] = prefix[nums.length] ;
            } else if (zeros == 1){
                news[i] = 0;

            } else{
            
            news[i] = prefix[nums.length] / nums[i];
            }
        }


        return news;





        
    }
}  
