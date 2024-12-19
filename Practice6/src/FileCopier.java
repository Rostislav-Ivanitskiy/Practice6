import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCopier {
    public static void copyDataToNewFile(Path sourceFile, String destinationPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))) {
            Files.copy(sourceFile, (Path) writer);
            System.out.println("Дані скопійовано в файл: " + destinationPath);
        } catch (IOException e) {
            System.out.println("Помилка при копіюванні даних: " + e.getMessage());
        }
    }
}