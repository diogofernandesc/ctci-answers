class Solution {
    // keep track of this "diff" value which is a measure of (a) how many spaces we originally have and (b) how many spaces we have left as we progress through the string.
    public void urlify(String str, int trueLength) {
        char[] charArray = str.toCharArray();
        int spaces = 0;
        for (int i = 0; i < trueLength; i++) {
            spaces++;
        }
        int diff = spaces * 2;
        for (int j = trueLength; j >= 0 || diff == 0 ; j--) {
            if (String.valueOf(charArray[j]) == " ")  {
                charArray[j+diff] = '0';
                j--;
                charArray[j+diff] = '2';
                j--;
                charArray[j+diff] = '%';
                diff = diff - 2;
            
            } else {
                charArray[j + diff] = charArray[j];
            }

        }

    }
}
