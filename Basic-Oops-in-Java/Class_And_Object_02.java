// Another Class was Created

class Demo
{
    int num=10;
    String name="Joyal Shaji";
    void show()
    {
        System.out.println("Number is :"+num);
        System.out.println("Name is :"+name);
    }
}
// this class was calling on main function

public class Class_And_Object_02 {
    public static void main(String[] args) {
        // Case 1 : Create a Object
        Demo d = new Demo();
        d.show();
        // Case 2 : Create a Object
        Demo1 d1;
        d1 = new Demo1();
        d1.show1();
    }    
}

// Another Class was Created

class Demo1
{
    int num1=100;
    String name1="Sreemayi CM";
    void show1()
    {
        System.out.println("Number is :"+num1);
        System.out.println("Name is :"+name1);
    }
}