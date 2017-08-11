package cn.jing.test_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by JING on 2017/7/18.
 */
public class Demo1 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        stream.forEach(str -> System.out.println(str));
//        stream.forEach(str -> {
//            if(str.length() > 3) {
//                System.out.println(str);
//            }
//        });
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        stream.filter(str -> str.length() > 3).forEach(str -> System.out.println(str));  //使用filter过滤满足条件的对象
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too", "too");
//        stream.distinct().forEach(str -> System.out.println(str));  //使用distinct过滤重复的对象
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        stream.sorted().forEach(str -> System.out.println(str));    //自然排序
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        stream.sorted((str1, str2) -> str1.length() - str2.length()).forEach(str -> System.out
//            .println(str)); //自定义比较器排序
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        stream.map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
//---------------------------------------------------------------------------------------
//        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
//        stream.flatMap(list -> list.stream()).forEach(i -> System.out.println(i));
//---------------------------------------------------------------------------------------
//        //选出最长的单词
//        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        Optional<String> longest = stream.reduce((str1, str2) -> str1.length() >= str2.length() ? str1 : str2);
////        Optional<String> longest = stream.max((str1, str2) -> str1.length() - str2.length());
//        System.out.println(longest.get());
//---------------------------------------------------------------------------------------
        //求出一组单词的长度之和
//        Stream<String> stream = Stream.of("I", "love", "you", "too");
//        Integer lengthSum = stream.reduce(0,    //初始值
//            (sum, str) -> sum + str.length(),   //累加器
//            (a, b) -> a + b);   //部分和拼接器，并行执行时才会用到
//        System.out.println(lengthSum);
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too");
        //将Stream转换成List接口类型
//        //方法引用，ArrayList::new 引用构造方法，ArrayList::add 引用类中的方法 ArrayList::addAll 引用类中的方法
//        ArrayList<String> list = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        List<String> list = stream.collect(Collectors.toList());
//        System.out.println(list);
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too", "too");
//        //将Stream转换成Set接口类型
//        Set<String> set = stream.collect(Collectors.toSet());
//        System.out.println(set);
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too", "too");
//        //将stream转换成指定容器的实际类型
//        ArrayList<String> arrayList = stream.collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(arrayList);
//---------------------------------------------------------------------------------------
//        Stream<String> stream = Stream.of("I", "love", "you", "too", "too");
//        //将stream转换成指定容器的实际类型
//        HashSet<String> hashSet = stream.collect(Collectors.toCollection(HashSet::new));
//        System.out.println(hashSet);
//---------------------------------------------------------------------------------------
        Stream<String> stream = Stream.of("I", "love", "you", "too", "too");
//        String joined = stream.collect(Collectors.joining()); //Iloveyoutootoo
//        String joined = stream.collect(Collectors.joining(","));   //I,love,you,too,too
        String joined = stream.collect(Collectors.joining(",", "[", "]"));  //[I,love,you,too,
        // too]
        System.out.println(joined);
//---------------------------------------------------------------------------------------
    }
};
