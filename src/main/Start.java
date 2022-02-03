package main;

import java.util.Scanner;
import java.lang.String;

public class Start {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        String s = in.nextLine();
        String numberOnly = s.replaceAll("[^0-9]", "");
        char[] number_massive = numberOnly.toCharArray();
        int numArr[] = new int[number_massive.length];
        for (int i = 0; i < number_massive.length; i++) {
            numArr[i] = number_massive[i];
        }
        int first_num = Character.getNumericValue(numArr[0]);
        int second_num = Character.getNumericValue(numArr[1]);
        if ((number_massive.length == 3) && (Character.getNumericValue(numArr[1]) == 0)){
            first_num = 10;
            second_num = Character.getNumericValue(numArr[2]);
        } else if ((number_massive.length == 3) && (Character.getNumericValue(numArr[2]) == 0)){
            second_num = 10;

        } else if ((number_massive.length == 4) && (Character.getNumericValue(numArr[3]) == 0)){
            first_num = 10;
            second_num = 10;
        } else if ((number_massive.length == 4) && (((Character.getNumericValue(numArr[0] + numArr[1]) > 1) || (Character.getNumericValue(numArr[2] + numArr[3]) > 1)))) {
          System.out.println("Не вводите числа больше 10!");
          System.exit(0);
        } else if ((number_massive.length == 3) && (((Character.getNumericValue(numArr[0] + numArr[1]) >= 2) || (Character.getNumericValue(numArr[1] + numArr[2]) >= 2)))) {
            System.out.println("Не вводите числа больше 10!");
            System.exit(0);
        }
        char[] ch = s.toCharArray();
        int result = 0;
           for (int i = 0; i < ch.length; i++) {
                if ("+".equals(String.valueOf(ch[i]))) {
                    result = first_num + second_num;
                } else
                if ("-".equals(String.valueOf(ch[i]))) {
                    result = first_num - second_num;
                } else
                if ("*".equals(String.valueOf(ch[i]))) {
                    result = first_num * second_num;
                } else
                if ("/".equals(String.valueOf(ch[i]))) {
                    result = first_num / second_num;
                }
            }
        System.out.println("Output:");
        System.out.println(result);
    }
}
