class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            StringBuilder newPrefix = new StringBuilder();

            int j = 0;
            while (j < prefix.length() && j < s.length()) {
                if (prefix.charAt(j) == s.charAt(j)) {
                    newPrefix.append(prefix.charAt(j));
                    j++;
                } else {
                    break;
                }
            }

            prefix = newPrefix.toString();
            if (prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
    }
}
