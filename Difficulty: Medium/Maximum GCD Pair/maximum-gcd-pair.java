// User function Template for Java

class Solution {
    static int MaxGcd(int n, int a[]) {
        int max = 0;
        for(int num : a) max = Math.max(max, num);
        int[] freq = new int[max + 1];
        for(int num : a) freq[num]++;
        for(int i = max; i >= 1; i--){
            int count = 0;
            for(int j = i; j <= max; j += i){
                count += freq[j];
            }
            if(count > 1) return i; 
        }
        return 1;
    }
}