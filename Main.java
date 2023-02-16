public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(12);
        stack.push(5);
        stack.push(7);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
