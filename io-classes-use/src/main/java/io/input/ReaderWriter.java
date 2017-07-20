package io.input;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.Buffer;

/**
 * Created
 *
 * @星期三
 */
public class ReaderWriter {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("d:/c.txt");
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt"),"utf-8"));
        ) {
            writer.print("gaoxiang");
            writer.println("liuxing");
            writer.print(1);
            String u = null;
            while ((u = bufferedReader.readLine()) != null) {
                System.out.println(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
