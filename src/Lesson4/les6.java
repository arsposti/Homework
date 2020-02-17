package Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;

public class les6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] mas = new Integer[sc.nextInt()];

        for ( int i =0; i<mas.length; i++){
            mas[i] = (int) (Math.random()*15);
        }
        System.out.println(Arrays.toString(mas));
        int n = mas.length;
        int box;
        for (int i=0; i<n/2; i++){
            box = mas[n-i-1];
            mas [n-i-1]=mas[i];
            mas[i]=box;
        }
        System.out.println(Arrays.toString(mas));
    }
}