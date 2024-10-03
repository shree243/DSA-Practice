import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * LinkedLists
 */
public class LinkedLists {

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev) {
            this.next = next;
            this.data = data;
            this.prev = prev;
        }

        public Node(int data) {
            this.next = null;
            this.data = data;
            this.prev = null;
        }

        public static void insert(Node node) {

        }

    }

    public static void createDll(List<Integer> list, Node head) {
        int i = 1;
        Node prev = head;
        while (i < list.size()) {
            Node node = new Node(list.get(i), null, prev);
            prev.next = node;
            node.prev = prev;
            prev = prev.next;
            i++;
        }
    }

    public static void printDll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node deletedHead(Node head) {

        if (head == null || head.next == null)
            return null;
        Node temp = head.next;
        temp.prev = null;
        head.next = null;
        return temp;
    }

    public static void deleteTail(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node tail = temp.prev;
        tail.next = null;
        temp.prev = null;
    }

    public static void deleteNode(Node head, int atNode) {
        Node temp = head;
        int count = 1;
        while (count != atNode) {
            temp = temp.next;
            count++;
        }
        Node prev = temp.prev;
        Node next = temp.next;
        temp.prev = null;
        temp.next = null;
        prev.next = next;
        next.prev = prev;
    }

    public static void insertAtIndex(int data, int atIndex, Node newHead) {
        Node temp = newHead;
        int count = 1;
        while (count != atIndex) {
            temp = temp.next;
            count++;
        }
        Node node = new Node(data);
        Node prev = temp.prev;
        prev.next = null;
        temp.prev = null;
        prev.next = node;
        node.prev = prev;
        temp.prev = node;
        node.next = temp;
    }

    public static Node reverseDll(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            temp = temp.prev;
        }
        return prev.prev;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Press the element data to create the link list and -1 to stop");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int element = sc.nextInt();
            if (element == -1) {
                break;
            }
            list.add(element);
        }
        Node head = new Node(list.get(0));
        createDll(list, head);
        System.out.println("Created Linked List");
        printDll(head);
        Node newHead = deletedHead(head);
        System.out.println("Delete the head");
        printDll(newHead);
        deleteTail(newHead);
        System.out.println("Delete the Tail");
        printDll(newHead);
        deleteNode(newHead, 3);
        System.out.println("Delete the at the index");
        printDll(newHead);
        insertAtIndex(78, 5, newHead);
        System.out.println("After inserting element at index");
        printDll(newHead);
        Node newHeadd = reverseDll(newHead);
        System.out.println("reverse Linked List");
        printDll(newHeadd);

    }
}
