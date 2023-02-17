class Student{

    int rollNo;
    String name;
    float marks;
    static String school = "KLE";

    Student(){
        
    }

    // Student(){
    //     //this is how to call a constructor from another constructor
    //     this(13,  "Default Persion",  0f);
    // }

    Student(int rollNo, String name, float marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}