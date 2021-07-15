public class ReverseAString {

    public String reverseByIteratingArray(String input) {
        StringBuilder retVal = new StringBuilder();
        if (input != null && input.length() > 0) {
            char[] chars = input.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                retVal.append(chars[i]);
            }
        }
        return retVal.toString();
    }

    // abcdef
    // f(bcdef)                             + a
    // f(cdef)                      + b     + a
    // f(def)                   +c  + b     + a
    // f(ef)            + d     +c  + b     + a
    // f(f)         + e + d     +c  + b     + a
    // f(f)         + e + d     +c  + b     + a
    // f("")    +f  + e + d     +c  + b     + a
    // ""       +f  + e + d     +c  + b     + a
    public String reverseUsingRecursion(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        System.out.printf("\nreverseUsingRecursion([%s]) + [%s]", input.substring(1), input.charAt(0));
        return reverseUsingRecursion(input.substring(1)) + input.charAt(0);
    }

}
