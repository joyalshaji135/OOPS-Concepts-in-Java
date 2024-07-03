public class _12_MethodOverloading {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

   
    public double add(double a, double b) {
        return a + b;
    }

    
    public String add(String a, String b) {
        return a + b;
    }

    
    public double add(int a, double b) {
        return a + b;
    }

    
    public double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        _12_MethodOverloading calc = new _12_MethodOverloading();

        
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15));
        System.out.println("Sum of 3.5 and 2.5: " + calc.add(3.5, 2.5));
        System.out.println("Concatenated string: " + calc.add("Hello ", "World"));
        System.out.println("Sum of 5 and 4.2: " + calc.add(5, 4.2));
        System.out.println("Sum of 3.7 and 2: " + calc.add(3.7, 2));
    }
}
