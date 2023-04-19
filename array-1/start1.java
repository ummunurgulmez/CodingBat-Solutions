public int start1(int[] a, int[] b) {
  int sum = 0;
  if(a.length > 0 && a[0] == 1){
    sum++;
  }
    if(b.length > 0 && b[0] == 1){
    sum++;
  }
  return sum;
}
