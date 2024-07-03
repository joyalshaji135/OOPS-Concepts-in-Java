import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _08_FileHandlingDemo {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, World!";
        String additionalContent = " This is an additional line.";

        // Writing to a file
        writeFile(fileName, content);

        // Reading from a file
        String fileContent = readFile(fileName);
        System.out.println("Content of the file:");
        System.out.println(fileContent);

        // Appending to a file
        appendToFile(fileName, additionalContent);

        // Reading the file again to see the appended content
        String updatedContent = readFile(fileName);
        System.out.println("Updated content of the file:");
        System.out.println(updatedContent);

        // Checking if the file exists
        boolean fileExists = fileExists(fileName);
        System.out.println("Does the file exist? " + fileExists);
    }

    // Method to write content to a file
    public static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read content from a file
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

    // Method to append content to a file
    public static void appendToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(content);
            System.out.println("Content appended to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

    // Method to check if a file exists
    public static boolean fileExists(String fileName) {
        return Files.exists(Paths.get(fileName));
    }
}
