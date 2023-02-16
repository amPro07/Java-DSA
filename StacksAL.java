//Stacks using ArrayList 
import java.util.*;

class Stack{
    static ArrayList<Integer> list = new ArrayList<>();

    public static Boolean isEmpty(){
        return list.size() == 0;
    }
    
    public static void push(int data){
        list.add(data);
    }
    
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;

    }

    public static int peak(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    
}

public class StacksAL {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
       
        while(!stack.isEmpty()){
            System.out.println(stack.peak());
            stack.pop();
        }
    }
}
