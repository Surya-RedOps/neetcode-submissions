class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int p = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int pr = prices[j] - prices[i];
                if (pr > p) {
                    p = pr;
                }
            }
        }
        return p;
    }
}
