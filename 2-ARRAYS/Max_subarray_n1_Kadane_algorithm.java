public class Max_subarray_n1_Kadane_algorithm {
    public int maxSubArray(int[] nums) {
        //Initialize to MIN_VALUE to safely handle negative number arrays
        int smax=0;
        int maxi=Integer.MIN_VALUE;
        for (int i=0; i< nums.length; i++){
            smax=smax+nums[i];
            maxi= Math.max(maxi,smax);
            if( smax<0){
                smax=0;
            }
        } return maxi;
        
        
    }
}

