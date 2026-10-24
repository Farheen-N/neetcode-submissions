class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hash = new HashSet<>();
        String number = Integer.toString(n);
        int sum = 0;
        boolean repeat = false;
        while (!repeat){
            for (int i=0;i<number.length();i++){
                sum = sum + (number.charAt(i) - '0') * (number.charAt(i) - '0');
            }
            if (sum == 1){
                return true;
            } else if (hash.contains(sum)){
                repeat = false;
                return false;
            }
            hash.add(sum);
            number = Integer.toString(sum);
            sum = 0;

        }
        return false;
        
    }
}
