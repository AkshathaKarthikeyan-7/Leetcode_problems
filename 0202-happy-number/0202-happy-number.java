import java.util.*;

class Solution {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        return checkHappy(n, seen);
    }

    public boolean checkHappy(int n, Set<Integer> seen) {

        if (n == 1) {
            return true;
        }

        if (seen.contains(n)) {
            return false;
        }

        seen.add(n);

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit);
            temp = temp / 10;
        }

        return checkHappy(sum, seen);
    }
}
