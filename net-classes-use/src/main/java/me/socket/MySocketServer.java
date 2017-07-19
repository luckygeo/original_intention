package me.socket;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by tgs on 2017/7/19 16:26.
 *
 * @星期三
 */

public class MySocketServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8889);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        PrintWriter pr = new PrintWriter(new OutputStreamWriter(out,"UTF-8") , true);
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(out,"UTF-8"));
        bf.write("hello java socket ,please enter esc exit");
        bf.flush();
        Scanner scanner = new Scanner(in,"UTF-8");
        boolean isExit = false;
        while (!isExit && scanner.hasNextLine()) {
            String hello = scanner.next();
            if (!"esc".equals(hello)) {
                //TODO 中文乱码
                bf.write("echo:"+hello);
                bf.flush();
            }
            else {
                isExit = true;
            }
        }
    }
}

