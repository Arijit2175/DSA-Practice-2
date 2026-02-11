class Solution {
    public int minCost(int[] heights, int[] cost) {
        // code here
        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;
        for(int ele : heights) {
            l = Math.min(l, ele);
            h = Math.max(h, ele);
        }
        while(l < h) {
            int m = l + (h - l) / 2;
            int c1 = compute(heights, cost, m);
            int c2 = compute(heights, cost, m + 1);
            if(c1 <= c2) h = m;
            else l = m + 1;
        }
        return compute(heights, cost, l);
    }
    
    int compute(int[] heights, int[] cost, int h) {
        int total = 0;
        for(int i = 0; i < cost.length; i++) total += Math.abs(heights[i] - h) * cost[i];
        return total;
    }
}
