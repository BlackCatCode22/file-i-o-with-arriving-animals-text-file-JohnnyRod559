import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FileIOsep9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nWelcome to Java IO practice \n");

        System.out.println("Please enter your name: ");
        String username = scanner.nextLine();

        System.out.println("\nLets get started " + username);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Johnny\\JavaFiles\\sample.txt"));
            writer.write("Hello, this is the first line in my new file");
            writer.write("\nThis is on a new line");
            writer.write("\nThis is a string and it is my third line");


            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n\nWe just made a text file and added text!");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Johnny\\JavaFiles\\sample.txt"));
            String myLine = "";
            while ((myLine = reader.readLine()) != null) {
                System.out.println(myLine);
            }
            // "sout" ctr + j system.out.println shortcut

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}