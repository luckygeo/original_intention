package io.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

/**
 * Created by tgs on 2017/7/19 13:44.
 *
 * @星期三
 */
public class Files$ {

    public static void main(String[] args) {
        Path path = Paths.get("d", "D新建问及那", "c.txt");
        File file = path.toFile();
        Path thisPath = Paths.get("File$.class").toAbsolutePath();
        System.out.println(thisPath.getRoot());
        thisPath.resolve("D新建问及那");
        System.out.println(thisPath.toAbsolutePath());
        System.out.println(file.getName());
        /*try {
            Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Path path1 = Paths.get("D:", "c.txt").toAbsolutePath();
        try {
            Files.readAllLines(path1).stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.deleteIfExists(Paths.get(""));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.createTempFile(null, "LICENSE-junit.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Iterator iterator = Files.newDirectoryStream(Paths.get("D:", "User"), "*.zip").iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
