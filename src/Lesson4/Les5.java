package Lesson4;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Les5 {
    public static void main(String[] args) {
        int marks [] = new int [10];

        for (int i=0;i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 11);
        }
           System.out.println(Arrays.toString(marks));

        int maxIndex = marks [0];
        for (int i =0; i<marks.length; i++) {
            maxIndex = i;
            for (int j = i; j < marks.length; j++) {
                if (marks[maxIndex] < marks[j]) {
                    maxIndex = j;
                }
            }


            int temp = marks[maxIndex];
            marks[maxIndex] = marks[i];
            marks[i] = temp;
        }
        System.out.println(Arrays.toString(marks));
}
}