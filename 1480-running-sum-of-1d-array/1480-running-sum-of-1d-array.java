class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int i = 0;

        while (i < n) {
            if (i == 0) {
                temp[i] = nums[i];
                i++;
            } 
            else if (i == 1) {
                temp[i] = nums[i - 1] + nums[i];
                i++;
            } 
            else {
                temp[i] = temp[i - 1] + nums[i];
                i++;
            }
        }
        return temp;
    }
}
