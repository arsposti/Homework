package Lesson4;

public class les18 {
    public static void main(String[] args) {
        String str = "sdasdsdas dasdsadsa sasadsdasreggkbkr";
        StringBuilder res = new StringBuilder();
        String [] words = str.split("\\s+");
        for (String word : words){
            res.append(word.toCharArray()[word.length()-1]);
        }
        System.out.println(str);
        System.out.println(res.toString());
    }
}
