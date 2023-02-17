import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        
        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // System.out.println(set);

        //search
        // System.out.println(set.contains(2));

        //remove
        // set.remove(3);
        // System.out.println(set);

        Iterator it = set.iterator();
        //hasNext; next
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
