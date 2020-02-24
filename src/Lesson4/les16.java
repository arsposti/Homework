package Lesson4;

public class les16 {
    public static void main(String[] args) {
        int m [][] = {{1,2,3}, {4,5,6,}, {7,8,9}};
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[i].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m.length / 2; i++)
        {

            for (int j = i; j < m.length-i-1; j++)
            {
                int temp = m[i][j];

                m[i][j] = m[j][m.length-1-i];

                m[j][m.length-1-i] = m[m.length-1-i][m.length-1-j];

                m[m.length-1-i][m.length-1-j] = m[m.length-1-j][i];

                m[m.length-1-j][i] = temp;

            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print((m[i][j])+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
