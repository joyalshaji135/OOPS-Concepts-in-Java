import java.io.*;

public class _09_EmployeeFileHandling {
    public static void main(String[] args) {
        String fileName = "employees.txt";

        
        String employeeDetails = "EmployeeID,Name,Position,Salary\n"
                                + "101,John Doe,Software Engineer,75000\n"
                                + "102,Jane Smith,Project Manager,85000\n"
                                + "103,Emily Johnson,HR Specialist,70000";

        
        writeToFile(fileName, employeeDetails);

        readFromFile(fileName);
    }

    
    public static void writeToFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] contentBytes = content.getBytes();
            fos.write(contentBytes);
            System.out.println("Employee details written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            System.out.println("Contents of the file:");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
