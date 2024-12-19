import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCreator {
    public static void createDirectory(String directoryName) {
        Path directoryPath = Paths.get(directoryName);
        try {
            Files.createDirectories(directoryPath);
            System.out.println("Директорія " + directoryName + " створена.");
        } catch (IOException e) {
            System.out.println("Не вдалося створити директорію: " + e.getMessage());
        }
    }
}