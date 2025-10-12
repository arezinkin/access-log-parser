import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите текст и нажмите <Enter>: ");

        // Считываем строку из командной строки
        String text = new Scanner(System.in).nextLine();

        System.out.println("Длина текста: " + text.length());


    }

}