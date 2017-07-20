package io.serializable;

import io.model.Book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by tgs on 2017/7/19 11:48.
 *
 * @星期三
 */
public class ObjSerializable {
    public static void main(String[] args) throws Exception{
        //ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/r.dat"));
        //Book book = new Book("java 编程思想", 100);
        //Book bookS = new Book("java 编程思想1", 1002);
        //out.writeObject(book);
        //out.writeObject(bookS);

        ObjectInputStream out = new ObjectInputStream(new FileInputStream("d:/r.dat"));
        Book b = (Book) out.readObject();
        Book b2 = (Book) out.readObject();
        System.out.println(b);
    }
}
