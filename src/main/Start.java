package main;

import java.util.Scanner;

public class Start {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        int first_num = in.nextInt();
        /*String s = in.nextLine();
        //int char_max = s.length() - 1;
        char[] ch = s.toCharArray();
            for (int i = 0; i < char_max; i++) {
                if (ch[i] == "+") {
                    result = first_num + second_num;
                }
                if (ch[i] == "-") {
                    result = first_num - second_num;
                }
                if (ch[i] == "/") {
                    result = first_num / second_num;
                }
                if (ch[i] == "*" {
                    result = first_num * second_num;
                }
            }*/
        System.out.println(first_num);
    }
}
