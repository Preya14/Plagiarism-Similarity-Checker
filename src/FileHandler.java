import java.io.*;

public class FileHandler {

    public static String readFile(String path) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return content.toString();
    }
}