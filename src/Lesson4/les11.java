package Lesson4;

import java.rmi.MarshalException;
import java.util.Arrays;

public class les11 {
    public static void main(String[] args) {
       double m[][] = new double [3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
             m [i][j] = (Math.random()*100.9);
                System.out.printf("%.2f  ", m[i][j] );

    }
            System.out.println();
}
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(Math.round(m[i][j])+"\t");
            }
            System.out.println();
        }
        System.out.println();
            }
                   }

