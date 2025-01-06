import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingleLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node createLinkedList(List<Integer> list) {

        int i = 1;
        Node head = new Node(list.get(0));
        Node temp = head;
        if (list.size() > 1) {
            while (i < list.size()) {
                Node node = new Node(list.get(i));
                temp.next = node;
                temp = node;
                i++;
            }
        }
        return head;
    }

    public static void printNodes(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void insertAtPosition(int pos, int data, Node head) {
        Node temp = head;
        int count = 1;
        while (count < pos) {
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Print the node which you want");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            } else {
                list.add(num);
            }
        }
        System.out.println("Create LinkedList");
        Node head = createLinkedList(list);
        printNodes(head);
        System.out.println("Inserting at the position with data: - ");
        int pos = sc.nextInt();
        int dataToEnter = sc.nextInt();

        insertAtPosition(pos, dataToEnter, head);

    }
}
