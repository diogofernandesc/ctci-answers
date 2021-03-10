import java.util.HashSet;

// This is my preferred solution with HashSet O(n)
// HashSet contains is O(1)
class Solution {
    public boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashSet<Character> seenSet = new HashSet<Character>();
        for (int i = 0; i < str1.length(); i++) {
            char val = str1.charAt(i);
            seenSet.add(val);
        }

        for (int j = 0; j < str2.length(); j++) {
            char val = str1.charAt(j);
            if (!seenSet.contains(val)) {
                return false;
            }

        }
        return true;
    }

}

// Alternatively we can sort the array and compare via index which is O(n log n)