package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }

    @Test
    void testLinkedListStructure() {
        LinkedList list = new LinkedList(new Link("Head"));

        LinkedList.Node second = new LinkedList.Node(new Link("Second"));
        LinkedList.Node third = new LinkedList.Node(new Link("Third"));

        list.getHead().setNext(second);
        second.setNext(third);

        assertEquals("Head", list.getHead().data.data);
        assertEquals("Second", list.getHead().getNext().data.data);
        assertEquals("Third", list.getHead().getNext().getNext().data.data);
    }
}
