//Manually checking 
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            
            if (!isAlphaNumeric(ci)) {
                i++;
            } else if (!isAlphaNumeric(cj)) {
                j--;
            } else {
                if (toLowerCase(ci) != toLowerCase(cj)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    
    // Custom helper to check if a char is a letter or digit
    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || 
               (c >= 'A' && c <= 'Z') || 
               (c >= '0' && c <= '9');
    }
    
    // Custom helper to convert uppercase to lowercase manually
    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32); // ASCII trick: 'A' (65) + 32 = 'a' (97)
        }
        return c;
    }
}
//Via Character functions a bit slow but works fine
class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            char ci=s.charAt(i);
            char cj=s.charAt(j);
            if(!Character.isLetterOrDigit(ci)){
                i++;continue;
            }
            if(!Character.isLetterOrDigit(cj)){
                j--;continue;
            }
            if(Character.isLetterOrDigit(ci) && Character.isLetterOrDigit(cj)){
                if(Character.toLowerCase(ci)!=Character.toLowerCase(cj)) return false;
                i++;j--;
            }

        }
        return true;
    }
}
