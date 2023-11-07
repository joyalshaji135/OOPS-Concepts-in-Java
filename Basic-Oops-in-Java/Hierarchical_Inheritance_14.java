import java.util.Scanner;

class Super_Class
{
    int roll_no;
    String student_name;
    int mark_1,mark_2,mark_3;
    int total_mark;
    float average_mark;
    void Entered()
    {
        System.out.println("Enter the Roll No:");
        Scanner sc = new Scanner(System.in);
        roll_no = sc.nextInt();
        System.out.println("Enter Student Name:");
        student_name = sc.next();
        System.out.println("Enter Your Marks :");
        mark_1 = sc.nextInt();
        mark_2 = sc.nextInt();
        mark_3 = sc.nextInt();
    }
}

class Sub_Class_01 extends Super_Class
{
    void Student_Details()
    {
        System.out.println("Student Roll No is :"+roll_no);
        System.out.println("Student Name is :"+student_name);
        System.out.println("Student Marks :\n"+"Mark 1 :"+mark_1+"\nMark 2 :"+mark_2+"\nMark 3 :"+mark_3);
    }
    void Total_Mark()
    {
        total_mark = mark_1+mark_2+mark_3;
        System.out.println("Student Name is :"+student_name);
        System.out.println("Student Total Mark is :"+total_mark);
    }
    void Average_Mark()
    {
        total_mark = mark_1+mark_2+mark_3;
        average_mark = total_mark/3;
        System.out.println("Average Mark :"+average_mark);
    }
}

class Sub_Class_02 extends Super_Class
{
     void Student_Details()
    {
        System.out.println("Student Roll No is :"+roll_no);
        System.out.println("Student Name is :"+student_name);
        System.out.println("Student Marks :\n"+"Mark 1 :"+mark_1+"\nMark 2 :"+mark_2+"\nMark 3 :"+mark_3);
    }
    void Total_Mark()
    {
        total_mark = mark_1+mark_2+mark_3;
        System.out.println("Student Name is :"+student_name);
        System.out.println("Student Total Mark is :"+total_mark);
    }
    void Average_Mark()
    {
        total_mark = mark_1+mark_2+mark_3;
        average_mark = total_mark/3;
        System.out.println("Average Mark :"+average_mark);
    }
}

class Sub_Class_03 extends Super_Class
{
     void Student_Details()
    {
        System.out.println("Student Roll No is :"+roll_no);
        System.out.println("Student Name is :"+student_name);
        System.out.println("Student Marks :\n"+"Mark 1 :"+mark_1+"\nMark 2 :"+mark_2+"\nMark 3 :"+mark_3);
    }
    void Total_Mark()
    {
        total_mark = mark_1+mark_2+mark_3;
        System.out.println("Student Name is :"+student_name);
        System.out.println("Student Total Mark is :"+total_mark);
    }
    void Average_Mark()
    {
        total_mark = mark_1+mark_2+mark_3;
        average_mark = total_mark/3;
        System.out.println("Average Mark :"+average_mark);
    }
}

public class Hierarchical_Inheritance_14 {
    public static void main(String[] args) {
        Sub_Class_01 s1 = new Sub_Class_01();
        Sub_Class_02 s2 = new Sub_Class_02();
        Sub_Class_03 s3 = new Sub_Class_03();
        s1.Entered();
        s1.Student_Details();
        s1.Total_Mark();
        s1.Average_Mark();
        s2.Entered();
        s2.Student_Details();
        s2.Total_Mark();
        s2.Average_Mark();
        s3.Entered();
        s3.Student_Details();
        s3.Total_Mark();
        s3.Average_Mark();
    }
}
