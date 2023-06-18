package Pack1;

public class TheLongestWord {
    public static String findTheLongestWord(String word1, String word2, String word3) {
        String longestWord;

        if (word1.length() >= word2.length() && word1.length() >= word3.length()) {
            longestWord = word1;
        } else if (word2.length() >= word1.length() && word2.length() >= word3.length()) {
            longestWord = word2;
        } else {
            longestWord = word3;
        }
        return longestWord;
    }


    public static void main(String[] args) {
        String word1 = "eye";
        String word2 = "desk";
        String word3 = "computer";

        String longestWord = findTheLongestWord(word1, word2, word3);
        System.out.println("The longest word is " + longestWord);
    }

}