package exercises;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(excerpt);
        String lowerCaseExcerpt = excerpt.toLowerCase();

        System.out.println("Please enter a character or word to search for: ");
        String wordToSearch = input.nextLine();

        if(lowerCaseExcerpt.contains(wordToSearch.toLowerCase()))
            System.out.println("String Found: " + wordToSearch);
        else
            System.out.println("String not found :(.");

        System.out.println(lowerCaseExcerpt.indexOf(wordToSearch.toLowerCase()));
        String editedExcerpt = excerpt.replaceAll(wordToSearch, "");
        System.out.println(editedExcerpt);

    }
}
