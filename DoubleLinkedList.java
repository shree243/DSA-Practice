import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node createDoubleLinkedList(List<Integer> list) {

        if (list.size() == 0)
            return null;
        int i = 0;
        Node head = new Node(list.get(0));
        Node prev = head;
        while (i < list.size()) {
            Node temp = new Node(list.get(i), null, prev);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
            i++;
        }

        return head;
    }

    public static void main(String[] args) {

        System.out.println("Create LinkedList");
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        while (true) {
            int num = sc.nextInt();
            if (num == -1)
                break;
            else {
                list.add(num);
            }
        }

        Node head = createDoubleLinkedList(list);
    }
}
