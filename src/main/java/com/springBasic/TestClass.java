package com.springBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {
//        TestClass testClass = new TestClass();
//        int val = testClass.test();
//        System.out.println(val);

        List<Integer> data = Arrays.asList(10,20,30,15,25,30,35,40,25,20,15);
        List<Integer> val = data.stream().distinct().collect(Collectors.toList());
        System.out.println(val);

    }

//    public int test(){
//        int otp = SampleTest.test1();
//        return otp;
//    }
}
