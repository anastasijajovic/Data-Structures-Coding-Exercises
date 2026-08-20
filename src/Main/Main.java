package Main;

import Arrays.Exercise5.PairSumFinder;
import LinkedList.Exercise6.SinglyLinkedList;
import LinkedList.Exercise7.LinkedListReverser;
import LinkedList.Exercise8.CycleDetector;
import LinkedList.Node;

public class Main {
    public static void main(String[] args) {
//      Arrays.Exercise1
//        MinMaxNumber minMaxFinder = new MinMaxNumber();
//        int[] numbers = {12,45,2,78,34,5};
//        int[] results = minMaxFinder.findMinMax(numbers);
//        System.out.println("Max: " + results[0]);
//        System.out.println("Min: " + results[1]);

//      Arrays.Exercise2
//        ArrayReverser arrayReverser = new ArrayReverser();
//        int[] numbers = {10,20,30,40,50};
//        arrayReverser.reverseArray(numbers);
//        System.out.println(Arrays.toString(numbers));

//      Arrays.Exercise3
//        ArrayRotator arrayRotator = new ArrayRotator();
//        int[] numbers = {1,2,3,4,5,6,7};
//        int k = 3;
//        arrayRotator.rotateRight(numbers, k);
//        System.out.println(Arrays.toString(numbers));


//      Arrays.Exercise4
//        DuplicateRemover removeDuplicates = new DuplicateRemover();
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,10,20,30,30,30,40));
//        removeDuplicates.removeDuplicates(numbers);
//        System.out.println(numbers);

//      Arrays.Exercise5
//        PairSumFinder pairSumFinder = new PairSumFinder();
//        int[] numbers = {2, 4, 3, 7, 8, 1};
//        int target = 9;
//        pairSumFinder.findPairsWithSum(numbers, target);

//      LinkedList.Exercise6
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//        list.display();
//        list.delete(20);
//        list.display();

//      LinkedList.Exercise7
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//
//        LinkedListReverser linkedListReverser = new LinkedListReverser();
//        Node reversedHead = linkedListReverser.reverseIterative(head);
//
//        linkedListReverser.display(reversedHead);


//      LinkedList.Exercise8
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        CycleDetector cycleDetector = new CycleDetector();
        System.out.println("Cycle detector = " + cycleDetector.hasCycle(head));
    }
}
