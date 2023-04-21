public String endUp(String str) {
    if (str.length() <= 3) {
        return str.toUpperCase();
    }
    int startIndex = str.length() - 3;
    return str.substring(0, startIndex) + str.substring(startIndex).toUpperCase();
}
