class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String, ArrayList<String>> hash =new HashMap<>();
        for(String s : arr){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!hash.containsKey(key)) hash.put(key, new ArrayList<>());
            hash.get(key).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}
