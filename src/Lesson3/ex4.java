package Lesson3;

public class ex4 {
    public static void main(String[] args) {
        int x, y , z;
        x = 41;
        y = 12;
        z = 2012;
        if ( y == 4 || y==6 || y==9 || y== 11 && x == 30  ) {
            x = 1;
            y = y+1;
            System.out.println("День-"+x+". "+"Месяц-"+y+"."+" Год-"+z);}
        if ( y == 4 || y==6 || y==9 || y== 11 && x <= 29 && x >=1 ) {
            x=x+1;
            System.out.println("День-"+x+". "+"Месяц-"+y+"."+" Год-"+z);}
        if ( y == 1 || y==3 || y==5 || y== 7 || y == 8 || y== 10 && x == 31  ) {
            x = 1;
            y = y+1;
            System.out.println("День-"+x+". "+"Месяц-"+y+"."+" Год-"+z);}
        if ( y == 1 || y==3 || y==5 || y== 7 || y == 8 || y== 10 && x == 31  ) {
            x = 1;
            y = y+1;
            System.out.println("День-"+x+". "+"Месяц-"+y+"."+" Год-"+z);}
        if (  y== 12 && x == 31  ) {
            x = 1;
            y = 1;
            z= z+1;
            System.out.println("День-"+x+". "+"Месяц-"+y+"."+" Год-"+z);}
        else {
            System.out.println("ТАкого дня не существует, брат");
        }

    }
}