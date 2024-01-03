import java.util.Stack;

public class Pop {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s2.push("A");
        s2.push("B");

        System.out.println("Before :- " + s1);
        System.out.println("Before :- " + s2);

        s1.pop();
        s2.pop();
        s1.pop();

        System.out.println("After :- " + s1);
        System.out.println("After :- " + s2);
    }
}
