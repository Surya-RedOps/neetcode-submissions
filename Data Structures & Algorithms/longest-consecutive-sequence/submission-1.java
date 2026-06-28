class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int longest = 0;
        for (int i : nums) {

            if (!set.contains(i-1)) {
                int len = 1;
                int curr = i;
                while (set.contains(curr + 1)) {
                    len++;
                    curr++;
                    
                }
                longest = Math.max(longest,len);
                
            }
        }
        return longest;
    }    
}

