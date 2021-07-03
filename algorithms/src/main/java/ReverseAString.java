public class ReverseAString {

    public String reverseAString(String input) {
        String retVal = null;
        // Simplest
        retVal = reverseByIteratingArray(input); // O(N)
        return retVal;
    }

    private String reverseByIteratingArray(String input) {
        StringBuilder retVal = new StringBuilder();
        if (input != null && input.length() > 0) {
            char[] chars = input.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                retVal.append(chars[i]);
            }
        }
        return retVal.toString();
    }
}
