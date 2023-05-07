  public boolean sameEnds(int[] nums, int len) {
    int[] result1 = new int[len];
    int[] result2 = new int[len];
    for (int i = 0; i < len; i++) {
        result1[i] = nums[i];
        result2[i] = nums[nums.length - len + i];
    }
    for (int i = 0; i < len; i++) {
    if (result1[i] != result2[result2.length - len + i]) {
        return false;
    }
    }
    return true;
}

 
  


