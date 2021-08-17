package com.example.springtest.lianbiao;

import java.util.stream.Stream;

public class StringTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("abc");
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse.toString());
    }
}
