package Lesson4;

public class les19 {
    public static void main(String[] args) {
        String s = "mama";
        String s1 = s + " mila pamy ";
        String s2 = s1 + s + " a papa smotrel";
     StringBuilder res = new StringBuilder();
     res.append(s1+s2+s+s2);
        System.out.println(res.toString());

    }
}
