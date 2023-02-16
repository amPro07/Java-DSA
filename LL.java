public class LL{

    int size;

        LL() {
            this.size = 0;
        }

    Node head;
    class Node{
        String data;
        Node next;
        

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add- last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentnode = head;
        while(currentnode.next != null){
            currentnode = currentnode.next;
        }
        currentnode.next = newNode;
    }

    //print list
    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentnode = head;
        while(currentnode != null){
            System.out.print(currentnode.data+" -> ");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }

    //delete first
    public void deleteFirst(){
        size--;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    //delete - last
    public void deleteLast(){
        size--;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next !=null){
            last= last.next;
            secondLast= secondLast.next;
        }
        secondLast.next =null;
    }

    public int getSize(){
       return size;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printlist();
        list.deleteFirst();
        list.printlist();

        list.deleteLast();
        list.printlist();
        System.out.println(list.getSize());
    }

}