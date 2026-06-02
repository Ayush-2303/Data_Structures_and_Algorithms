public class Max_subarray_n1_Kadane_algorithm {
    public int maxSubArray(int[] nums) {
        
        int smax=0;
        int maxi=0;
        for (int i=0; i< nums.length; i++){
            smax=smax+nums[i];
            //if sum of two alternate numbers is -ve we will change current sum to 0
            if( smax<0){
                smax=0;
            }
            maxi= Math.max(maxi,smax);
            
            
        } return maxi;
        
    }
}

