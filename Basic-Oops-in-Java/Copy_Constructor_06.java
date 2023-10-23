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
    }
}
