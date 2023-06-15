package ua.lviv.iot.algo.part1.lab1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PalindromeWords {
 public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
 public void printPalindromeWords(String text, int minLength) {
        if (text == null || text.isEmpty()) {
            System.out.print("Text is empty\n");
            return;
        }
        String regex = "\\b(\\w)(\\w*?)\\1\\w*?\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> palindromeWords = new ArrayList<>();

        while (matcher.find()) {
            String word = matcher.group().toLowerCase();
            if (word.length() >= minLength && isPalindrome(word)) {
                palindromeWords.add(word);
            }
        }
        System.out.print("Palindrome words in the text:");
        for (String palindromeWord : palindromeWords) {
            System.out.print(palindromeWord);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text:");
        String text = scanner.nextLine();

        System.out.print("Enter minimum length:");
        int minLength = scanner.nextInt();

        PalindromeWords palindromeWords = new PalindromeWords();
        palindromeWords.printPalindromeWords(text, minLength);
    }
}
