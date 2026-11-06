class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        int consecutive = 0;
        int prev = 0;
        int next = 0;

        for (int i =0; i<nums.length; i++){
            if (set.contains(nums[i] -1)){
                prev = nums[i] - 1;
                while (set.contains(prev)){
                    consecutive++;
                    prev --;
                }
            }

            if (set.contains(nums[i] + 1)){
                prev = nums[i] + 1;
                while (set.contains(prev)){
                    consecutive++;
                    prev ++;
                }
            }

            consecutive++;
            if (consecutive > longest){
                longest = consecutive;
            }

            set.add(nums[i]);
            consecutive = 0;




        }
        return longest;


        
    }
}
