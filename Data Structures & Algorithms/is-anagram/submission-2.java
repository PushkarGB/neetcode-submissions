class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> ht1 = new HashMap<>();
        Map<Character, Integer> ht2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            ht1.put(s.charAt(i), ht1.getOrDefault(s.charAt(i), 0) + 1);
            ht2.put(t.charAt(i), ht2.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ht1.containsKey(ch) && ht2.containsKey(ch)){
                if(ht1.get(ch).equals(ht2.get(ch))){
                    continue;
                }
                return false;
            }
            return false;
        }

        return true;
    }
}
