class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        if(arr == null || arr.length < 2) return new int[0];
        int[] res = new int[arr.length];
        res[0] = 1;
        for(int i = 1; i < arr.length; i++) res[i] = res[i - 1] * arr[i - 1];
        int prod = 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            res[i] *= prod;
            prod *= arr[i];
        }
        return res;
    }
}
