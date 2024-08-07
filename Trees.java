// import java.util.ArrayList;

// class Node {
// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// left = right = null;
// }
// }

// public class Trees {

// public static void inOrder(Node root, ArrayList<Integer> list) {

// if (root == null)
// return;
// inOrder(root.left, list);
// list.add(root.data);
// inOrder(root.right, list);
// }

// public static void main(String[] args) {

// ArrayList<Integer> list = new ArrayList<>();

// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(4);
// root.right.left = new Node(5);
// root.right.right = new Node(6);
// root.right.left.left = new Node(7);
// root.right.left.right = new Node(8);
// inOrder(root, list);
// for (Integer ls : list) {
// System.out.print(ls);
// }
// }
// }

import java.util.*;

// class Node {

// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// this.left = this.right = null;
// }
// }

// public class Trees {

// public static void inOrder(Node root, ArrayList<Integer> list) {
// Stack<Node> st = new Stack<>();
// Node cur = root;
// while (!st.empty() || cur != null) {
// if (cur != null) {
// st.push(cur);
// cur = cur.left;
// } else {
// cur = st.pop();
// list.add(cur.data);
// cur = cur.right;
// }
// }
// }

// public static void main(String[] args) {
// ArrayList<Integer> list = new ArrayList<Integer>();
// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(4);
// root.right.left = new Node(5);
// root.right.right = new Node(6);
// root.right.left.left = new Node(7);
// root.right.left.right = new Node(8);
// inOrder(root, list);
// for (Integer ls : list) {
// System.out.print(ls + " ");
// }
// }
// }

// class Node {
// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// this.left = this.right = null;
// }

// }

// public class Trees {

// public static void postOrder(Node root) {

// Node cur = root;

// if (cur == null)
// return;
// postOrder(cur.left);
// postOrder(cur.right);
// System.out.print(cur.data + " ");

// }

// public static void main(String[] args) {
// Node root = new Node(1);
// root.left = new Node(2);
// root.right = new Node(3);
// root.left.left = new Node(4);
// root.right.left = new Node(5);
// root.right.right = new Node(6);
// root.right.left.left = new Node(7);
// root.right.left.right = new Node(8);
// postOrder(root);
// }
// }

// class Node {

// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// this.left = this.right = null;
// }

// }

// public class Trees {

// public static boolean Identical(Node x, Node y) {
// if (x == null && y == null)
// return true;
// return (x != null && y != null) && (x.data == y.data) &&
// Identical(x.left, y.left) && Identical(x.right, y.right);
// }

// public static void main(String[] args) {

// Node x = new Node(15);
// x.left = new Node(10);
// x.right = new Node(20);
// x.left.left = new Node(8);
// x.left.right = new Node(12);
// x.right.left = new Node(16);
// x.right.right = new Node(25);

// // construct the second tree
// Node y = new Node(15);
// y.left = new Node(10);
// y.right = new Node(20);
// y.left.left = new Node(8);
// y.left.right = new Node(12);
// y.right.left = new Node(16);
// y.right.right = new Node(25);
// boolean res = Identical(x, y);
// if (res)
// System.out.println("Identical");
// else
// System.out.println("NOt Identical");
// }
// }

// class Node {
// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// this.left = this.right = null;
// }
// }

// class Pair {
// int hd;
// Node data;

// public Pair(int hd, Node data) {
// this.hd = hd;
// this.data = data;
// }
// }

// public class Trees {

// public static void topView(Node root) {

// Queue<Pair> queue = new LinkedList<>();

// Map<Integer, Integer> map = new HashMap<>();
// queue.add(new Pair(0, 1));
// while (!queue.empty()) {
// Pair cur = queue.poll();
// if (!map.containsKey(cur.hd)) {
// map.put(cur.hd, cur.data.data);
// }
// if (cur.data.left != null) {
// queue.add(new Pair(cur.hd - 1, cur.data.left));
// }
// }
// }

// public static void main(String[] args) {

// Node root = new Node(15);
// root.left = new Node(10);
// root.right = new Node(20);
// root.left.left = new Node(8);
// root.left.right = new Node(12);
// root.right.left = new Node(16);
// root.right.right = new Node(25);

// }
// }

// class Node {
//     int data;
//     Node left, right;

//     public Node(int data) {
//         this.data = data;
//         this.left = this.right = null;
//     }
// }

// public class Trees {

//     public static void sumNodes(Node root) {
//         if (root == null)
//             return;
//         int child = 0;
//         if (root.left != null)
//             child += root.left.data;
//         if (root.right != null)
//             child += root.right.data;
//         if (child >= root.data)
//             root.data = child;
//         else {
//             if (root.left != null)
//                 root.left.data = child;
//             if (root.right != null)
//                 root.right.data = child;
//         }
//         sumNodes(root.left);
//         sumNodes(root.right);

//         int total = 0;

//         if (root.left != null)
//             total += root.left.data;
//         if (root.right != null)
//             total += root.right.data;
//         if (root.left != null || root.right != null)
//             root.data = total;

//     }

//     public static void traverse(Node root) {
//         if (root.left != null)
//             traverse(root.left);
//         System.out.println(root.data);

//         if (root.right != null)
//             traverse(root.right);
//     }

//     public int height(Node root) {
//         if (root == null)
//             return 0;

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }

//     public static Node lcm(Node root, int p, int q) {
//         if (root == null)
//             return null;
//         if (root.data == p || root.data == q) {
//             return root;
//         }

//         Node left = lcm(root.left, p, q);
//         Node right = lcm(root.right, p, q);

//         if (root.left == null)
//             return right;
//         if (root.right == null)
//             return left;
//         return root;
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.right = new Node(4);
//         root.right.left = new Node(5);
//         root.right.left.left = new Node(7);
//         root.right.left.right = new Node(8);
//         root.right.right = new Node(6);
//         // sumNodes(root);
//         // traverse(root);
//         Node room = lcm(root, 7, 6);
//         System.out.println(room.data);
//     }
// }

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class Trees {

    public static void preOrder(Node root) {

        if (root == null)
            return;

        Stack<Node> st = new Stack<>();
        ArrayList<Node> arr = new ArrayList<>();

        st.push(root);
        while (!st.empty()) {
            Node node = st.pop();
            arr.add(node);
            if (root.right != null)
                st.push(root.right);
            if (root.left != null)
                st.push(root.left);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right = new Node(6);
    }
}