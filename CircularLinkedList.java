class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node deleteNodeAtIndex(Node head, int index) {
        if (head == null || head.next == null)
            return null;

        int count = 1;
        Node temp = head;
        Node prev = null;
        while (count != index) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
        return head;

    }

    public static void printNodes(Node head) {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }

    public static Node headDelete(Node head) {
        if (head == null || head.next == null)
            return null;

        Node temp = head.next;
        Node tail = temp.next;
        while (tail.next != head) {
            tail = tail.next;
        }
        head = head.next;
        tail.next = head;
        return head;

    }

    public static int searchElement(int data, Node head) {
        Node temp = head;
        int count = 1;
        while (temp.data != data) {
            temp = temp.next;
            count++;
        }
        return count;

    }

    public static void insertAtIndex(int data, Node head, int index) {
        Node temp = head;
        int count = 1;
        Node prev = null;
        while (count != index) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        Node node = new Node(data);
        prev.next = node;
        node.next = temp;
    }

    public static Node reverseLinkedList(Node head) {
        if (head.next == null)
            return head;
        if (head == null)
            return null;
        Node temp = head;
        Node prev = null;
        while (temp.next != head) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        temp.next = prev;
        head.next = temp;
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(5);
        Node node7 = new Node(6);
        Node node8 = new Node(7);
        Node node9 = new Node(8);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = head;
        System.out.println("Before deleting");
        printNodes(head);

        Node newHead = deleteNodeAtIndex(head, 4);
        System.out.println();
        System.out.println("After deleting");
        printNodes(newHead);
        Node nHead = headDelete(newHead);
        System.out.println();
        System.out.println("After deleting Head");
        printNodes(nHead);
        int index = searchElement(4, nHead);
        System.out.println();
        System.out.println("index --> " + index);
        insertAtIndex(97, nHead, 5);
        System.out.println("After inserting at index");
        printNodes(nHead);
        Node newHeadRe = reverseLinkedList(nHead);
        System.out.println("After reverse");
        printNodes(newHeadRe);
    }
}