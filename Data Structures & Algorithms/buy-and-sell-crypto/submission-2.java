class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minp = prices[0];
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] < minp) {
                minp = prices[i];
            }
            p = Math.max(p,prices[i] - minp);
        }
        return p;
    }
}
