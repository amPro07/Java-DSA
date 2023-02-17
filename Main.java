import Inheritance.BOxWeight;
import Inheritance.Box;

public class Main {
    public static void main(String[] args) {
        // Student student1 = new Student();
        // student1.name = "Anuj";
        // student1.rollNo = 007;
        // student1.marks = 65;

        // System.out.println(student1.marks);
        // System.out.println(Student.school);

        // Singleton singleton = new Singleton();
        Singleton obj = Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        //----------------------------------------------
        Box box = new Box(4);
        BOxWeight bOxWeight = new BOxWeight();
        BOxWeight bOxWeight1 = new BOxWeight(4, 5, 8, 7);

        System.out.println(bOxWeight1.h + " "+ bOxWeight1.l+" "+ bOxWeight1.w+" "+bOxWeight1.weight);


    }
}
