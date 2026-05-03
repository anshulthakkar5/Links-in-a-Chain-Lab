package org.example;

public class LinkedList {

    // Node class (object-based nodes)
    public static class Node {
        public Link data;
        public Node next;

        public Node(Link data) {
            this.data = data;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node node) {
            this.next = node;
        }
    }

    private Node head;

    public LinkedList(Link data) {
        head = new Node(data);
    }

    public Node getHead() {
        return head;
    }
}
