package lesson3;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class HomeTask3 {

    private static File createFile(String pathname) {
        File file = new File(pathname + ".txt");
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return file;
    }

    private static HashSet<String> getHashSetFromFile(File file) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String nextLine = "";
            while ((nextLine = bf.readLine()) != null) {
                hashSet.add(nextLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hashSet;
    }

    private static FileWriter createFileWriter(File file) {
        try{
            FileWriter fileWriter = new FileWriter(file, true);
            return fileWriter;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        //creating HashSet instance from a file
        HashSet<String> setStudents = getHashSetFromFile(createFile("students"));

        //getting new FIO and creating new FileWriter instance
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new FIO");
        String fio = scanner.nextLine();
        FileWriter fileWriter = createFileWriter(createFile("students"));

        //adding new FIO to the file if not contained already
        if (setStudents.add(fio))
            try {
                fileWriter.write(fio + "\n");
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        scanner.close();
    }
}
