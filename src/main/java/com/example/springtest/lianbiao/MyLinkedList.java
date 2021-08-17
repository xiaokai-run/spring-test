package com.example.springtest.lianbiao;

import java.util.Iterator;

public class MyLinkedList implements Iterable{
    public Node first = null;
    public Node lastNode;

    public void add(String data){
        Node node = new Node(data);
        if(first == null){
            lastNode = node;
            first = node;
        }else{
            lastNode.next = node;
            lastNode = node;
        }
    }
    public void show(){
        Node node = first;
        while(node != null){
            System.out.println(node.getData());
            node = node.next;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node node = first;
            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Object next() {
                Object data = node.getData();
                node = node.next;
                return data;
            }
        };
    }
}
