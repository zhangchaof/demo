package com.example.demo.stream.vo;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        String  aaa="password requisite pam_pwquality.so dcredit=-2 ucredit=3 lcredit=-1 ocredit=-4";
        String[] s = aaa.split(" ");
        List<String> list = Arrays.asList(s);
        /**
         * 需要获取后面这部分信息,并且对每个值进行判断dcredit=-2 ucredit=3 lcredit=-1 ocredit=-4
         */
        List<String> subList = Arrays.asList("dcredit=-2","ucredit=3","lcredit=-1","ocredit=-4");
        if(list.containsAll(subList)) {
            System.out.println(true);
        }
    }

    @Test
    public void printTime() throws Exception{
        String time = "2019-11-25 22:34:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date parse = sdf.parse(time);
        System.out.println("parse = " + parse.getTime());
    }
}
