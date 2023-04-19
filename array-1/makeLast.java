public int[] makeLast(int[] nums) {
 int nums2[] = new int [nums.length*2];
   nums2[nums.length*2-1] = nums[nums.length-1];
 return nums2;
}
