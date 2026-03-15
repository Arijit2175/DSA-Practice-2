class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);
        int sum = 0; 
        int count = 0;
        for(int n : arr) {
            sum += n;
            if(hash.containsKey(sum - k)) count += hash.get(sum - k);
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}