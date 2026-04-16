public class Preprocessor {

    public static String cleanText(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("[^a-zA-Z0-9 ]", "");
        text = text.replaceAll("\\s+", " ").trim();
        return text;
    }

    public static String[] toWords(String text) {
        return text.split(" ");
    }
}