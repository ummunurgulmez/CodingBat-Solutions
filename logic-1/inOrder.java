public boolean inOrder(int a, int b, int c, boolean bOk) {
  if((bOk == false && b>=a && c>=b) || (bOk == true && c>b) ){
    return true;
  }
  return false;
}
