import java.util.Stack;

public class Push {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        s1.push(34);
        s1.push(78);
        s1.push(93);
        s2.push("Apple");
        s2.push("Tipitip");
        System.out.println("Stack 1 :- " +s1);
        System.out.println("Stack 2 :- " +s2);
    }
}
