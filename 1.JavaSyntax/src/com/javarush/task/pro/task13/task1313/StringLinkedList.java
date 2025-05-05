package com.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;

        Node firstn = first;
        firstn.next = node;
        last.prev = node;
        node.prev = first;
        node.next = last;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
