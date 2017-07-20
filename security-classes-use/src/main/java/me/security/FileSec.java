package me.security;

import java.io.File;
import java.io.FilePermission;

/**
 * Created by tgs on 2017/7/20 17:08.
 *
 * @星期四
 */
public class FileSec {
    public static void main(String[] args) throws Exception{
        File file = new File("d:/.txt");
        file.setReadOnly();
        System.out.println(file.createNewFile());;
    }
}
