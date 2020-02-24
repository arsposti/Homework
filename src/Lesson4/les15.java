package Lesson4;

public class les15 {
    public static void main(String[] args) {
        int max = 0;
        int row = 0;
        int col = 0;
       int matrix [][] = {{1,2,0,3}, {4,5,6,10}, {5,6,8,7}};
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    row=i;
                    col = j;
                }
            }
        }
        for (int i =0;i<matrix.length;i++){
            if (i != row){
                for (int j=0;j<matrix[i].length; j++){
                    if (j!=col){
                        System.out.print(matrix[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println();

    }
}

