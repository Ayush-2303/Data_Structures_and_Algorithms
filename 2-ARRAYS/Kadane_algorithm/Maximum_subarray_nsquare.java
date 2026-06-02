public class Maximum_subarray_nsquare {
    public int maxSubArray(int[] nums) {
        //Initialize to MIN_VALUE to safely handle negative number arrays
        int smax=Integer.MIN_VALUE;
        for (int i=0; i< nums.length; i++){
            int maxi=0;
            for(int end=i ; end<nums.length; end++){
                maxi=maxi+nums[end];
                smax=Math.max(maxi,smax);

            }
        } return smax;
        
    }
}
    

