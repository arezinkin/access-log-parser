import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int count_good_files = 0;

        String path;

        do {
            System.out.println(" Пожалуйста, укажите путь к файлу для парсинга:");

            path = new Scanner( System.in ).nextLine().trim();

            System.out.println( path );

            File file = new File( path );
            boolean fileExists = file.exists();
            boolean fileIsDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println(" ^");
                System.out.println(" !!! Ошибка файла: введенная строка не ведет к существущему файлу!");
                System.out.println(" ===");
                continue;
               // throw new IllegalArgumentException( "the file does not exist or is blocked" );
            }

            if (fileIsDirectory) {
                System.out.println(" !!! Ошибка файла: указанный путь ведет к папке, а не файлу!");
                System.out.println("     ^");
                continue;
                 // throw new IllegalArgumentException( "the specified file is a folder, and only files are processed" );
            }

            // до сюда доходят корректные пути к файлу, можем путь сохранять и счетчик увеличивать
            //todo: кажется нужно проверять, а не дубль ли это ранее указанного файла, и не увеличивать счетчик, если дубль
            count_good_files++;

            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + count_good_files);
            System.out.println(" ===");

            int countLines = 0;
            int maxLineLength = 0;
            int minLineLength = -1;

            try {

                FileReader fileReader = new FileReader(path);

                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine()) != null) {

                    countLines ++;

                    int length = line.length();

                    if (length > 1024) {throw new LogParserExceptionsLengthLineInFile( path, countLines, length );}
                    if (length > maxLineLength) {maxLineLength = length;}
                    if (minLineLength < 0 | length < minLineLength) {minLineLength = length;}
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        System.out.println( "Всего строк в файле: " + countLines );
        System.out.println( "Длина самой длинной строки: " + maxLineLength );
        System.out.println( "Длина самой короткой строки: " + minLineLength );

       } while (true);

    }


}