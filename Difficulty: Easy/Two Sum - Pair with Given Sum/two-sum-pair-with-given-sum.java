class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int t = target - arr[i];
            if(hash.containsKey(t)) return true;   
            else hash.put(arr[i], i);
        }
        return false; 
    }
}