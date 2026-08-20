package LinkedList.Exercise7;

import LinkedList.Node;

public class LinkedListReverser {
    public Node reverseIterative(Node head){
        Node previous = null;
        Node current = head;

        while(current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public Node reverseReursive(Node head){
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseReursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void display(Node head){
        Node current = head;
        StringBuilder result = new StringBuilder();

        while(current != null){
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");

        System.out.println(result);
    }


}
