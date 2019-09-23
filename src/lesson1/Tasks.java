package lesson1;

import java.util.Random;

public class Tasks {
    private static final Random RANDOM = new Random();
    private static final int DEFAULT_HOURS_VALUE = 24;
    private static final int DEFAULT_MINUTES_VALUE = 60;
    private static final int DEFAULT_SECONDS_VALUE = 60;

    public static void main(String[] args) {
        System.out.println("lesson1\n");

        runTask1();
        runTask2();
        runTask3();
        runTask4();
        runTask5();
        runTask6();
        runTask7();
        runTask8();
        runTask9();
        runTask10();
        runTask11();
        runTask12();
        runTask13();
        runTask14();
        runTask15();
        runTask16();
        runTask17();
        runTask18();
        runTaskAdvancedLevel2();
    }

    private static void runTask1() {
        System.out.println("1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести " +
                "равна 16% от силы тяжести на Земле.");
        double weight = 42;
        double weightMoon;
        double coefficient = 1 - 0.16;
        weightMoon = weight * coefficient;
        System.out.println("масса = " + weight);
        System.out.println("масса на Луне = " + weightMoon);
        System.out.println("");
    }

    private static void runTask2() {
        System.out.println("2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.");
        System.out.print("исходный массив рандомных чисел = ");
        double[] array = createRandomArray(4);
        increaseBy10(array); // метод, который увеличивает каждый элемент массива на 10%
        System.out.print("каждый элемент массива увеличен на 10% = ");
        printArray(array);
    }

    private static double[] createRandomArray(int countElement) {
        double[] array = new double[countElement];
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(100);
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
        return array;
    }

    private static void printArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
    }

    private static void increaseBy10(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(array[i] * 1.1);
        }
    }

    private static void runTask3() {
        System.out.println("3. Напишите метод, который будет проверять является ли число палиндромом (одинаково " +
                "читающееся в обоих направлениях).");
        int number = 12521;
        isPalindrome(number); //метод, который проверяет является ли число палиндромом
        System.out.println("");
    }

    private static void isPalindrome(int number) {
        int namber1 = number;
        int reverse = 0;
        while (namber1 != 0) {
            reverse = reverse * 10 + namber1 % 10; // новое число перевернутое
            namber1 = namber1 / 10;
        }
        if (reverse == number) {
            System.out.println(number + " - палиндромом");
        } else {
            System.out.println(number + " - НЕ палиндромом");
        }
    }

    private static void runTask4() {
        System.out.println("4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)");
        int valueStart = 1;
        int valueEnd = 100;
        for (int i = valueStart; i <= valueEnd; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    private static void runTask5() {
        System.out.println("5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)");
        int valueStart = 1;
        int valueEnd = 15;
        for (int i = valueStart; i <= valueEnd; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }

        }
        System.out.println("\n");
    }

    private static void runTask6() {
        System.out.println("6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления " +
                "(используя только цикл for)");
        int valueStart = 1;
        int valueEnd = 100;
        for (int i = valueStart; i <= valueEnd; i += 2) {
            System.out.print(i + 1 + " ");
        }
        System.out.println("\n");
    }

    private static void runTask7() {
        System.out.println("7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)");
        int valueStart = 20;
        int valueEnd = 200;
        int sum = 0;
        for (int i = valueStart; i <= valueEnd; i++) {
            sum += i;
        }
        System.out.println(sum + "\n");
    }

    private static void runTask8() {
        System.out.println("8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому " +
                "числу (используя цикл и оператор if else)");
        String month;
        int valueStart = 1;
        int valueEnd = 12;
        for (int i = valueStart; i <= valueEnd; i++) {
            if (i == 1) {
                month = "январь";
            } else if (i == 2) {
                month = "февраль";
            } else if (i == 3) {
                month = "март";
            } else if (i == 4) {
                month = "апрель";
            } else if (i == 5) {
                month = "май";
            } else if (i == 6) {
                month = "июнь";
            } else if (i == 7) {
                month = "июль";
            } else if (i == 8) {
                month = "август";
            } else if (i == 9) {
                month = "сентябрь";
            } else if (i == 10) {
                month = "октябрь";
            } else if (i == 11) {
                month = "ноябрь";
            } else {
                month = "декабрь";
            }
            System.out.println(i + " " + month);
        }
        System.out.println("");
    }

    private static void runTask9() {
        System.out.println("9. Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы " +
                "значение первой оказалось во второй, а второй - в первой.");
        int firstInteger = 10;
        int secondInteger = 20;
        System.out.println("firstInteger = " + firstInteger + " secondInteger = " + secondInteger);
        firstInteger = firstInteger + secondInteger;
        secondInteger = firstInteger - secondInteger;
        firstInteger = firstInteger - secondInteger;
        System.out.println("firstInteger = " + firstInteger + " secondInteger = " + secondInteger + "\n");
    }

    private static void runTask10() {
        System.out.println("10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения, " +
                "а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.");
        int firstInteger = RANDOM.nextInt(100);
        int secondInteger = RANDOM.nextInt(100);
        int sum;
        sum = firstInteger + secondInteger;
        System.out.println("Сумма чисел " + firstInteger + " и " + secondInteger + " = " + sum + "\n");
    }

    private static void runTask11() {
        System.out.println("11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.");
        int number1 = 50;
        int number2 = 30;
        int number3 = 50;
        System.out.println("Исходные данные: number1 = " + number1 + ", number2 = " + number2 + ", number3 = " + number3);
        determineGreatest(number1, number2, number3);
    }

    private static void determineGreatest(int number1, int number2, int number3) {
        int maxNamber;
        String result;
        if (number1 > number2) {
            maxNamber = number1;
            result = "number1";
        } else {
            if (number1 == number2) {
                maxNamber = number2;
                result = "number1 = number2";
            } else {
                maxNamber = number2;
                result = "number2";
            }
        }
        if (number3 > maxNamber) {
            maxNamber = number3;
            result = "number3";
        } else if (number3 == maxNamber) {
            result = result + " = number3";
        }
        System.out.println("Наибольшее число = " + result + " = " + maxNamber + "\n");
    }

    private static void runTask12() {
        System.out.println("12. Напишите программу, в которой используются две переменные логического типа (boolean), " +
                "присвойте им значения и выведете для каждой переменной на экран строку \"истина\", если переменная " +
                "имеет значение true и \"ложь\", если переменная имеет значение false.");
        boolean variable1 = true;
        boolean variable2 = false;
        System.out.println("variable1");
        isTrue(variable1);
        System.out.println("variable2");
        isTrue(variable2);
        System.out.println("");
    }

    private static void isTrue(boolean variable) {
        if (variable) {
            System.out.println("истина");
        } else {
            System.out.println("ложь");
        }
    }

    private static void runTask13() {
        System.out.println("13. Напишите программу, где двум строковым переменным присваиваются значения, третей же " +
                "строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк. Затем напечатайте " +
                "значение третьей строковой переменной.");
        String str1 = "Storm ";
        String str2 = "Area 51!";
        String str3;
        System.out.println("Исходные данные: str1 = " + str1 + ", str2 = " + str2);
        str3 = str1 + str2;
        System.out.println(str3);
        System.out.println("");
    }

    private static void runTask14() {
        System.out.println("14. Создайте программу с двумя переменными целого типа, присвойте им значения, если " +
                "первая переменная больше второй, то увеличьте её значение на 3, иначе увеличьте значение второй " +
                "переменной на 8. В конце программы выведите значения обоих чисел на экран.");
        int value1 = RANDOM.nextInt(100);
        int value2 = RANDOM.nextInt(100);
        System.out.println("init value1 = " + value1 + " value2 = " + value2);
        if (value1 > value2) {
            value1 += 3;
        } else {
            value2 += 8;
        }
        System.out.println("value1 = " + value1 + " value2 = " + value2 + "\n");
    }

    private static void runTask15() {
        System.out.println("15. Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в " +
                "одной программе):\n" +
                "for\n" +
                "while\n" +
                "do while");
        int valueStart = 1;
        int valueEnd = 100;
        for (int i = valueStart; i <= valueEnd; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int i = 1;
        while (i <= valueEnd) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= valueEnd);
        System.out.println("\n");
    }

    private static void runTask16() {
        System.out.println("16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например," +
                " если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. Минимум, " +
                "максимум и шаг указываются пользователем (можно захардкодить).");
        int minNamber = 10;
        int maxNamber = 100;
        int step = 25;
        for (int i = minNamber; i <= maxNamber; i += step) {
            if (i > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    private static void runTask17() {
        System.out.println("17. Все элементы массива поделить на значение наибольшего элемента этого массива.");
        System.out.print("исходный массив рандомных чисел = ");
        double[] array = createRandomArray(6);
        double maxElement = findMaxElement(array);
        System.out.print("элементы массива поделены на значение максимального = ");
        divisionByMaxElement(array, maxElement);
        printArray(array);
    }

    private static double findMaxElement(double[] array) {
        double maxElement = 0;
        for (double anArray : array) {
            if (anArray > maxElement) {
                maxElement = anArray;
            }
        }
        return maxElement;
    }

    private static void divisionByMaxElement(double[] array, double maxElement) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) Math.round(array[i] / maxElement * 10000) / 10000;
        }
    }

    private static void runTask18() {
        System.out.println("18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов " +
                "укажите кол-во рублей и курс.");
        double usdRate = 2.034;
        double byn = 1000;
        double usd;
        System.out.println("usdRate = " + usdRate + " byn = " + byn);
        usd = Math.round(byn / usdRate * 100) / 100d;
        System.out.println("usd = " + usd + " \n");
    }

    private static void runTaskAdvancedLevel2() {
        System.out.println("AdvancedLevel 2. Напишите программу, которая будет считать количество часов, минут и " +
                "секунд в n-ном количестве суток.");
        int days = 10;
        int hours = days * DEFAULT_HOURS_VALUE;
        int minutes = hours * DEFAULT_MINUTES_VALUE;
        int seconds = minutes * DEFAULT_SECONDS_VALUE;
        System.out.println("В " + days + " днях: часов - " + hours + ", минут - " + minutes + ", секунд - " + seconds);
    }


}
