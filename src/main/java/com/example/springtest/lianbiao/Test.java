package com.example.springtest.lianbiao;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add("abc");
//        myLinkedList.add("abc1");
//        myLinkedList.add("abc2");
//        myLinkedList.show();
//        System.out.println("====================");
//        for(Object o : myLinkedList){
//            System.out.println(o);
//        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("abc");
        linkedHashSet.add("abc1");
        linkedHashSet.add("abc2");
        linkedHashSet.add("abc3");
        linkedHashSet.add("abc4");
        Iterator iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }


    }
}
