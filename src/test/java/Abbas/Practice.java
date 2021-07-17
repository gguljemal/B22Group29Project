package Abbas;

public class Practice {
    public static void main(String[] args) {
        System.out.println(setUp("civic"));

    }
    public static boolean setUp(String word){
        boolean isPalindrome = true;
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i)!=word.charAt(word.length()-1-i)){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
