public boolean has12(int[] nums) {
  for (int i=0;i<nums.length;i++){
    if(nums[i] == 1){
      for(int y = i+1; y<nums.length;y++){
        if(nums[y] == 2){
          return true;
        }
      }
    }
  }
  return false;
}
