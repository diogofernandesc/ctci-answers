import java.util.HashSet;

class Solution {
    public boolean isUnique(String str) {
        // Assumes standard ASCII character set
        if (str.length() > 128) {
            return false;
        }
        HashSet<Character> seenSet = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if (seenSet.contains(val)) {
                return false;
            
            } else {
                seenSet.add(val);
            }
        }
        return true;
    }

}


// Without the hashset it's O(n^2)
class Solution2 {
    public boolean isUnique(String str) {
        // Assumes standard ASCII character set
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                char next = str.charAt(j);
                if (val == next) {
                    return false;
                }

            }
        }
        return true;
    }
}


