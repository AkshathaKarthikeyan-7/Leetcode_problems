class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        int total = (a*(a+1))/2; 
        int sum = 0;
        for(int i = 0; i < a; i++){
            sum += nums[i];
        }
        int missing = total - sum;
        return missing;
    }
}