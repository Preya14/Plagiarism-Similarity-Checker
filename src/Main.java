import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Enter text manually");
        System.out.println("2. Compare text files");
        int choice = sc.nextInt();
        sc.nextLine();

        String text1 = "", text2 = "";

        if (choice == 1) {
            System.out.println("Enter first text:");
            text1 = sc.nextLine();

            System.out.println("Enter second text:");
            text2 = sc.nextLine();

        } else if (choice == 2) {
            System.out.println("Enter path of first file:");
            text1 = FileHandler.readFile(sc.nextLine());

            System.out.println("Enter path of second file:");
            text2 = FileHandler.readFile(sc.nextLine());
        }

        // Preprocess
        text1 = Preprocessor.cleanText(text1);
        text2 = Preprocessor.cleanText(text2);

        String[] words1 = Preprocessor.toWords(text1);
        String[] words2 = Preprocessor.toWords(text2);

        // LCS
        List<String> lcs = LCS.findLCS(words1, words2);

        double similarity = LCS.similarity(words1, words2, lcs.size());

        // Output
        System.out.println("\n--- Results ---");
        System.out.println("Text 1: " + text1);
        System.out.println("Text 2: " + text2);
        System.out.println("LCS Words: " + lcs);
        System.out.println("Similarity: " + String.format("%.2f", similarity) + "%");

        sc.close();
    }
}