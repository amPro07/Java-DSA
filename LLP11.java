import java.util.*;

public class LLP11 {

    public static void findIndex(LinkedList<Integer> ll, Integer target){
        for(int i=0; i<ll.size(); i++){
            if(target == ll.get(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for( int i=0; i<50; i++){
            ll.add(i);
        }
        // Integer target = 7;
        // ll.add(1);
        // ll.add(5);
        // ll.add(7);
        // ll.add(3);
        // ll.add(8);
        // ll.add(2);
        // ll.add(3);
        // findIndex(ll, target);
        ListIterator<Integer> iterator = ll.listIterator();
        while(iterator.hasNext() ){
            if(iterator.next() > 25){
                ll.remove();
            }
        }

        for (Integer integer : ll) {
            System.out.println(integer);
        }
    }
}
