// Default Constructor is Created - 1
class Default1 {
    int number;
    String name;
    boolean condition;

    Default1() {
        number = 100;
        name = "Sreemayi CM";
        condition = true;
    }

    void show() {
        System.out.println("Number is :" + number);
        System.out.println("Name is :" + name);
        System.out.println("Condition is :" + condition);
    }
}

public class Default_Constructor_04 {
    public static void main(String[] args) {
        Default1 d = new Default1();
        d.show();
        Default2 d1 = new Default2();
        d1.show1();
    }
}

// Default Constructor is Created - 2

class Default2 {
    // This Arguments are not Work

    int num1 = 100;
    String name1 = "Joyal Shaji";
    boolean condition = false;

    Default2() {
        num1 = 200;
        name1 = "Sreemayi CM";
        condition = true;
    }
    void show1()
    {
        System.out.println("Number is :"+num1);
        System.out.println("Name is :"+name1);
        System.out.println("Condition is :"+condition);
    }
}