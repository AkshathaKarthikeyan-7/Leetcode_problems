class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int reverse = 0;
        while(dup > 0){
            int last_digit = dup%10;
            dup = dup/10;
            reverse = (reverse * 10)+last_digit;
        }
        return reverse == x;
    }
}
