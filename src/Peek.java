import java.util.Stack;

public class Peek {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Top Element :- " + s.peek());
        System.out.println("Position of 20 :- " + s.search(20));
        System.out.println("is Stack Empty? :- " + s.empty());
    }
}
