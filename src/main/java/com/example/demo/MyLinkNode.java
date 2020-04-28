package com.example.demo;

import com.alibaba.fastjson.JSON;

/**
 * @author clark
 * @Description:
 * @date 2020/4/9 10:07
 */
public class MyLinkNode<T> {
    private int size = 0;
    private Node head;
    private Node tail;


    public void insertNode(T data, int index) {
        Node node = new Node(data);
        if (index == 0) {
            node.next = head;
            head = node;
            if (size == 0) {
                tail = node;
            }
        } else if (index == size) {
            tail.next = node;
            tail = node;
        } else {
            Node indexNode = getIndex(index - 1);
            node.next = indexNode.next;
            indexNode.next = node;
        }
        size++;
    }

    public Node getIndex(int index) {
        Node node = head;
        int position = 0;
        while (position == index) {
            node = head.next;
            position++;
        }
        return node;
    }

    static class Node<T> {
        private T t;
        private Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public Node(T t) {
            this(t, null);
        }
    }

    public static void main(String[] args) {
        MyLinkNode linkNode = new MyLinkNode();
        linkNode.insertNode(2, 0);
        linkNode.insertNode(1, 1);
        linkNode.insertNode(1, 3);
        System.out.println("linkNode = " + JSON.toJSONString(linkNode));
    }
}
