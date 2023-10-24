class Copy
{
    int number;
    String name;
    Copy()
    {
        number = 100;
        name = "Joyal Shaji";
    }
    Copy(Copy ref)
    {
        number = ref.number;
        name = ref.name;
        System.out.println("Number is :"+number);
        System.out.println("Name is :"+name);
    }
}

public class Copy_Constructor_06 {
    public static void main(String[] args) {
        Copy c = new Copy();
        Copy c1 = new Copy(c);
        Copy2 c2 = new Copy2(100, "Sreemayi CM");
        Copy2 c3 = new Copy2(c2);
        c3.display();
        c2.display1();
    }
}

class Copy2
{
    int number1;
    String name1;
    int number2;
    String name2;
    Copy2(int num1,String name)
    {
        number1 = num1;
        name1 = name;
    }

    Copy2(Copy2 obj)
    {
        number2 = obj.number1;
        name2 = obj.name1;
    }

    void display()
    {
        System.out.println("Number 2 is :"+number2);
        System.out.println("Name 2 is :"+name2);
    }

    void display1()
    {
        System.out.println("Number 1 is :"+number1);
        System.out.println("Name 1 is :"+name1);
    }
}