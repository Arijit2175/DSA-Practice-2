class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int l = 1;
        int r = 0;
        for(int ele : arr) r = Math.max(r, ele);
        int res = r;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            long h = 0;
            for(int n : arr) h += (n + mid - 1) / mid;
            if(h <= k) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }
}
