
public class Instance_Block_09 {
    int a,b;
    static void show()
    {
        System.out.println("Static Method");
    }
    Instance_Block_09()  //Constructor Block
    {
        a=100;
        b=200;
        System.out.println("a:"+a+"b:"+b);
    }
    {   //Instance Block
        a=10;
        b=20;
        System.out.println("a:"+a+"b:"+b);
    }
    static
    {
        System.out.println("Static Block");
    }
    public static void main(String[] args) 
    {
        Instance_Block_09.show();
        Instance_Block_09 i;
        i = new Instance_Block_09();
    }
}
