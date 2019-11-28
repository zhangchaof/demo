//package com.example.demo.stream;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.example.demo.dto.User;
//import com.example.demo.stream.vo.Cat;
//import org.apache.commons.collections.MapUtils;
//import org.junit.Test;
//
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class StreamTest {
//    @Test
//    public void testStream() {
//        List<Integer> numbers = Arrays.asList(1, 2, 3);
//        //　顺序流
//        numbers.stream().forEach(n -> System.out.println(n));
//        //并行流
//        numbers.parallelStream().forEach(n -> System.out.println(n));
//    }
//
//    @Test
//    public void test2() {
//        System.out.println("过滤－找出年纪大于18岁的人");
//        List<User> list = initList();
//        list.stream().filter(vo -> vo.getAge() > 18).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("最大值－找出最大年纪的人");
//        Optional<User> max = list.stream().max(Comparator.comparing(User::getAge));
//        System.out.println("max = " + max.get());
//        System.out.println();
//
//
//        System.out.println("最大值－找出最小年纪的人");
//        Optional<User> min = list.stream().min(Comparator.comparing(User::getAge));
//        System.out.println("min = " + min.get());
//        System.out.println();
//
//        System.out.println("映射-规纳－求所有人的年纪总和");
//        Optional<Integer> reduce = list.parallelStream().map(User::getAge).reduce((x, y) -> x + y);
//        System.out.println("reduce = " + reduce.get());
//        System.out.println();
//
//        System.out.println("分组－按年纪分组");
//        Map<Integer, List<User>> collect = list.stream().collect(Collectors.groupingBy(User::getAge));
//        MapUtils.verbosePrint(System.out, null, collect);
//        System.out.println();
//
//        System.out.println("转map");
//        Map<Integer, User> collect1 = list.stream().collect(Collectors.toMap(User::getAge, vo -> vo, (k1, k2) -> k1));
//        MapUtils.verbosePrint(System.out, null, collect1);
//        System.out.println();
//
//
//        System.out.println("创建－去重－统计");
//        Stream<User> userStream = Stream.of(new User("u1", 1), new User("u2", 21), new User("u2", 21));
//        System.out.println("userStream = " + userStream.distinct().count());
//        ;
//    }
//
//    public static List<User> initList() {
//        List<User> list = new ArrayList<>();
//        list.add(new User("oaby", 23));
//        list.add(new User("tom", 11));
//        list.add(new User("john", 16));
//        list.add(new User("jennis", 26));
//        list.add(new User("tin", 26));
//        list.add(new User("army", 26));
//        list.add(new User("mack", 19));
//        list.add(new User("jobs", 65));
//        list.add(new User("jordan", 23));
//        return list;
//    }
//
//    @Test
//    public void testCompare() {
//        List<User> list = initList();
//        list.sort(Comparator.comparing(User::getAge).thenComparingInt(User::getAge));
//        list.sort(Comparator.comparing(User::getAge));
//        System.out.println("list = " + list);
//
//    }
//
//    @Test
//    public void testReduce() {
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(Arrays.asList(new Integer[]{1, 2}));
//        list.add(Arrays.asList(new Integer[]{3, 4}));
//        list.add(null);
//        list.add(Arrays.asList(new Integer[]{4, 3, 5}));
//        List<Integer> result = list.stream()
//                .filter(item -> item != null)
//                .reduce(new ArrayList<>(), (all, item) -> {
//                    all.addAll(item);
//                    return all;
//                });
//        System.out.println(result);
//    }
//
//    @Test
//    public void testDate() throws Exception {
//        SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd");
//        String today = "2015-11-30";
//        Date d = sj.parse(today);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(d);
//        calendar.add(Calendar.DATE, 1);
//        System.out.println("明天：" + sj.format(calendar.getTime()));
//        //此时日期变为2015-12-01 ，所以下面的-2，
//        //理论上讲应该是2015-11-29
//        calendar.add(calendar.DATE, -2);
//        System.out.println("前天：" + sj.format(calendar.getTime()));
//
//    }
//
//    @Test
//    public void test11() throws Exception {
//        String dateTime = "2018-12-12 22:52:00";
//        SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//
//        long time = sj.parse(dateTime).getTime();
//        System.out.println("time = " + time);
//    }
//
//    @Test
//    public void testJsonMap() {
//        Map<String, String> map = new HashMap<>();
//        map.put("1", "1");
//        JSONObject object = new JSONObject();
//        object.put("1", 1);
//        Map<String, Object> map1 = (Map) object;
//        System.out.println("object = " + map1);
//        System.out.println("UUID.randomUUID() = " + UUID.randomUUID());
//    }
//
//    @Test
//    public void test() {
//        int[] nums = {1, 2, 4};
//        int[] ret = twoSum(nums, 5);
//    }
//
//    public int[] twoSum(int[] nums, int target) {
//        int[] ret = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    ret[0] = i;
//                    ret[1] = j;
//                    return ret;
//                }
//            }
//        }
//        return null;
//    }
//
//    public int[] twoSum2(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                return new int[]{map.get(target - nums[i]), i};
//            }
//            map.put(target - nums[i], i);
//        }
//
//
//        return null;
//    }
//
//    @Test
//    public void testJSON() {
//        Cat cat = new Cat();
//        cat.setName("111");
//        System.out.println("cat = " + JSON.toJSONString(cat));
//        String string = "{\"la\":\"11\"}";
//        Cat cat1 = JSON.parseObject(string, Cat.class);
//        System.out.println(cat1);
//    }
//}
