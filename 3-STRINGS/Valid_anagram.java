import java.util.Arrays;

public class Valid_anagram {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ct);
        String p= new String(ch);
        String n = new String(ct);
        return p.equals(n);
        
        
    }
}
