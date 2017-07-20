package me.security;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * 计算sha1或md5
 *
 *
 */
public class ShaMd5 {
    public static void main(String[] args) throws Exception{

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = Files.readAllBytes(Paths.get("H:/0/jdk-6u45-windows-x64.exe"));
        byte[] hash = messageDigest.digest(bytes);
        String d = "";
        for (int i = 0; i < hash.length; i++) {
            int v = hash[i] & 0xFF;
            if (v < 16) {
                d += 0;
            }
            d += Integer.toString(v, 16).toUpperCase();
        }
        System.out.println(d);
    }
}
