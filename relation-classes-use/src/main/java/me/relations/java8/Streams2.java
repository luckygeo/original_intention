package me.relations.java8;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by tgs on 2017/7/18 18:02.
 *
 * @星期二
 */
public class Streams2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("d:\\a.txt"));
        int longest = br.lines().mapToInt(String::length).max().getAsInt();
        br.close();
        System.out.println(longest);
    }
}
