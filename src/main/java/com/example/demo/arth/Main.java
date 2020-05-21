package com.example.demo.arth;


import com.example.demo.dto.User;
import javafx.util.Pair;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SkipList<String> list = new SkipList<String>();
        System.out.println(list);
        list.put(2, "yan");
        list.put(1, "co");
        list.put(3, "feng");
        //测试同一个key值
        list.put(1, "cao");
        list.put(4, "曹");
        list.put(6, "丰");
        list.put(5, "艳");
        System.out.println(list);
        System.out.println(list.size());

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("sdf = " + sdf.format(date));

        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version", 6.19));
        pairArrayList.add(new Pair<>("version", 10.24));
        pairArrayList.add(new Pair<>("version", 13.14));
        Map<String, Double> map = pairArrayList.stream().collect(Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v2));
// 生成的 map 集合中只有一个键值对：{version=13.14}

        List<User> users = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        Map<String, User> map1 = users.stream().collect(Collectors.toMap(User::getName, Function.identity(), (v1, v2) -> v2));
        Map<String, String> userMap = strings.stream().collect(Collectors.toMap(String::toString, Function.identity(), (v1, v2) -> v2));

    }

}
