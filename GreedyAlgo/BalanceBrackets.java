public class BalanceBrackets {
    public static void main(String[] args) {
        String s = "][][][";
        System.out.println(swapCount(s));
    }

    private static long swapCount(String s) {
        char[] ch = s.toCharArray();
        int countL = 0 , countR=0 , swap = 0 , imb = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='[') {
                countL++;
                if (imb>0) {
                    swap +=imb;
                    imb--;
                }
            }
            else if (ch[i] == ']') {
                countR++;
                imb = countR - countL;
            }
        }
        return swap;
    }
}
