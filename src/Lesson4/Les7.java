package Lesson4;

import java.util.Arrays;

public class Les7 {
    public static void main(String[] args) {


        int m [][] = new int [2][2];
        for (int i =0 ; i <m.length; i++){
            for (int j =0; j<m[i].length; j++) {
                m[i][j] =1;

            }

        }
        System.out.println(Arrays.deepToString(m));
    }
}
