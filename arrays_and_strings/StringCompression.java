class StringCompression {
    public static void main(String[] args) {
        String initialString = "aabcccccaaa";
        StringBuilder finalString = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < initialString.length(); i++) {
            String letter = null;
            String next = null;
            letter = Character.toString(initialString.charAt(i));
            if (i != initialString.length() - 1) {
                next = Character.toString(initialString.charAt(i+1));
            }
            if (next != null && letter.equals(next)) {
                counter++;

            } else {
                finalString.append(letter);
                finalString.append(counter);
                counter = 1;
            }
        }

        System.out.println(finalString);
    }
}