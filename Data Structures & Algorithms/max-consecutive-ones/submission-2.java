class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0;
        int max = 0;
        int prev;

        for (int i=0;i<nums.length;i++){
            if (consecutive == 0 && nums[i] == 1){
                consecutive++;
            } else if (nums[i] == 1){
                consecutive++;
            } else if (nums[i] == 0){
                if (consecutive > max){
                    max = consecutive;
                }
                consecutive = 0;

            }
            if (consecutive > max){
                max = consecutive;
            }

        }
        return max;




    }
}