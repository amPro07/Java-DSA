import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Anuj Purohit";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('r'));
        System.out.println("     Anuj     ".strip());
        System.out.println(Arrays.toString(name.split("u")));
        String  p = " ";
       
        System.out.println(isPallendrom(p));
    }

    private static boolean isPallendrom(String p) {
        int s=0, e=p.length()-1;
        while(s<=e){
            if(p.charAt(s)!=p.charAt(e)){
                return false;
            }
            s++; e--;
        }
        return true;
    }
}
