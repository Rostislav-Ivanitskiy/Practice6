import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserInfoWriter {
    public static void writeUserInfo(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Ім'я, Вік, Стать\n");
            writer.write("Іван, 25, Чоловік\n");
            writer.write("Марія, 30, Жінка\n");
            writer.write("Петро, 22, Чоловік\n");
            writer.write("Олена, 28, Жінка\n");
            System.out.println("Інформацію записано у файл " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Помилка при запису в файл: " + e.getMessage());
        }
    }
}