import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float p = 3.14f;
        float area = p*r*r;
        System.out.println(area);
        sc.close();
    }
}
