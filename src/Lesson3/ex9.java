package Lesson3;

public class ex9 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; ++i) {
            int n = 0;
            for (int j = 2; j <= i && n < 2; ++j) {
                if (i % j == 0) {
                    n++;
                }
            }
            if (n < 2)
                System.out.println(i);
        }
    }
}