package me.common.utils;

/**
 * Created by g on 2017/7/4 15:29.
 *
 * @星期二
 */
public class Strings {
    // 测试string 相等
    public static String s1 = "abc";
    public static String s1_1 = new String("abc");
    public static String s_2 = "bc";
    public static String s2 = "a" + s_2;

    public static String s3 = "a";
    public static String s4 = s3 + "bc";
    public static String s5 = "a" + "bc";

    public final static String s3_1 = "a"  ;
    public final static String s3_2 =  "bc";
    public static String s3_3 = s3_1 + s3_2;


    public static void main(String[] args) {
        //因为str1指向的是字符串中的常量，str2是在堆中生成的对象，所以str1==str2返回false。
        System.out.println(s1 == s1_1);//false

        System.out.println(s1 == s1_1.intern()); //true

        //true，因为final变量在编译后会直接替换成对应的值，所以实际上等于s4="a"+"bc"，而这种情况下，编译器会直接合并为s4="abc"，所以最终s1==s4。
        System.out.println(s1 == s3_3); //true

        String stra = new String("str") + new String("01");
        stra.intern();
        String strb = "str01";
        System.out.println(stra == strb);//#7
        String str1 = "str01";
        String str2 = new String("str") + new String("01");
        str2.intern();
        System.out.println(str2 == str1);//#8
    }

}
