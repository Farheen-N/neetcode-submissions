class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<HashMap<Character, Integer>> maps = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++){
            HashMap<Character, Integer> hash = new HashMap<>();

            for (int j=0; j < strs[i].length(); j++){
                hash.put(strs[i].charAt(j), hash.getOrDefault(strs[i].charAt(j) , 0) + 1);
            }
            maps.add(hash);
        }
        HashSet<Integer> added = new HashSet<>();
        for (int i = 0; i < maps.size(); i ++){
            
            List<String> words = new ArrayList<>();

            if (!added.contains(i)){
            words.add(strs[i]);
            added.add(i);
            }


            for (int j = i+1; j < maps.size(); j ++){
                if (maps.get(i).equals(maps.get(j)) && !added.contains(j)){
                    words.add(strs[j]);
                    added.add(j);
                    


                }
            }
            if (words.size() > 0){
                result.add(words);
            }
            
        }



        return result;

        







        
    }
}
