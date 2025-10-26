import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int count_good_files = 0;

        do {
            System.out.println(" Пожалуйста, укажите путь к файлу для парсинга:");

            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean fileIsDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println(" ^");
                System.out.println(" !!! Ошибка файла: введенная строка не ведет к существущему файлу!" );
                System.out.println(" ===");
                continue;
            }

            if (fileIsDirectory) {
                System.out.println(" !!! Ошибка файла: указанный путь ведет к папке, а не файлу!");
                System.out.println("     ^");
                continue;
            }

            // до сюда доходят корректные пути к файлу, можем путь сохранять и счетчик увеличивать
            //todo: кажется нужно проверять, а не дубль ли это ранее указанного файла, и не увеличивать счетчик, если дубль
            count_good_files++;

            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + count_good_files);
            System.out.println(" ===");

        } while (true);

    }

}