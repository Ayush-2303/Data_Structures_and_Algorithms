public class Max_subarray_n3 {

    public int maxSubArray(int[] nums) {
        //Initialize to MIN_VALUE to safely handle negative number arrays
        int smax=Integer.MIN_VALUE;
        for (int i=0; i< nums.length; i++){
            
            for(int end=i ; end<nums.length; end++){
                int maxi=0;
                for (int st=i; st<=end ; st++){
                    maxi= maxi+ nums[st];
                    }
                smax= Math.max(maxi,smax);

            }
        } return smax;
        
    }
}

