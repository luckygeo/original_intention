package me.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by tgs on 2017/7/19 15:33.
 *
 * @星期三
 */
public class Socket$ {
    public static void main(String[] args) {
        try (Socket socket = new Socket("120.92.124.38", 23)) {
            InputStream in = socket.getInputStream();
            InputStreamReader inSR = new InputStreamReader(socket.getInputStream(), "ascii");
            Scanner scanner = new Scanner(in);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
            out.write("guest");
            out.flush();
            InputStream inin = socket.getInputStream();
            InputStreamReader inSR1 = new InputStreamReader(socket.getInputStream(), "ascii");
            Scanner scanner1 = new Scanner(in);
            while (scanner1.hasNextLine()) {
                System.out.println(scanner1.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
