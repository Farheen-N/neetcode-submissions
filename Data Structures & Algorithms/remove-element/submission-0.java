class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == val){
                nums[i] = 999;
                k--;
                
            }
        }

        int pos = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != 999){
                nums[pos] = nums[i];
                pos++;
            }
        }
        return k;

    }
}