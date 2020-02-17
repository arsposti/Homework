package Lesson3;

public class ex3 {
    public static void main(String[] args) {
       int x = 35;
       int y = x % 10;
        System.out.println(y);
        if (y == 0 || (y <=9  && y>=5)){
            System.out.println(x + " рублей");}
        else if (y==1) {
            System.out.println(x+ " рубль");}
        else if ( y <= 4 && y>=2) {
            System.out.println( x + " рубля");}
    }
}
