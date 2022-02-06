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
        int rome_one = 20;
        int rome_two = 20;
        for (int i = 0; i < Input_string.length(); i++) {
            if ("III".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 3;
                } else if (rome_one != 20) {
                    rome_two = 3;
                }
            } else if ("II".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 2;
                } else if (rome_one != 20) {
                    rome_two = 2;
                }
            } else if ("I".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 1;
                } else if (rome_one != 20) {
                    rome_two = 1;
                }
            } else if ("IV".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 4;
                } else if (rome_one != 20) {
                    rome_two = 4;
                }
            } else if ("V".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 5;
                } else if (rome_one != 20) {
                    rome_two = 5;
                }
            } else if ("VI".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 6;
                } else if (rome_one != 20) {
                    rome_two = 6;
                }
            } else if ("VII".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 7;
                } else if (rome_one != 20) {
                    rome_two = 7;
                }
            } else if ("VIII".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 8;
                } else if (rome_one != 20) {
                    rome_two = 8;
                }
            } else if ("IX".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 9;
                } else if (rome_one != 20) {
                    rome_two = 9;
                }
            } else if ("X".equals(String.valueOf(Input_string_massive[i]))) {
                if ((rome_one == 20) && (rome_two == 20)) {
                    rome_one = 10;
                } else if (rome_one != 20) {
                    rome_two = 10;
                }
            }
        }
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
        if (rome_one == 20) {
            System.out.println("Output:");
            System.out.println(result);
        }
        else {
            System.out.println("Римский результат:");
            System.out.println(rome_one + " " + rome_two + " " + rome_result);
        }
    }
}
