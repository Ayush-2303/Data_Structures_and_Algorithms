import java.util.HashSet;

public class Contains_duplicates_using_hashmap {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> Seen = new HashSet<>();
            for ( int val : nums){
                if (Seen.contains(val)){
                    return true;
                }
                else{
                    Seen.add(val);
                }
            }return false;
       }
    }
