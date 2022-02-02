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
       // int first_num = number_massive[0];
       // int second_num = number_massive[1];
        char[] ch = s.toCharArray();
        int result = 0;
        /*switch (ch) {
            case "+":
                result = number_massive[0] + number_massive[1];
                break;
            case "-":
                result = number_massive[0] - number_massive[1];
                break;
            case "/":
                result = number_massive[0] / number_massive[1];
                break;
            case "*":
                result = number_massive[0] * number_massive[1];
                break;
        }*/
            for (int i : ch) {
                if ("+".equals(String.valueOf(ch))) {
                    result = number_massive[0] + number_massive[1];
                } else
                if ("-".equals(String.valueOf(ch))) {
                    result = number_massive[0] - number_massive[1];
                } else
                if ("*".equals(String.valueOf(ch))) {
                    result = number_massive[0] * number_massive[1];
                } else
                if ("/".equals(String.valueOf(ch))) {
                    result = number_massive[0] / number_massive[1];
                }
            }
        System.out.println(number_massive[0]);
        System.out.println(number_massive[1]);
        //System.out.println(result);
    }
}
