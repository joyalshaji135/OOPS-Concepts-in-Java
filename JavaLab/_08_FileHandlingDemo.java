import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _08_FileHandlingDemo {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, World!";
        String additionalContent = " This is an additional line.";

        writeFile(fileName, content);

        String fileContent = readFile(fileName);
        System.out.println("Content of the file:");
        System.out.println(fileContent);

        appendToFile(fileName, additionalContent);

        String updatedContent = readFile(fileName);
        System.out.println("Updated content of the file:");
        System.out.println(updatedContent);

        boolean fileExists = fileExists(fileName);
        System.out.println("Does the file exist? " + fileExists);
    }

    public static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static String readFile(String fileName) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    public static void appendToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(content);
            System.out.println("Content appended to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

    public static boolean fileExists(String fileName) {
        return Files.exists(Paths.get(fileName));
    }
}
