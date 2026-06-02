import java.util.Arrays;

public class Contains_duplicates_no_hashmap {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for ( int i =1 ;  i<nums.length ; i++){
            if(nums[j] == nums[i]){
                return true;
            }
            else{
                j++;
                
            }
        }return false;
    }
}