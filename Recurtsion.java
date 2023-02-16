public class Recurtsion {
    public static int factorial(int n){

        if(n == 1 || n==0){
            return 1;
        }
       int fact_nm1 = factorial(n-1);;
       int fact_n = n* fact_nm1;
       return fact_n;
    }

    public static void printFib(int a, int b, int n){
        if(n == 1){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String[] args) {
        // int n =6;
        // int ans = factorial(n);
        // System.out.println(ans);

        //fibonacci-------
        int a=0, b=1, n=100;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n-2);
    }
}
