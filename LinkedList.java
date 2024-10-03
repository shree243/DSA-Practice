// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Scanner;

// class LinkedLists {

// static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static void printAllNodes(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }

// public static int deleteNode(Node head, int deleteNode) {
// Node front = head.next;
// Node back = head;
// while (front.data != deleteNode) {
// front = front.next;
// back = back.next;
// }
// if (front.next != null && front.data == deleteNode) {
// back.next = front.next;
// return front.data;
// } else if (front.next == null && front.data == deleteNode) {
// back.next = null;
// return front.data;
// }
// return head.data;
// }

// public static Node deleteHead(Node head) {
// Node temp = head;
// head = head.next;
// temp.next = null;
// return head;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Please enter the data and enter -1 to stop");
// List<Integer> list = new LinkedList<>();
// while (true) {
// int num = sc.nextInt();
// if (num == -1) {
// break;
// }
// list.add(num);
// }
// System.out.println(list.toString());
// int i = 1;

// Node head = new Node(list.get(0));
// Node temp = head;
// while (i < list.size()) {
// Node node = new Node(list.get(i));
// temp.next = node;
// temp = node;
// i++;
// }
// System.out.println("Before Deleting");
// printAllNodes(head);
// System.out.println("Enter the element which needs to be delete");
// int deleteNode = sc.nextInt();
// if (deleteNode == head.data) {
// Node newHead = deleteHead(head);
// System.out.println("After Deleting");
// printAllNodes(newHead);
// } else {
// deleteNode(head, deleteNode);
// System.out.println("After Deleting");
// printAllNodes(head);
// }

// }
// }