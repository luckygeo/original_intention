package me.common.debugs;

/**
 * Created by gao on 2017/7/16 16:01.
 * 堆栈追踪
 * 断言。启用断言：加入参数 "-enableassertions" or "-ea"
 *
 * @星期日
 */
public class Debuging {

    /**
     * Created by gao on 2017/7/16 16:01.
     * 堆栈追踪
     */
    public static void stackTrace(int i) {
        assert i > 0 : "只能大于零";
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement frame : frames) {
            System.out.println(frame.getFileName());
            System.out.println(frame.getLineNumber());
            System.out.println(frame.getMethodName());
        }
    }

    public static void main(String[] args) {
        stackTrace(10);
        stackTrace(-10); //java.lang.AssertionError 断言假设失败

    }
}
