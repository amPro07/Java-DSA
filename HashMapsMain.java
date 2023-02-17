import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapsMain {
    
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 20);
        map.put("China", 130);
        map.put("USA", 90);

        // System.out.println(map);

        // map.put("China", 150);
        // System.out.println(map);

        //search
        // if(map.containsKey("USA")){
        //     System.out.println("Key exixts.");
        // }else{
        //     System.out.println("Key does not exist");
        // }

        // System.out.println(map.get("China"));

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" : "+ map.get(key));
        }

        map.remove("China");
        System.out.println(map);
    }
}
