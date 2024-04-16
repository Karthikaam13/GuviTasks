package task11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "E:\\GUVI\\Java-Task\\task11\\FileHandlingTxtFile.txt";
        
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }
    
    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        
        reader.close();
    }

    
}
