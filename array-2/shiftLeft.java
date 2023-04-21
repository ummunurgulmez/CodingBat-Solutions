public int[] shiftLeft(int[] nums) {
if (nums.length <= 1) {
return nums; // no change needed for empty or single-element array
}

int firstElement = nums[0];

for (int i = 0; i < nums.length - 1; i++) {
nums[i] = nums[i+1];
}

nums[nums.length-1] = firstElement;

return nums;
}
