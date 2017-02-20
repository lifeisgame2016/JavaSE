package com.goit.java8;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.Collectors;

public class NewMethodsJava8 {

    public static void joinInString(){
        System.out.println("===========Join================");
        //first
        String line = String.join(", ", "A", "B", "C", "D");
        System.out.println(line);

        //second
        Collection<String> strings = Arrays.asList("A", "B", "C", "D");
        String newString = strings.stream()
                .filter(i -> i!=null || i.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println(newString);
    }

    public static void mergeInMap(){
        //Map.computeIfAbsent()/getOrDefault()/merge()/putIfAbsent()
        String line = String.join(",", "A", "B", "C", "D", "A", "B", "A");
        System.out.println("================COUNT KEY=======================");
        System.out.println(line);
        Map<String, Integer> secondMap = new HashMap<>();

        //task: how many times we have met this line
        //first
        for(String s : line.split(",")){
            secondMap.merge(s, 1, (a,b) -> a+b);
        }
        secondMap.forEach((k,v) -> System.out.println("key=" + k + " value="+v));
        System.out.println("========");
        //second
        Map<String, Integer> firstMap = new HashMap<>();
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "A");
        list.forEach(s -> firstMap.merge(s, 1, (a,b) -> a+b));
        firstMap.forEach((k,v) -> System.out.println("key=" + k + " value="+v));
    }

    public static void threadWithInitial(){
        //java 7
        ThreadLocal<Object> mapper = new ThreadLocal<Object>(){
            @Override
            protected Object initialValue(){
                return new Object();
            }
        };

        //java 8
        ThreadLocal<Object> mpper = ThreadLocal.withInitial(() -> new Object());
    }

    public static void readLineFromFile() throws IOException {
        //Files.lines()/readAllLines()/BufferedReader.lines()

        int mean = (int) Files.lines(new File("testFile").toPath())
                .mapToInt(Integer::parseInt)
                .summaryStatistics()
                .getAverage();
    }

    public static void comparatorNew(){
        Comparator<User> comparator = Comparator
                .comparingDouble(User::getAge)
                .thenComparing(User::getName);
        List<User> hList = new ArrayList<>();
        hList.sort(comparator);
    }

    public static void listReplaceAll(){
        List<String> list = new ArrayList<>();

        list.replaceAll(String::toLowerCase);
    }

    public static void randomInts(){
        new Random().ints(10, 20, 100).forEach(System.out::println);
        //10 numbers between 20 and 100
    }

    public static void longAccumulator(){
        // ранвосильно new LongAdder()
        LongAccumulator a = new LongAccumulator((d, b) -> d +b, 0);
        a.accumulate(1);
        a.accumulate(2);
        a.accumulate(3);
        a.accumulate(4);

        a.longValue(); // 10
    }

    public static void javaFlightRecorder(){
        // command line : jmc
    }


    public static void main(String[] args) {
        joinInString();
        mergeInMap();
        randomInts();
        longAccumulator();
    }


    class User{
        private String name;
        private int age;

        User(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }
    }

}
