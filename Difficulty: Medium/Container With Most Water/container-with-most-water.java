class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int max = 0;
        int l = 0;
        int r = arr.length - 1;
        while(l < r) {
            int curr = Math.min(arr[l], arr[r]) * (r - l);
            max = Math.max(max, curr);
            if(arr[l] < arr[r]) l++;
            else r--;
        }
        return max;
    }
}