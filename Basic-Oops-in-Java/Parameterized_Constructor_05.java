class Parameter1
{
    int number1,number2;

    Parameter1(int num1,int num2)
    {
        number1 = num1;
        number2 = num2;
    }
    void show()
    {
        System.out.println("Number 1 is :"+number1);
        System.out.println("Number 2 is :"+number2);
    }
    Parameter1(int num1,String name)
    {
        System.out.println("Number is :"+num1);
        System.out.println("Name is :"+name);
    }
}

public class Parameterized_Constructor_05 {
    public static void main(String[] args) {
        Parameter1 p1 = new Parameter1(100, 200);
        p1.show();
        Parameter1 p2;
        p2 = new Parameter1(300, "Sreemayi");
    }
}
