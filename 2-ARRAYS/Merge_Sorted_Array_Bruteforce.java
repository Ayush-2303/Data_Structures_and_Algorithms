import java.util.ArrayList;
import java.util.Collections;

public class Merge_Sorted_Array_Bruteforce {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //creating an arraylist
        ArrayList <Integer> list = new ArrayList<>();
        //running a loop and adding the elements of num1 till m index inside the arraylist
        for (int val = 0 ; val < m ; val++){
            list.add(nums1[val]);
        }
        //running a loop and adding the elements of num2 till the n index inside the arraylist
        for (int num = 0 ; num < n; num++){
            list.add(nums2[num]);
        }    
        
        //sorting the arraylist elements
        Collections.sort(list);
        
        //now changing the elements of num1 with index and values of array list
        for (int i = 0 ; i< list.size(); i++){
            nums1[i] = list.get(i);
        }
    }
}

