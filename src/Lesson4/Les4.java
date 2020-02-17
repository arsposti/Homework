package Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Les4 {
    public static void main(String[] args) {
        int [] array = new int [10];
        Random rand = new Random();
        for (int i=0;i < array.length; i++) {
            array [i] = rand.nextInt(10);
        }
       int maxNum = 0;
        int max = array [0];
        for ( int i =0; i <array.length; i++){
            if (array[i]>max){
                max=array [i];
                maxNum = i;
            }
        }
int min = array[0];
        int minNum =0;
        for ( int i =0; i <array.length; i++){
            if (array[i]<min){
                min=array [i];
                minNum = i;
            }
        }
        int sum =0;
        if (maxNum < minNum) {
            for (int i = maxNum + 1; i < minNum; i++) {
               sum = sum + array[i];
            }
        }
        else if (maxNum > minNum) {
            for (int i = minNum+1; i < maxNum; i++){
                sum = sum + array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Index: %d, value: %d, IndexMin: %d, valMin: %d, Summa: %d", maxNum, max,minNum, min, sum);
    }
}
