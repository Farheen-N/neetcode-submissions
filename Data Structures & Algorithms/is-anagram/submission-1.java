class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0; i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i=0; i<t.length();i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        if (map.equals(map2)){
            return true;
        } else{
            return false;
        }







    }
}
