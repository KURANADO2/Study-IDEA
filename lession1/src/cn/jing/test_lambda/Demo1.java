package cn.jing.test_lambda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/**
 * Created by JING on 2017/7/17.
 */
public class Demo1 {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread run");
//            }
//        }).start();
//
//        new Thread(
//            () -> System.out.println("Thread2 run")
//        ).start();
//
//        new Thread(
//            () -> {
//                System.out.println("Thread3 run");
//                System.out.println("hello world!");
//            }
//        ).start();
//--------------------------------------------------------------------
//        List<String> list = Arrays.asList("I", "love", "you");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if(s1 == null)
//                    return -1;
//                if(s2 == null)
//                    return 1;
//                return s1.length() - s2.length();
//            }
//        });
//        System.out.println(list);
//
//        List<String> list2 = Arrays.asList("I", "love", "you");
//        Collections.sort(list2, (s1, s2) -> {
//            if(s1 == null) return -1;
//            if(s2 == null) return 1;
//            return s1.length() - s2.length();
//        });
//        System.out.println(list2);
//--------------------------------------------------------------------
//        Runnable run = () -> System.out.println("Hello World");
//--------------------------------------------------------------------
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("love", "I", "you", "to"));
//        for (String str : list) {
//            if(str.length() > 3)
//                System.out.println(str);
//        }
//
//        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("I", "love", "you", "to"));
//        list2.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String str) {
//                if(str.length() > 3)
//                    System.out.println(str);
//            }
//        });
//
//        //使用Lambda表达式实现
//        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("I", "love", "you", "to"));
//        list3.forEach(str -> {
//            if(str.length() > 3)
//                System.out.println(str);
//        });
//--------------------------------------------------------------------
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            //删除长度大于3的元素
//            if (it.next().length() > 3) {
//                it.remove();
//            }
//        }
//
//        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        list2.removeIf(new Predicate<String>() {
//            //删除长度大于3的元素
//            @Override
//            public boolean test_lambda(String s) {
//                return s.length() > 3;
//            }
//        });
//
//        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        //删除长度大于3的元素
//        list3.removeIf(s -> s.length() > 3);
//--------------------------------------------------------------------
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        for (int i = 0; i < list.size(); i ++) {
//            String str = list.get(i);
//            if(str.length() > 3) {
//                list.set(i, str.toUpperCase());
//            }
//        }
//        System.out.println(list);
//
//        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        list2.replaceAll(new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                if(s.length() > 3)
//                    return s.toUpperCase();
//                else return s;
//            }
//        });
//        System.out.println(list2);
//
//        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        list3.replaceAll(s -> {
//            if(s.length() > 3)
//                return s.toUpperCase();
//            else return s;
//        });
//        System.out.println(list3);
//--------------------------------------------------------------------
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        });
//        System.out.println(list);
//
//        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        list2.sort((s1, s2) -> {
//            return s1.length() - s2.length();
//        });
//        System.out.println(list2);
//
//        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
//        list2.sort((s1, s2) -> s1.length() - s2.length());  //return可以省略
//        System.out.println(list3);
//--------------------------------------------------------------------
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
//
//        Map<Integer, String> map2 = new HashMap<>();
//        map2.put(1, "one");
//        map2.put(2, "two");
//        map2.put(3, "three");
//        map2.forEach(new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer k, String v) {
//                System.out.println(k + "=" + v);
//            }
//        });
//
//        Map<Integer, String> map3 = new HashMap<>();
//        map3.put(1, "one");
//        map3.put(2, "two");
//        map3.put(3, "three");
//        map3.forEach((k, v) -> System.out.println(k + "=" + v));
//--------------------------------------------------------------------
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        System.out.println(map.get(4)); //输出null
//        if (map.containsKey(4)) System.out.println(map.get(4));
//        else System.out.println("no value");
//        //getOrDefault方法跟Lambda表达式没关系，但是很有用，省去了判断的步骤，将判断和取值合二为一
//        System.out.println(map.getOrDefault(4, "no value"));

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        //putIfAbsent方法跟Lambda表达式没关系，但是很有用，省去了判断的步骤，将判断和赋值合二为一
//        map.putIfAbsent(3, "jing"); //因为key=3已经存在，所以不会插入数据
//        System.out.println(map);
//--------------------------------------------------------------------
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            entry.setValue(entry.getValue().toUpperCase());
//        }
//        System.out.println(map);
//
//        Map<Integer, String> map2 = new HashMap<>();
//        map2.put(1, "one");
//        map2.put(2, "two");
//        map2.put(3, "three");
//        map2.replaceAll(new BiFunction<Integer, String, String>() {
//            @Override
//            public String apply(Integer k, String v) {
//                return map2.get(k).toUpperCase();
//            }
//        });
//        System.out.println(map2);
//
//        Map<Integer, String> map3 = new HashMap<>();
//        map3.put(1, "one");
//        map3.put(2, "two");
//        map3.put(3, "three");
////        map3.replaceAll((k, v) -> {
////            return map3.get(k).toUpperCase();});
//        map3.replaceAll((k, v) -> map3.get(k).toUpperCase());   //省略return
//        System.out.println(map3);
//--------------------------------------------------------------------
//        Map<Integer, Set<String>> map = new HashMap<>();
//        Set<String> set = new HashSet<>();
//        set.add("jing");
//        set.add("xin");
//        map.put(1, set);
//        if(map.containsKey(1)) {
//            map.get(1).add("ling");
//        } else {
//            Set<String> set2 = new HashSet<>();
//            set2.add("ling");
//            map.put(1, set2);
//        }
//        System.out.println(map);
//
//        Map<Integer, Set<String>> map = new HashMap<>();
//        map.computeIfAbsent(1, new Function<Integer, Set<String>>() {
//            @Override
//            public Set<String> apply(Integer integer) {
//                Set<String> set3 = new HashSet<>();
//                set3.add("wang");
//                return set3;
//            }
//        });
//        System.out.println(map);

        Map<Integer, Set<String>> map = new HashMap<>();
        //将条件判断和添加操作合二为一，使代码更加简洁
        map.computeIfAbsent(1, set -> new HashSet<String>()).add("jing"); //当不存在key=1时添加值
        System.out.println(map);
//--------------------------------------------------------------------

    }
}

