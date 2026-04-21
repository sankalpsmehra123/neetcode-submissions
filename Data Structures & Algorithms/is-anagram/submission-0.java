class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> sCharacterCountMap = new HashMap<>();
        HashMap<Character, Integer> tCharacterCountMap = new HashMap<>();
        for(char c : s.toCharArray()){
            sCharacterCountMap.merge(c, 1, Integer::sum);
        }
        for(char c : t.toCharArray()){
            tCharacterCountMap.merge(c, 1, Integer::sum);
        }
        if (sCharacterCountMap.equals(tCharacterCountMap)){
            return true;
        }
        return false;
        
    }
}
