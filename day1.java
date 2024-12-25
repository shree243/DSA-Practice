// import java.util.Arrays;

// abstract class honda {

//     abstract void ride();
// }

// class vehical extends honda {
//     void ride() {
//         System.out.println("extended");
//     }
// }

// public class day1 {

//     public static void main(String[] args) {

//         vehical vh = new vehical();
//         vh.ride();
//     }
// }

class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg() {
        System.out.println("Welcome");
    }
}

public class day1 extends A,B
{

    public static void main(String[] args) {
        day1 dd = new day1();
        dd.msg();
    }
}