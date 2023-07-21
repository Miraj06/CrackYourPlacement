class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] mi = new int[n];
        int[]  ku= new int[n];
        mi[0] = 1;
        ku[0] = 1;
        int low = 1;

        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (mi[j] > max) {
                        max = mi[j];
                        count = ku[j];
                    } else if (mi[j] == max) {
                        count += ku[j];
                    }
                }
            }
            ku[i] = count;
            mi[i] = max + 1;
            if (low < mi[i]) {
                low = mi[i];
            }
        }

        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (mi[i] == low) {
                c += ku[i];
            }
        }

        return c;
    }
}
