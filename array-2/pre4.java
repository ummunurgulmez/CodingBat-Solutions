public int[] pre4(int[] nums) {
int i = 0;
while (nums[i] != 4) {
i++;
}
int[] last = new int[i];
for (int y = 0; y < i; y++) {
  last[y] = nums[y];
}

return last;
}
