import java.io.Console;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Створюємо директорію "users_directory"
        String directoryName = "users_directory";
        DirectoryCreator.createDirectory(directoryName);

        // Створюємо файл для збереження даних користувачів
        File file = new File(directoryName, "users.txt");

        // Записуємо інформацію про користувачів у файл
        UserInfoWriter.writeUserInfo(file);


        Path filePath = file.toPath();
        int lineCount = FileReaderUtil.countLinesInFile(filePath);
        System.out.println("Кількість рядків у файлі: " + lineCount);


        System.out.println("Введіть шлях до файлу для копіювання даних:");
        String destinationPath = getUserInput();

        FileCopier.copyDataToNewFile(filePath, destinationPath);
    }


    private static String getUserInput() {
        try {

            Console console = System.console();
            if (console == null) {
                throw new IOException("Консоль не доступна");
            }
            return console.readLine();
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні шляху до файлу: " + e.getMessage());
            return "";
        }
    }
}