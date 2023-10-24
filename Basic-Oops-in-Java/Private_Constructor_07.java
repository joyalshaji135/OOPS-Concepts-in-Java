public class Private_Constructor_07 {
    int number;
    String name;
    private Private_Constructor_07()
    {
        number = 100;
        name = "Joyal";
        System.out.println("Number is :"+number);
        System.out.println("Name is :"+name);
    }
    // static void show()
    // {
        
    // }
    public static void main(String[] args) {
        Private_Constructor_07 p1 = new Private_Constructor_07();  // This is Access Method
    }
}
// class B
// {
//     public static void main(String[] args) {
//         Private_Constructor_07 p2 = new Private_Constructor_07();    This not Access Method
//     }
// }