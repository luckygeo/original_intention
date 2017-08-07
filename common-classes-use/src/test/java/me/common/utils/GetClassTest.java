package me.common.utils;

import org.junit.Test;

/**
 * Created on 2017/8/7
 */
public class GetClassTest {


    /**
     * Returns the runtime class of this {@code Object}. The returned
     * {@code Class} object is the object that is locked by {@code
     * static synchronized} methods of the represented class.
     *
     * <p><b>The actual result type is {@code Class<? extends |X|>}
     * where {@code |X|} is the erasure of the static type of the
     * expression on which {@code getClass} is called.</b> For
     * example, no cast is required in this code fragment:</p>
     *
     * <p>
     * {@code Number n = 0;                             }<br>
     * {@code Class<? extends Number> c = n.getClass(); }
     * </p>
     *
     * @return The {@code Class} object that represents the runtime
     *         class of this object.
     * @jls 15.8.2 Class Literals
     */
    //public final native Class<?> getClass();


    @Test
    public void test(){
        //super.getClass() super只是代表引用父类的方法，并不能代表父类，所以输出me.common.utils.GetClassTest
        System.out.println(super.getClass().getName());
    }
}
