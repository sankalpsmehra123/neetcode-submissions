class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sAlphaNumeric = trimToAlphaNumeric(s);
        return sAlphaNumeric.toString().equals(sAlphaNumeric.reverse().toString());
    }
    private StringBuilder trimToAlphaNumeric(String str){
        StringBuilder result = new StringBuilder();
        for (char c: str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                result.append(Character.toLowerCase(c));
            }
        }
        return result;
    }
}
