package lesson1;

public class HomeTask1 {

    public static int getMax(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else
            if (b >= a && b >= c)
                return b;
            else
                return c;
    }

    public static String sumOfStrings(String str1, String str2) {
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        return Integer.toString(sum);
    }

    public static void isEven(int a) {
        System.out.println(a % 2 == 0);
    }

    public static double getAreaOfParallelogram(double a, double b) {
        double angle = Math.PI / 4;
        return a * b * Math.sin(angle);
    }

    public static double getAreaOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        System.out.println(getMax(10, 5, 7));
        System.out.println(sumOfStrings("228", "172"));
        isEven(3);
        System.out.println(getAreaOfParallelogram(1.41, 2));
        System.out.println(getAreaOfTriangle(1,1, 1.41));
    }
}
