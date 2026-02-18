class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        return merge(arr, new int[arr.length], 0, arr.length - 1);
    }
    static int merge(int[] arr, int[] temp, int l, int r) {
        if(l >= r) return 0;
        int m = l + (r - l) / 2;
        int count = merge(arr, temp, l, m) + merge(arr, temp, m + 1, r);
        int i = l, j = m + 1, k = l;
        while(i <= m && j <= r) {
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                count += (m - i + 1);
            }
        }
        while(i <= m) temp[k++] = arr[i++];
        while(j <= r) temp[k++] = arr[j++];
        for(i = l; i <= r; i++) arr[i] = temp[i];
        return count;
    }
}