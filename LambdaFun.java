import java.util.ArrayList;

public class LambdaFun {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i+1);
        }

        //============ using lambda exp
        arrayList.forEach((i) -> System.out.println(i *2) );
    }

    int sum(int a, int b){
        return a+b;
    }
}
