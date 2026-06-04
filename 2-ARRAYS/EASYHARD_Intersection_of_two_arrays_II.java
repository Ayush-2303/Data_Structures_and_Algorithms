import java.util.ArrayList;
import java.util.HashMap;

public class EASYHARD_Intersection_of_two_arrays_II {
    public int[]
     intersect(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int val:nums1){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        ArrayList <Integer> resultlist = new ArrayList<>();
        for ( int acc: nums2){
            if(map.containsKey(acc) && map.get(acc)>0){
                resultlist.add(acc);
                map.put(acc, map.get(acc)-1);

            }
        }
        int[] ret = new int[resultlist.size()];
        for (int i = 0; i< resultlist.size();i++){
            ret[i]=resultlist.get(i);
        }
        return ret;
    }
}
