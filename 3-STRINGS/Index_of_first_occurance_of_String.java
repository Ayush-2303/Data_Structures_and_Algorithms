public class Index_of_first_occurance_of_String {
    public int strStr(String haystack, String needle) {
        int i = 0;
        for (int j = 0; j < haystack.length() ; j++){
            if (needle.charAt(i)==haystack.charAt(j)){
                i++;

                if( i == needle.length()){
                    return j - needle.length()+1;
                }
            }
            else {
                j=j-i;
                i=0;
                
            }
        }return -1;
        
    }
}
