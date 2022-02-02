package main;

import java.util.Scanner;

public class Start {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        String s = in.nextLine();
        String numberOnly = s.replaceAll("[^0-9]", "");
        char[] number_massive = numberOnly.toCharArray();
        int first_num = number_massive[0];
        int second_num = number_massive[1];
        int char_max = s.length() - 1;
        char[] ch = s.toCharArray();
          /*  for (int i = 0; i < char_max; i++) {
                if (ch[i] == "+") {
                    result = first_num + second_num;
                } else
                if (ch[i] == "-") {
                    result = first_num - second_num;
                } else
                if (ch[i] == "/") {
                    result = first_num / second_num;
                } else
                if (ch[i] == "*" {
                    result = first_num * second_num;
                }
            }*/
        System.out.println(number_massive[0]);
        System.out.println(number_massive[1]);
    }
}
