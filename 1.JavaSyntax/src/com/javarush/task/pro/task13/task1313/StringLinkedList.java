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
        Node newNode = new Node();
        if (first.next != null) {
            Node preNewNode = last.prev;
            preNewNode.next = newNode;
            newNode.prev = preNewNode;
        } else {
            first.next = newNode;
            newNode.prev=first;
        }
        newNode.value = value;
        newNode.next=last;
        last.prev = newNode;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
