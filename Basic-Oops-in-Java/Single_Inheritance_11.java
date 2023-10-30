class College
{
    int roll;
    int mark;
    String name;
    void score()
    {
        System.out.println("Student Roll no , Mark and Name:");
    }
}

class Student extends College
{
    void show()
    {
        roll = 10;
        mark = 200;
        name = "Joyal Shaji";
        System.out.println("Roll no is :"+roll);
        System.out.println("Mark is :"+mark);
        System.out.println("Student Name is :"+name);
    }
}

public class Single_Inheritance_11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.score();
        s.show();
    }    
}
