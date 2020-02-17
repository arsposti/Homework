package Lesson3;

public class ex7 {

    public static void main(String[] args) {
        int n = 1;
        int i;
        boolean x = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                x = true;
                break;
            }
        }
        if (x) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}