class twosum {
    public int[] TwoSum(int[] nums, int target) {
        int len = nums.length;
        
        // Loop through every element
        for (int i = 0; i < len; i++) {
            // Loop through elements before 'i' to find a match
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    // Return the indices immediately when found
                    return new int[] {j, i}; 
                }
            }
        }
        // Return an empty array if no solution is found (required by Java)
        return new int[] {}; 
    }
}