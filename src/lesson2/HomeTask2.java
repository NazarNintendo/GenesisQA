package lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTask2 {
    static Scanner scanner = new Scanner(System.in);

    public static void getIndexOfFlat() {
        int[][] house = new int[4][36];
        for (int i = 0; i < house.length; i++)
            for (int j = 0; j < house[i].length; j++)
                house[i][j] = 36 * i + (j + 1);
        System.out.println("Enter your flat");
        int flat = scanner.nextInt();
        for (int i = 0; i < house.length; i++)
            for (int j = 0; j < house[i].length; j++)
                if (house[i][j] == flat) {
                    System.out.println("Podjezd #" + (i + 1) + " Floor #" + ((j - 1) / 4 + 1));
                    break;
                }
    }
    public static void printWallpaper() {
        System.out.println("Enter your size");
        int size = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < size; j++)
                if (j % 2 == 0)
                    System.out.print("***");
                else
                    System.out.print("+++");
            System.out.println();
        }
    }
    public static int factorial(int n) {
        if (n < 4 || n > 16)
            return -1;
        else {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        }
    }

    public static int countOdds(int[] array) {
        int counter = 0;
        for (int i : array)
            if (i % 2 == 1)
                counter++;
        return counter;
    }

    public static void createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = 1;
        System.out.println(Arrays.toString(array));
    }

    public static void createRandomArray() {
        int[] array1 = new int[15];
        for (int i = 0; i < array1.length; i++)
            array1[i] = new Random().nextInt(10);

        int[] array2 = Arrays.copyOf(array1, array1.length * 2);
        for (int i = array1.length; i < array2.length; i++)
            array2[i] = array1[i - 15] * 2;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static void parseStringForB() {
        String str = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'b')
                counter++;
        System.out.println(counter);
    }

    public static void main(String[] args) {
        getIndexOfFlat();
        printWallpaper();
        System.out.println(factorial(5));
        System.out.println(countOdds(new int[]{0, 5, 2, 4, 7, 1, 3, 19}));
        createArray(10);
        createRandomArray();
        parseStringForB();
    }
}
