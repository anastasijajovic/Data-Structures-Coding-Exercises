package LinkedList.Exercise6;

import LinkedList.Node;

public class SinglyLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete(int data){
        if(head == null) {
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node previous = head;
        Node current = head.next;

        while(current != null) {
            if(current.data == data){
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void display(){
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
