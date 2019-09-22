package util;

import java.io.*;

public class FileHelper {

    public static void writeToFile(String text, String fileName) {


        try (FileWriter writer = new FileWriter(new File(fileName + ".txt"))) {

            writer.write(text);

        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        } catch (IOException ex) {
            System.err.println("File error");
        }

    }
}
