package me.relations.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 简单说，对 Stream 的使用就是实现一个 filter-map-reduce 过程，
 * 产生一个最终结果，或者导致一个副作用（side effect）
 * <p>
 * note: 一个 Stream 只可以使用一次
 * <p>
 * 流的构成
 * 当我们使用一个流的时候，通常包括三个基本步骤：
 *              获取一个数据源（source）→ 数据转换→执行操作获取想要的结果，
 *              每次转换原有 Stream 对象不改变，返回一个新的 Stream 对象（可以有多次转换），
 *              这就允许对其操作可以像链条一样排列，变成一个管道，如下图所示。
 *
 * @see <a href="https://www.ibm.com/developerworks/cn/java/j-lo-java8streamapi/"></a>
 */
public class Streams {
    public static void main(String[] args) {

        //0x01.构造流的几种常见方法
            // 1. Individual values
        Stream stream1 = Stream.of(1, 2, 3);

            //2 array
        String[] strings = {"g", "l", "h", "k"};
        String[] names  = {"xiao", "da", "duoduo", "shaoshao", "zhangzhang"};
        int[] nums = {1, 2, 3, 8, 0, 8};
        Stream stream2 = Stream.of(strings);
        Stream stream3 = Arrays.stream(strings);

            // 3. Collections
        List list = new ArrayList();
        Stream stream4 = list.stream();
        //需要注意的是，对于基本数值型，目前有三种对应的包装类型 Stream：
        //IntStream、LongStream、DoubleStream。当然我们也可以用
        //Stream<Integer>、Stream<Long> >、Stream<Double>，
        //但是 boxing 和 unboxing 会很耗时，
        //所以特别为这三种基本数值型提供了对应的 Stream

        //0x02. 数值流的构造
        IntStream.of(1, 2, 3, 4).forEach(System.out::println);
            //1.输出1到1000，   包括1000
        IntStream.rangeClosed(1,5).forEach(System.out::println);
            //2.输出1到1000，   不包括1000
        IntStream.range(1,5).forEach(System.out::println);

        //0x03.流转换为其它数据结构
        System.out.printf("流转换为其它数据结构");
            //1.数组
        int[] integers = IntStream.rangeClosed(1, 12).toArray();
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }

            //list集合
        List<String> strings1 = (List)stream2.collect(Collectors.toList());
            //ArrayList::new 相当于 ()-> new Arraylit();
            // 也可用 Collectors.toCollection(ArrayList::new)
            //此它执行后，Stream 的元素就被“消费”掉了，无法对一个Stream 进行两次 terminal运算 ,会抛出java.lang.IllegalStateException
            //List<String> strings2 = (List) stream2.collect(Collectors.toCollection(ArrayList::new));
            //  //set
        Set set = (Set) stream3.collect(Collectors.toSet());

        //0x02. 流的操作
            //接下来，当把一个数据结构包装成 Stream 后，就要开始对里面的元素进行各类操作了。常见的操作可以归类如下。
            //Intermediate：
            //map (mapToInt, flatMap 等)、 filter、 distinct、 sorted、 peek、 limit、 skip、 parallel、 sequential、 unordered
            //Terminal：
            //forEach、 forEachOrdered、 toArray、 reduce、 collect、 min、 max、 count、 anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 iterator
            //Short-circuiting：
            //anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 limit

            //转为大写
        Arrays.stream(names).map(String::toUpperCase).forEach(System.out::println);

        Arrays.stream(nums).map(x -> x * x).forEach(System.out::println);

        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        inputStream.flatMap(Collection::stream).forEach(System.out::println);


        Integer[] sixNums = {1, 2, 3, 4, 5, 6};
        Integer[] evens =
                Stream.of(sixNums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
        /*List<String> output = reader
                .lines().flatMap(line -> Stream.of(line.split(REGEXP)))
                .filter(word -> word.length() > 0).
                    collect(Collectors.toList());*/
            //打印姓名（forEach 和 pre-java8 的对比
            // Java 8
            //roster.stream()
            //        .filter(p -> p.getGender() == Person.Sex.MALE)
            //        .forEach(p -> System.out.println(p.getName()));
            //// Pre-Java 8
            //for (Person p : roster) {
            //    if (p.getGender() == Person.Sex.MALE) {
            //        System.out.println(p.getName());
            //    }
            //}

            //peek 对每个元素执行操作并返回一个新的 Stream
                //相反，具有相似功能的 intermediate 操作 peek 可以达到上述目的。如下是出现在该 api javadoc 上的一个示例
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

            //findFirst
                //这里比较重点的是它的返回值类型：Optional。这也是一个模仿 Scala 语言中的概念，
                // 作为一个容器，它可能含有某值，或者不包含。
                // 使用它的目的是尽可能避免 NullPointerException

        String s1 = "liu", s2 = null;
        Optional.ofNullable(s2).ifPresent(x-> System.out.println(x));
        Optional.ofNullable(s1).ifPresent(x-> System.out.println(x));
        int iii = getLength(s2);
        int ii = getLength(s1);



            //reduce
                //这个方法的主要作用是把 Stream 元素组合起来。它提供一个起始值（种子），然后依照运算规则（BinaryOperator），和前面 Stream 的第一个、第二个、第 n 个元素组合。从这个意义上说，字符串拼接、数值的 sum、min、max、average 都是特殊的 reduce。例如 Stream 的 sum 就相当于
                //Integer sum = integers.reduce(0, (a, b) -> a+b); 或
                //Integer sum = integers.reduce(0, Integer::sum);
                //也有没有起始值的情况，这时会把 Stream 的前面两个元素组合起来，返回的是 Optional。

            // 1字符串连接，concat = "ABCD"
        String concats = Stream.of("A", "B", "C", "D").reduce("", String::concat);
            // 2求最小值，minValue = -3.0
        double min = Stream.of(1D, 3D, 5D, 5D).reduce(Double.MIN_VALUE, Double::min);

            //3求和
        int sums = Arrays.stream(nums).reduce(0, Integer::sum);

        int sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();


            // 过滤，字符串连接，concat = "ace"
                //上面代码例如第一个示例的 reduce()，第一个参数（空白字符）即为起始值，第二个参数（String::concat）为 BinaryOperator。
                //这类有起始值的 reduce() 都返回具体的对象。
                //而对于第四个示例没有起始值的 reduce()，由于可能没有足够的元素，
                //返回的是 Optional，请留意这个区别
        String sss = Stream.of("A", "B", "C", "D")
                .filter(x -> x.compareTo("C") > 0)
                .map(String::toLowerCase)
                .reduce("", String::concat);

            //limit/skip
            //limit 返回 Stream 的前面 n 个元素；skip 则是扔掉前 n 个元素（它是由一个叫 subStream 的方法改名而来）
        Stream.of("A", "B", "C", "D").limit(2).skip(1).forEach(System.out::println);
            //sorted
            //有一种情况是 limit/skip 无法达到 short-circuiting 目的的，就是把它们放在 Stream
            //的排序操作后，原因跟 sorted 这个 intermediate
            //操作有关：此时系统并不知道 Stream 排序后的次序如何，
            //所以 sorted 中的操作看上去就像完全没有被 limit 或者 skip 一样。
            //对 Stream 的排序通过 sorted 进行，它比数组的排序更强之处在于你可以首先对 Stream
            // 进行各类 map、filter、limit、skip 甚至 distinct 来减少元素数量后，
            // 再排序，这能帮助程序明显缩短执行时间。
            //当然，这种优化是有 business logic 上的局限性的：即不要求排序后再取值。
        Stream.of("eA12", "1B23", "DC", "DF").sorted((p1, p2) ->
                p1.compareTo(p2)).limit(2).forEach(System.out::println);


    }

    public static int getLength(String text) {
        return Optional.ofNullable(text).map(String::length).orElse(-1);
    }
}
