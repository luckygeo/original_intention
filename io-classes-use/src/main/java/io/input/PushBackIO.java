package io.input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;

/**
 * Created by tgs on 2017/7/19 10:56.
 *
 * @星期三
 */
public class PushBackIO {
    public static void main(String[] args) {
        File file = new File("d:/a.txt");
        try (PushbackInputStream in = new PushbackInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            int tempbyte;
            while ((tempbyte = in.read()) != -1) {
                if (tempbyte == 'S')
                    in.unread(tempbyte);
                System.out.println((char)tempbyte);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
