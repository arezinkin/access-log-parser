import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Это не по заданию, а для души. А то почти все воскресенье учусь.
        System.out.println(" ");
        System.out.println("   -= Привет! Добро пожаловать в программу работы с числами! =-");
        System.out.println("           Это важный шаг в жизни любой программы!");
        System.out.println(" ");

        System.out.println(" !!! Пожалуйста, введите ПЕРВОЕ целое число и нажмите <Enter>: ");
        // TODO: явно нужно сделать проверку на вводимый тип данных, если ввести не число, то программа падает по ошибке. Может exception поставить? но нас пока не учили как :(
        int input_number1 = new Scanner(System.in).nextInt();

        System.out.println(" !!! Введите ВТОРОЕ целое число и нажмите <Enter>: ");
        // TODO: явно нужно сделать проверку на вводимый тип данных, если ввести не число, то программа падает по ошибке. Может exception поставить? но нас пока не учили как :(
        int input_number2 = new Scanner(System.in).nextInt();

        System.out.println(" - сумма введённых чисел: " + (input_number1+input_number2)
                            + " . Формула: " + input_number1 + "+" + input_number2);

        System.out.println(" - разность введённых чисел: " + (input_number1-input_number2)
                + " . Формула: " + input_number1 + "-" + input_number2);

        System.out.println(" - произведение9 введённых чисел: " + (input_number1*input_number2)
                + " . Формула: " + input_number1 + "*" + input_number2);

        double chastnoe = (double) input_number1/input_number2;

        if (input_number2!=0) {
            System.out.println(" - частное введённых чисел: " + chastnoe
                    + " . Формула: " + input_number1 + "/" + input_number2);
        } else {
            System.out.println(" - частное введённых чисел: Второе введённое число = 0, операция деления не доступна!");
        }

    }

}