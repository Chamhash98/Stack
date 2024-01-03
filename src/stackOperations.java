import java.util.Stack;

public class stackOperations {
    static void stack_push(Stack<Integer> s){
        for(int i = 0; i<5; i++){
            s.push(i);
            System.out.println("Pushing :- " + i);
        }
    }
    static void stack_pop(Stack<Integer> s){
        for(int i = 0; i<5; i++){
           Integer j = (Integer)
            s.pop();
            System.out.println("Poping :- " + j);
        }
    }
    static void stack_peek(Stack<Integer> s){
        Integer element = (Integer) s.peek();
        System.out.println("Top Element :- " + element);
    }
    static void stack_search(Stack<Integer> s,int element){
        Integer position = (Integer) s.search(element);
        if (position == -1) {
            System.out.println("Element Not Found!");
        }else{
            System.out.println("Element is found at Position :- " + position);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        stack_push(s);
        System.out.println("Stack :- " + s);
        stack_pop(s);
        System.out.println("Stack :- " + s);
        stack_push(s);
        System.out.println("Stack :- " + s);
        stack_peek(s);
        stack_search(s,2);
        stack_search(s,6);
    }
}
