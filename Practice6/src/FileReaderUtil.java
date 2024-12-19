import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderUtil {
    public static int countLinesInFile(Path filePath) {
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні файлу: " + e.getMessage());
            return 0;
        }
    }
}