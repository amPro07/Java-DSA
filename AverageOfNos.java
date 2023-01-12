import java.util.Scanner;

public class AverageOfNos {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        int avergae = (a+b+c)/3;
        System.out.println(avergae);
    }
}
