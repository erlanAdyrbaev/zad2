public class StringProcessor {
    public String copy(String s, int N) {
        String str1 = new String();
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                str1 = str1.concat(s);
            }
            return str1;

        } else if (N == 0) {
            return str1;

        }
        throw new IllegalArgumentException("отрицательное значение N ");

    }

    public int entryOfString(String one, String two) { // результат : кол во вхождение второй строки в первую. при two == null && two equals "" нужно исключение
        if (two != null && !two.equals("")) {
            int i = 0;
            int k = 0;
            while (one.indexOf(two, i) >= 0) {
                i = one.indexOf(two, i) + 1;
                k++;
            }
            return k;
        }
            throw new IllegalArgumentException("Строка пустая или null ");
    }
    public String swapNum123(String str)
    {
        String returnStr = new String(str);
        returnStr = returnStr.replaceAll("1", "one");
        returnStr =  returnStr.replaceAll("2","two");
        returnStr =  returnStr.replaceAll("3", "three");
        return returnStr;
    }
    public void delete2Char(StringBuilder str) {
        int i = 1;
        while (i < str.length()) {
            str.deleteCharAt(i);
            i++;
        }
    }
}





