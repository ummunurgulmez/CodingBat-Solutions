public boolean only14(int[] nums) {
  int i=0;
  if(nums.length>0){
  while(i<nums.length){
    if(nums[i] !=1 && nums[i] !=4){
      return false;
    }
    i++;
  }
  }
  return true;
}
