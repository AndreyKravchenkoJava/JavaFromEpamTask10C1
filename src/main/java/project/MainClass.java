package project;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Andrey\\IdeaProjects\\Task10C1\\Numbers.txt");

            Random random = new Random();
            int[] numbers = new int[10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = random.nextInt(20);
            }

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(Arrays.toString(numbers) + " ");
            Arrays.sort(numbers);
            printWriter.print(Arrays.toString(numbers));
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
