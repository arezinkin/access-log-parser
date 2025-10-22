import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" !!! Пожалуйста, введите ПЕРВОЕ0, число и нажмите <Enter>: ");
        // TODO: явно нужно сделать проверку на вводимый тип данных, если ввести не число, то программа падает по ошибке. Может exception поставить? но нас пока не учили как :(
        double input_number1 = new Scanner(System.in).nextDouble();

        System.out.println("Дробная часть числа: " + NumberFunc.fraction(input_number1));


    }

}