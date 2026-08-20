package LinkedList;

public class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
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
