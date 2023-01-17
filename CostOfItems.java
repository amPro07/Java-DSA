import java.util.Scanner;

public class CostOfItems {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    float pencil = s.nextFloat();
    float pen = s.nextFloat();
    float eraser = s.nextFloat();
    float total = (pencil +  pen + eraser) ;
    System.out.println("Total bill is : "+ total);

    float newTotal = (float) (total + (0.18 * total));
    System.out.println("Bill with 18% tax: "+ newTotal);
    s.close();
    }
}
