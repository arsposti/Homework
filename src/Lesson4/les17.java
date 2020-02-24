package Lesson4;

import java.util.Scanner;

public class les17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = 0;
        char symbol;
        for (int i = 0; i<str.length(); i++){
            symbol = str.charAt(i);
            if ((symbol== ',') || (symbol== '.')||symbol== ';'||symbol== '!'||symbol== '?'||symbol== '-') {
                n++;
        }


    }
        System.out.printf("У нас есть %d знаков препинания", n);
}}
