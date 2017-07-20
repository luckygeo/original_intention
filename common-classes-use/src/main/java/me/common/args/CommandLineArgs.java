package me.common.args;

import java.util.Arrays;

/**
 * Created
 *        从命令读取参数并输出 ,中间用空格隔开
 *        e.g. <span>java me.common.args.CommandLineArgs hello java</span>
 */
public class CommandLineArgs {
    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);

    }
}
