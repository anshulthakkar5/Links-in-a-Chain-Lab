package org.example;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Create linked list
        LinkedList list = new LinkedList(new Link("Head"));

        // Create nodes
        LinkedList.Node second = new LinkedList.Node(new Link("Second"));
        LinkedList.Node third = new LinkedList.Node(new Link("Third"));

        // Attach nodes
        list.getHead().setNext(second);
        second.setNext(third);

        // Traverse list
        LinkedList.Node current = list.getHead();
        while (current != null) {
            System.out.println(current.data.data);
            current = current.getNext();
        }
    }
}
