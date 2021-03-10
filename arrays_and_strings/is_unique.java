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


