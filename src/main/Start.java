package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;

public class Start {
   static int num1;
   static int num2;
   static int result;
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение с двумя членами не более 10 каждое:");
        String Input_string = in.nextLine();
        char[] Input_string_massive = Input_string.toCharArray();
        String[] Input_string_splitted = Input_string.split("[-+*/]");
        String Roman_first;
        String Roman_second;
        try {
        Roman_first = Input_string_splitted[0];
        Roman_second = Input_string_splitted[1].trim();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Строка не является математической операцией");
        }
        num1 = romanToNumber(Roman_first);
        num2 = romanToNumber(Roman_second);
        String numberOnly = Input_string.replaceAll("[^0-9]", "");
        char[] number_massive = numberOnly.toCharArray();
        int numArr[] = new int[number_massive.length];
        for (int i = 0; i < number_massive.length; i++) {
            numArr[i] = number_massive[i];
        }
        if (numArr.length != 0) {
            try {
                num1 = Integer.parseInt(Roman_first);
                num2 = Integer.parseInt(Roman_second);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("используются одновременно разные системы счисления");
            }
        }
        if ((num1 > 10) || (num2 > 10)) {
            System.out.println("Число должно быть меньше 10");
            System.exit(0);
        }
        for (int i = 0; i < Input_string_massive.length; i++) {
            if ("+".equals(String.valueOf(Input_string_massive[i]))) {
                result = num1 + num2;
            } else if ("-".equals(String.valueOf(Input_string_massive[i]))) {
                result = num1 - num2;
            } else if ("*".equals(String.valueOf(Input_string_massive[i]))) {
                result = num1 * num2;
            } else if ("/".equals(String.valueOf(Input_string_massive[i]))) {
                try {
                result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Ошибка: " + e);
                    System.out.println("Введено нецелое или нулевое значение!");
                    System.exit(0);
                }
            }
        }
        System.out.println("Результат вычисления:");
        if (numArr.length != 0) {
            System.out.println(result);
        }
        else {
            try {
                String result_roman = convertNumToRoman(result);
                System.out.println(result_roman);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("в римской системе нет отрицательных чисел");
            }
        }
    }
    private static int romanToNumber (String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных");
        }
        return -1;
    }
    private static String convertNumToRoman (int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String Roman_result = roman[numArabian];
        return Roman_result;
    }
}
