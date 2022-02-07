package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;

public class Start {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение с двумя членами не более 10:");
        String Input_string = in.nextLine();
        char[] Input_string_massive = Input_string.toCharArray();
        String[] Input_string_splitted = Input_string.split("[-+*/]");
        String Roman_first = Input_string_splitted[0];
        String Roman_second = Input_string_splitted[1].trim();
        int rome_one = romanToNumber(Roman_first);
        int rome_two = romanToNumber(Roman_second);
        String numberOnly = Input_string.replaceAll("[^0-9]", "");
        char[] number_massive = numberOnly.toCharArray();
        int numArr[] = new int[number_massive.length];
        for (int i = 0; i < number_massive.length; i++) {
            numArr[i] = number_massive[i];
        }
        int first_num = 0;
        int second_num = 0;
        if (numArr.length != 0) {
            first_num = Character.getNumericValue(numArr[0]);
            second_num = Character.getNumericValue(numArr[1]);
        }
        if ((number_massive.length == 3) && (Character.getNumericValue(numArr[1]) == 0)) {
            first_num = 10;
            second_num = Character.getNumericValue(numArr[2]);
        } else if ((number_massive.length == 3) && (Character.getNumericValue(numArr[2]) == 0)) {
            second_num = 10;
        } else if ((number_massive.length == 4) && (Character.getNumericValue(numArr[3]) == 0)) {
            first_num = 10;
            second_num = 10;
        } else if ((number_massive.length == 4) && (((Character.getNumericValue(numArr[0] + numArr[1]) > 1) || (Character.getNumericValue(numArr[2] + numArr[3]) > 1)))) {
            System.out.println("Не вводите числа больше 10!");
            System.exit(0);
        } else if ((number_massive.length == 3) && (((Character.getNumericValue(numArr[0] + numArr[1]) >= 2) || (Character.getNumericValue(numArr[1] + numArr[2]) >= 2)))) {
            System.out.println("Не вводите числа больше 10!");
            System.exit(0);
        }
        int result = 0;
        int rome_result = 0;
        for (int i = 0; i < Input_string_massive.length; i++) {
            try {
                if ("+".equals(String.valueOf(Input_string_massive[i]))) {
                    result = first_num + second_num;
                    rome_result = rome_one + rome_two;
                } else if ("-".equals(String.valueOf(Input_string_massive[i]))) {
                    result = first_num - second_num;
                    rome_result = rome_one - rome_two;
                } else if ("*".equals(String.valueOf(Input_string_massive[i]))) {
                    result = first_num * second_num;
                    rome_result = rome_one * rome_two;
                } else if ("/".equals(String.valueOf(Input_string_massive[i]))) {
                    result = first_num / second_num;
                    rome_result = rome_one / rome_two;
                }
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Ошибка: " + e);
                System.out.println("Введено нецелое или нулевое значение!");
                System.exit(0);
            }
        }
        if (numArr.length != 0) {
            System.out.println("Output:");
            System.out.println(result);
        }
        else {
            System.out.println("Римский результат:");
            System.out.println(rome_one + " " + rome_two + " " + rome_result);
        }
        System.out.println(Roman_first + " " + Roman_second);
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
}
