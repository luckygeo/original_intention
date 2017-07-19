package me.socket.me.http;


import java.net.InetAddress;

/**
 * Created
 *
 * @星期三
 */
public class Address$ {
    public static final String BAIDUHOST = "WWW.BAIDU.COM";

    public static void main(String[] args) throws Exception{

        InetAddress inetAddress = InetAddress.getByName(BAIDUHOST);

        InetAddress[] inetAddresses = InetAddress.getAllByName(BAIDUHOST);
        for (InetAddress address : inetAddresses) {
            byte[] bytes = address.getAddress();
            System.out.println(address);
        }
        InetAddress inetAddress1 = InetAddress.getLocalHost();

    }
}
