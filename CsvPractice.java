import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CsvPractice {
    // Comma separated values - CSV
    public static void main(String[] args) throws RuntimeException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to my CSV practice 9.7.23\n");

        System.out.println("Please enter your name: ");
        String username = scanner.nextLine();

        System.out.println("\nHi " + username + " lets get started!\n");

        String file = "C:\\Users\\Johnny\\JavaFiles\\arrivingAnimals.txt";
        String fileOutput = "C:\\Users\\Johnny\\JavaFiles\\myOutPutFile.txt";
        BufferedReader reader = null;
        String line = "";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput));
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.println("\n" + index);
                    writer.write("\n" + index);


                }
                System.out.println("\n");


            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileOutput));
            writer.write("This is a new txt document\n");
            for (int i = 0; i < 15; i++) {
                writer.write("\n i is: " + i);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            writer.close();
        }


    }
}