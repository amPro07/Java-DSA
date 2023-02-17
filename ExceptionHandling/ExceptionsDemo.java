package ExceptionHandling;

public class ExceptionsDemo {

    public static void main(String[] args) {
        int a = 5, b=0;
        
        try {
            // int sum = a/b;
            // divide(a, b);
            String name = "Anuj";
            if(name == "Anuj"){
                throw new MyException("The names are same ");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally - This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
    
}
