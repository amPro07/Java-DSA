public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

     int ptr = -1;
    CustomStack(){
        this(DEFAULT_SIZE);
    }

    CustomStack(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int rem = data[ptr];
        ptr--;
        return rem;
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[ptr];
    }
}
