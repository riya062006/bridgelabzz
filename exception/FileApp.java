import java.io.*;

class FileHandler {
    public FileHandler(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists())
            throw new IOException("File not found: " + filename);
        System.out.println("File opened successfully!");
    }
}

public class FileApp {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("data.txt");
        } catch (IOException e) {
            System.out.println("Error while opening file: " + e.getMessage());
        }
    }
}
