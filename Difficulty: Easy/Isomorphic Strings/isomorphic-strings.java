class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Character> hash = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(hash.containsKey(c1)) { if(hash.get(c1) != c2) return false; }
            else { if(set.contains(c2)) return false; }
            hash.put(c1, c2);
            set.add(c2);
        }
        return true;
    }
}