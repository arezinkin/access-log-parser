public class NumberFunc {
    public static double fraction(double x) {
        // Не помню как учили обеспечивать точность на курсе, пришлось искать ответ во вне.
        // но умные функции выглядят сложно и сходу заставить их работать не удалось
        // поэтому через математику - зато прозрачно на примитивных типах

        // нужна точность 3, умножаем на 1000 наше входное число
        double x1000 = x * 1000;
        // у умноженного числа отбрасываем дробную часть
        int int_x_1000 = (int) x1000;
        // если бы не точность 3 знака, было бы проще, а так смотрим дробную часть умноженного числа, если больше 0,5
        // то добавляем 1 к целому увеличенному на 1000
        if (x1000 - int_x_1000 > 0.5) {
            int_x_1000++;
        }

        // вернем тот же порядок исходного числа разделив 1000 целое округленное число нужно точности
        double xAround_3 = (double) int_x_1000 / 1000;
        // ну и собственно имея число с точностью 3-х знаков после запятой, округленное по правилам математики выделяем
        // дробную часть
        double result = (xAround_3 - (int) xAround_3);

        return result;

    }

    public static int sumLastNums(int x) {
        //System.out.println(23);
        //int x=123%10; // х будет иметь значение 3
        //int у=123/10; // у будет иметь значение 12

        int lastsymbol = x % 10;
        int predlast = (x / 10) % 10;

        return lastsymbol + predlast;

    }

    public static int charToNum(char x) {

        // зафикисм код символа 0
        int char_number_0 = 48;
        // так как коды 0 до 9 идут подряд, то можно легким вычитанием получать цифру символа
        return (int)x-char_number_0;

    }

    public static boolean isPositive(int x) {

        return x >= 0;

    }

    public static boolean is2Digits(int x) {

        return x > 9 && x < 100;

    }

    public static boolean isUpperCase(char x) {

        //System.out.println("наш х: " + (int) x);

//        int number_char_A = 65;
//        int number_char_Z = 90;

        //return (int) x >= number_char_A && (int) x <= number_char_Z;
        return x >= 'A' && x <= 'Z';

    }

    public static boolean isInRange(int a, int b, int num) {

        boolean result = ( (num >= a && num <= b) || (num >= b && num <= a) );

        return result;

    }

    public static boolean isDivisor (int a, int b) {

        int a_div_b_ost =  a%b;
        int b_div_a_ost =  b%a;

        return ((a_div_b_ost == 0) || (b_div_a_ost == 0));

    }

    public static boolean isEqual (int a, int b, int c) {

        return ((a == b) && (a == c) && (b == c));

    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }

    public static int abs(int x) {

        return x<0?-x:x;

    }

    public static int safeDiv(int x, int y) {

        return y==0?0:x/y;
    }

    public static int max(int x, int y) {

        return y>x?y:x;

    }

    public static String makeDecision(int x, int y) {

        if (x>y) {return x+">"+y;}
        if (x<y) {return x+"<"+y;}
        return x+"=="+y;

    }

    public static int max3(int x, int y, int z) {

        if ((x>y)&&(x>z)) {return x;}
        if (y>z) {return y;}
        return z;

    }

    public static boolean sum3(int x, int y, int z) {

        if ((x+y==z)||(x+z==y)||(y+z==x)) {return true;}

        return false;

    }

    public static int sum2(int x, int y) {

        int result = x+y;
        return (result>=10&&result<20)?20:result;

    }

    public static boolean is35(int x) {

        int div3 = x%3;
        int div5 = x%5;
        // false условие проще: оба не дали остаток или оба дали остаток
        if ((div3==0 && div5==0)||((div3!=0 && div5!=0))) {return false;}
        return true;

    }

    public static boolean magic6(int x, int y) {

        //x+y  x-y  y-x y x
        // как буд-то бы так
        if ((x==6)||(y==6)||(x+y==6)||(x-y==6)||(y-x==6)) {return true;}
        return false;

    }

    public static String age(int x) {
//        Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой сначала будет число х, а затем одно из слов:
//        год
//        года
//        лет
//        Слово “год” добавляется, если число х заканчивается на 1, кроме чисел оканчивающихся на 11.
//        Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел оканчивающихся на 12, 13, 14.
//        Слово “лет” добавляется во всех остальных случаях.
//                Подсказка: оператор % позволяет получить остаток от деления.

        // возьмем остаток от деления на 10 и на 100
        int ost_10 = x%10;
        int ost_100 = x%100;

        // скорее всего лет
        String add_year = "лет";
        // условие, чтоб вывести год
        if (ost_10==1&&ost_100!=11) {
            add_year = "год";}
        // условие, чтоб вывести года
        else if ((ost_10==2&&ost_100!=12)||(ost_10==3&&ost_100!=13)||(ost_10==4&&ost_100!=14)) {
            add_year = "года";}

        return x+" "+ add_year;

    }

    public static String day(int x) {

        //по мне, когда много return (а можно в каждом case) - это плохо читается
        String day = "";
        switch (x) {
            case 1: day = "понедельник"; break;
            case 2: day = "вторник"; break;
            case 3: day = "среда"; break;
            case 4: day = "четверг"; break;
            case 5: day = "пятница"; break;
            case 6: day = "суббота"; break;
            case 7: day = "воскресенье"; break;
            default: day = "это не день недели";
        }

        return day;

    }

    public static void printDays(String x) {

        switch (x) {
            case "понедельник": System.out.println( "понедельник" );
            case "вторник":     System.out.println( "вторник");
            case "среда":       System.out.println( "среда");
            case "четверг":     System.out.println( "четверг");
            case "пятница":     System.out.println( "пятница");
            case "суббота":     System.out.println( "суббота");
            case "воскресенье": System.out.println( "воскресенье"); break;
            default:            System.out.println( "это не день недели" );
        }

    }

    public static String listNums(int x) {

        String result = "";
        // чтоб пробела в конце итоговой строки не было х добавим отдельно уже за циклом (по условию x выводится всегда)
        for (int i =0; i<x; i++) {
            result = result + i + " ";
        };
        result = result + x;
        return result;
    }

    public static String reverseListNums(int x) {

        String result = "" + x;
        // чтоб пробела в конце итоговой строки не было х добавим отдельно уже за циклом (по условию x выводится всегда)
        for (int i = x-1; i>=0; i--) {
            result = result + " " + i;
        };
        return result;
    }

    public static String chet(int x) {

        String result = "0";
        // чтоб пробела в конце итоговой строки не было: 0 добавим перед циклом (по условию 0 выводится всегда)
        for (int i=2; i<=x; i+=2) {
            result = result + " " + i;
        };
        return result;

    }

    public static int pow(int x, int y) {

        int result = 1;
        for (int i = 0; i<y; i++) {
            result = result*x;
        }
        return result;
    }

    public static int numLen(long x) {

        int result = 1;

        while (x>9) {
            x = (x/10);
            result++;
        }
        return result;
    }

    public static boolean equalNum(int x) {

        Boolean result = true;
        // Правое число выделим остатком от деления на 10
        int ost_10 = x%10;
        // Пока число 2-х значное и не переопределили result бегаем
        while ( x>9 && result ) {
            x = (x / 10);
            if (ost_10 != x % 10) { result = false; }
        }
        return result;

    }

    public static void square(int x) {

        // можно циклом в цикле, но как будто эффективнее так:
        // соберем строку из символов
        String st_x = "";
        for (int i = 0; i<x; i++) {
            st_x += "*";
        }
        // выводим строку сколько нужно раз
        for (int i = 0; i<x; i++) {
            System.out.println(st_x);
        }

    }

    public static void leftTriangle(int x) {

        for (int i = 0; i<x; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    // вариант 2, интересен if заменен на третий цикл
    public static void rightTriangle(int x) {

        for (int i = 0; i<x; i++) {
            // Выведем сначала нужно число пробелов
            for (int j = 0; j<x-i-1; j++) {
                { System.out.print(" ");}
            }
            // добъем звездочками
            for (int j=i; j>=0; j--) {
                {System.out.print("*");}
            }
            System.out.println("");
        }

    }

    // этот вариант мне нравится сильно больше, проще читается
    public static void rightTriangle2(int x) {

        for (int i = 0; i<x; i++) {
            // Выведем сначала нужно число пробелов
            for (int j = 0; j<x; j++) {
                if (j<x-i-1) {System.out.print(" ");}
                else { System.out.print("*");}
            }
            System.out.println("");
        }

    }

    public static void guessGame() {
        int randomNum = 4;
        int x = 0;

        // для числа попыток
        int count_trying = 0;

        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            count_trying++;

            if (x == randomNum) { break; }

            System.out.println("No, try again");
        // здесь можно выйти в будущем по числу попыток или поставить иное условие выхода из цикла кроме успеха
        } while (true);

        System.out.println("Yes, it`s " + randomNum);
        System.out.println("You guessed it in " + count_trying + " tries");
    }


}

