package comparison.java;

public class Main {
    public static void main(String[] args) {
        System.out.println(5 > 4); // int comparison
        System.out.println(5L >= 4L); // long comparison
        System.out.println(4.0 <= 5.0); // double comparison
        System.out.println(4f < 5f); // float comparison
        System.out.println('a' < 'c'); // char comparison
//        System.out.println(true > false); // primitive boolean comparison doesn't exist in Java
        byte b1 = 5;
        byte b2 = 4;
        System.out.println(b1 > b2);
        short s1 = 5;
        short s2 = 4;
        System.out.println(s1 >= s2);


        System.out.println(-0.0 > 0.0);
        System.out.println(-0.0 < 0.0);
        System.out.println(-0.0 <= 0.0);
        System.out.println(-0.0 >= 0.0);
        System.out.println(-0.0 == 0.0);
    }
}
