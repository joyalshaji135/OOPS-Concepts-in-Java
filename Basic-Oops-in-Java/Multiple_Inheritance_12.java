class Variable_Class // Super Class
{
    int num1,num2;
}

class Addition extends Variable_Class
{
    int Addition;
    void Add()
    {
        num1 = 100;
        num2 = 200;
        Addition  = num1 + num2;
        System.out.println("Addition of Two Number is :"+Addition);
    }
}

class Subtraction extends Addition
{
    int Subtraction;
    void Sub()
    {
        num1 = 300;
        num2 = 100;
        Subtraction = num1 - num2;
        System.out.println("Subtraction of Two Number is :"+Subtraction);
    }
}

class Multiplication extends Subtraction
{
    int Multiplication;
    void Mul()
    {
        num1 = 20;
        num2 = 30;
        Multiplication = num1 * num2;
        System.out.println("Multiplication of Two Number is :"+Multiplication);
    }
}

class Division extends Multiplication
{
    double Division;
    void Div()
    {
        num1 = 24;
        num2 = 2;
        Division = num1 / num2;
        System.out.println("Division of Two Number is :"+Division);
    }
}

class Last_Class extends Division 
{
    void Display()
    {
        System.out.println("---------------Arithematical Operation------------------");
    }
}

public class Multiple_Inheritance_12 {
    public static void main(String[] args) {
        Last_Class l = new Last_Class();
        l.Display();
        l.Add();
        l.Sub();
        l.Mul();
        l.Div();
    }
}
