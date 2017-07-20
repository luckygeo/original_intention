package me.security;

import com.sun.corba.se.pept.transport.ContactInfoList;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * java 对称加密
 *
 */
public class Encrypt$ {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            int mode = Cipher.PUBLIC_KEY;
            Key key = null;
            int blocksize = cipher.getBlockSize();
            byte[] inBytes = new byte[blocksize];
            int outSize = cipher.getOutputSize(blocksize);
            byte[] outbytes = new byte[outSize];
            int outLenth = cipher.update(inBytes, 0, outSize, outbytes);
            cipher.doFinal(outbytes, 0, inBytes);//TODO

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
