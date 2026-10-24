class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] arr = map.keySet().toArray(new Integer[0]);

        Arrays.sort(arr, (a, b) -> map.get(a) - map.get(b));

        int[] sorted = new int[k];

        for (int i = 0; i < k; i++) {
            sorted[i] = arr[arr.length - 1 - i];
        }

        return sorted;
        
    }
}
