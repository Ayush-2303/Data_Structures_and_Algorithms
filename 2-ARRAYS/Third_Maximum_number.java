import java.util.Arrays;
import java.util.HashSet;

class Third_Maximum_number{

    public int thirdMax(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for (int val:nums){
            set.add(val);
        }
        int [] new_arr = new int[set.size()];
        int i=0;
        for (int run: set){
            new_arr[i]=run;
            i++;
        }
        Arrays.sort(new_arr);
        if(new_arr.length >=3){
            return new_arr[new_arr.length - 3];
        }
        else{
            return new_arr[new_arr.length - 1];
        }
    }
}