public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk ==false && a<b && b<c || equalOk == true && a<=b && b<=c){
    return true;
  }
  return false;
}
