package Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class les9 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int mas [] = new int [sc.nextInt()];


        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (0+Math.random() * 145);}

        int[] mas2 = new int[mas.length];
        int[] mas3 = new int[mas.length];
        System.out.println(Arrays.toString(mas));

        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            mas2[i]=mas[i];
            while (mas2[i] >= 1) {
                mas2[i] = mas2[i] / 10;
                sum++;
            }
            if (mas2[i] < 1) {
                mas3[i] = sum;
                sum = 0;
            }
        }

        for ( int i = mas3.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas3[j] > mas3[j + 1]) {
                    int tmp = mas3[j];
                    mas3[j] = mas3[j + 1];
                    mas3[j + 1] = tmp;
                    int tmp1 = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp1;
                }
            }
        }

        System.out.println(Arrays.toString(mas3));
        System.out.println(Arrays.toString(mas));
    }
}