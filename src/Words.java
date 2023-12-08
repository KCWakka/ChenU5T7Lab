public class Words {
    private Words() {}
    public static boolean doesContain(String word1, String word2) {
        if (word2.indexOf(word1) != -1) {
            return true;
        } else {
            return false;
        }
    }
    public static void printReverse(String word) {
        String str = "";
        for (int i = word.length(); i > 0; i--) {
            str = word.substring(i-1, i);
            System.out.print(str);
            System.out.print(" ");
        }
        System.out.println();
    }
}
