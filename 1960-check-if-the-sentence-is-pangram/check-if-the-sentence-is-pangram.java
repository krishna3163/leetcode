class Solution {
    public boolean checkIfPangram(String sentence) {
        // Boolean array to mark characters
        boolean[] seen = new boolean[26];

        // Traverse each character
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }

        // Check if all 26 letters are present
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
}
