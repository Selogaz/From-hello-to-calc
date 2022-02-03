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
        int first_num = 0;
        int second_num = 0;
        int numArr[] = new int[number_massive.length];
        for (int i = 0; i < number_massive.length; i++) {
            numArr[i] = number_massive[i];
        }
        first_num = Character.getNumericValue(numArr[0]);
        second_num = Character.getNumericValue(numArr[1]);
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
        System.out.println(result);
    }
}
