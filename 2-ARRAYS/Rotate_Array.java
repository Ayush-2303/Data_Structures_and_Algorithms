public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        //reversing the entire array
        reverse (nums,0,n-1);
        //reversing till the k elements
        reverse (nums,0,k-1);
        //reversing the entire array again
        reverse(nums,k,n-1);
    }
        //applying while loop to make the function which reverses the array from the start and the end point
        private void reverse(int[] nums, int start, int end){
            while( start < end ){
                int temp = nums[start];
                nums[start]= nums [end];
                nums[end]= temp;
                start++;
                end--;
            }

        }
}
