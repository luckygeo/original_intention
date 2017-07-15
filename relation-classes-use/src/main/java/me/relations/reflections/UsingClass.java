package me.relations.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created  反射
 *          1.在运行中分析类的能力
 *          2.在运行中查看对象，例如编写一个toString 提供所有类使用
 *          3.实现数组的操作代码
 *          4.利用method对象
 * @see <a href="http://blog.csdn.net/smartboy_01/article/details/23201391"></a>
 */
public class UsingClass {

    /**
     * 输出类的基本的信息
     *
     * @param cl
     *        class类
     */
    public static void printClassBaseInfo(Class cl){
        Class superClass = cl.getSuperclass();
        Class[] interfaceClass = cl.getInterfaces();


        String modifiers = Modifier.toString(cl.getModifiers());
        if (!modifiers.isEmpty())
            System.out.print(modifiers + " ");
        System.out.print("class " + cl.getName());

        if (superClass != null && superClass != Object.class) {
            System.out.print(" extends " + superClass.getName());
        }
        System.out.println(" {");
        printConstructors(cl);
        printMethos(cl);
        printFiedls(cl);
        System.out.println("}");
        System.out.println(cl.getName());
        //getFields() 返回public 成员变量
        System.out.println(Arrays.toString(cl.getFields()));
    }

    /**
     * 打印类的基本的构造方法及参数
     *
     * @param cl
     *        class类
     */
    public static void printConstructors(Class cl){
        try {
            Constructor[] constructors = cl.getDeclaredConstructors();

            for (Constructor t : constructors) {
                String name = t.getName();
                System.out.print("  ");
                String modifiers = Modifier.toString(t.getModifiers());//描述
                if (modifiers.length() > 0) {
                    System.out.print(modifiers + "  ");
                }
                System.out.print(name + "(");
                Class[] paramsTypes = t.getParameterTypes();
                for (int i = 0; i < paramsTypes.length; i++) {
                    if (i > 0) System.out.print(", ");
                    System.out.print(paramsTypes[i].getName());

                }
                System.out.println(");");
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印类的基本的成员变量，包括private和public
     *
     * @param cl
     *        class类
     */
    public static void printFiedls(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class type = field.getType();
            String name = field.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(type.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + "  ");
            }
            try {
                System.out.println(type.getName() + "   " + name + " = "+field.get(Double.class)+ ";");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 打印类的基本的成员方法和静态方法，包括private和public
     *
     * @param cl
     *        class类
     */
    public static void printMethos(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method method : methods) {
            Class type = method.getReturnType();
            String name = method.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(type.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + "  ");
            }
            System.out.print(type.getName() + "  " + name + "(");
            Class[] classes = method.getParameterTypes();
            for (int i = 0; i < classes.length; i++) {
                if (i > 0)
                    System.out.print(", ");
                System.out.print(classes[i].getName());
            }
            System.out.println(");");

        }

    }



}
