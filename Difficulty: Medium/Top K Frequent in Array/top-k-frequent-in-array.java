class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        Map<Integer, Integer> hash = new HashMap<>();
        for(int n : arr) hash.put(n, hash.getOrDefault(n, 0) + 1);
        List<Integer> keys = new ArrayList<>(hash.keySet());
        Collections.sort(keys, (a, b) -> {
            if(hash.get(b) != hash.get(a)) return hash.get(b) - hash.get(a);
            else return b - a;
        });
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; i++) res.add(keys.get(i));
        return res;
    }
}
