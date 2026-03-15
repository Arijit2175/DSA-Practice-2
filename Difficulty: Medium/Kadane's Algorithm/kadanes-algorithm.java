class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int curr = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(curr, max);
        }
        return max;
    }
}
