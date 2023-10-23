class Constructor1
{
    int num;
    String name;
    // Constructor()
    // {
    //     num = 0;
    //     name = null;
    // }
    void show()
    {
        System.out.println("Number is :"+num);
        System.out.println("Name is :"+name);
    }
}

class Constructor2
{
    int num1;
    String name1;
    Constructor2()
    {
        num1 = 10;
        name1  = "Joyal Shaji";
    }
    void show1()
    {
        System.out.println("Number is :"+num1);
        System.out.println("Name is :"+name1);
    }
}

class Constructor_03
{
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        Constructor2 c2 = new Constructor2();
        c1.show();
        c2.show1();
    }
}