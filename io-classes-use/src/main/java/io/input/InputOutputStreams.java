package io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * Created
 * <p>
 * 使用字节流读写文件
 *
 * @see <a href = "http://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html"></a>
 * @see <a href = "http://docs.oracle.com/javase/7/docs/api/java/io/Closeable.html"></a>
 */
public class InputOutputStreams {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int d = scanner.nextInt();
        /*BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt")));

        out.println( br.readLine());*/
        //读取文件
        //使用try - with -resource 自动关闭资源
        File file = new File("d:/a.txt");
        try (InputStream in = new FileInputStream(file)) {
            int tempbyte;
            System.out.println(in.available());
            byte[] bytes = new byte[5];
            //参数：
            //  b - 读入数据的缓冲区。
            //  off - 数组 b 中将写入数据的初始偏移量。
            //  len - 要读取的最大字节数。
            // 返回：
            //  读入缓冲区的总字节数；如果因为已到达流末尾而不再有数据可用，则返回 -1。
            //  抛出：
            //  I OException - 如果不是因为位于文件末尾而无法读取第一个字节；如果输入流已关闭；如果发生其他 I/O 错误。
            //  NullPointerException - 如果 b 为 null。
            //  IndexOutOfBoundsException - 如果 off 为负，len 为负，或者 len 大于 b.length - off
            while ((tempbyte = in.read(bytes, 3, 2)) != -1) {
                System.out.println(new String(bytes));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStream out = new FileOutputStream(file)) {
            boolean b = file.canExecute();
            int i = 0;
            //while (i < 100) {
            //    out.write(i);
            //    i++;
            //}
        } catch (Exception e) {
            e.printStackTrace();
        }
        CharSequence charSequence = "gaoxina".subSequence(1, 4);
        System.out.println();

    }
}
