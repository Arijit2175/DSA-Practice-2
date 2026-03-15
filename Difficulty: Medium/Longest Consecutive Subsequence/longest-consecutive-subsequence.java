class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        int res = 0;
        for(int n : set) {
            if(!set.contains(n - 1)) {
                int curr = n;
                int length = 1;
                while(set.contains(curr + 1)) {
                    curr++;
                    length++;
                }
                res = Math.max(length, res);
            }
        }
        return res;
    }
}