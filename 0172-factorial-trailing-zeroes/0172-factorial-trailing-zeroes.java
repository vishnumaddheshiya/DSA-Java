class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        int i = 5;
        while(i<=n) {
            ans = ans + (n/i);
            n = n/5;
        }
        return ans;
    }
}