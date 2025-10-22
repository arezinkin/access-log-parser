import java.text.DecimalFormat;

public class NumberFunc {
    public static double fraction(double x)
    {
        // Не помню как учили обеспечивать точность на курсе, пришлось искать ответ во вне. Сложно проравться не удалось, поэтому математика

        double x1000 = x * 1000;
        System.out.println(x1000);

        int int_x_1000 = (int) x1000;
        System.out.println(int_x_1000);

        //if (double) x1000-int_x_1000 > 0.5 {}

        double x1000_3 = (double) int_x_1000 / 1000;
        System.out.println(x1000_3);

        double result = (x1000_3 - (int) x1000_3);
        System.out.println(result);
        return result;

    }


}
