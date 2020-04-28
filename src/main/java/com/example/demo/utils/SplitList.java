package com.example.demo.utils;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: demo:SplitList
 * @description:
 * @author: zcf
 * @create: 2020-01-13 10:21
 **/
public class SplitList {
    public static  <T> List<List<T>> splitList(List<T> list, int pageSize) {
        int listSize = list.size();
        int page = (listSize + (pageSize - 1)) / pageSize;
        List<List<T>> listArray = new ArrayList<List<T>>();
        for (int i = 0; i < page; i++) {
            List<T> subList = new ArrayList<T>();
            for (int j = 0; j < listSize; j++) {
                int pageIndex = ((j + 1) + (pageSize - 1)) / pageSize;
                if (pageIndex == (i + 1)) {
                    subList.add(list.get(j));
                }
                if ((j + 1) == ((j + 1) * pageSize)) {
                    break;
                }
            }
            listArray.add(subList);
        }
        return listArray;
    }


    public static void main(String[] args) {
        Map<String,Object> map = Maps.newHashMap();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        map.put("test",list);
        System.out.println("map = " + map);
        fileter(map);
        System.out.println("map = " + map);
    }

    public static  void fileter(Map<String,Object> map) {
      map.put("test",1);
    }
}
