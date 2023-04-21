public int[] fizzArray3(int start, int end) {
    int[] fizzArray = new int[end - start];
    for (int i = 0; i < end - start; i++) {
        fizzArray[i] = start + i;
    }
    return fizzArray;
}
