import java.util.Scanner;

class College {
    int roll;
    int mark;
    String name;

    void score() {
        System.out.println("Student Roll no , Mark and Name:");
    }
}

class Student extends College {
    void show() {
        roll = 10;
        mark = 200;
        name = "Joyal Shaji";
        System.out.println("Roll no is :" + roll);
        System.out.println("Mark is :" + mark);
        System.out.println("Student Name is :" + name);
    }
}

public class Single_Inheritance_11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.score();
        s.show();
        System.out.println("_________________________________________");
        Employee e = new Employee();
        e.Input_Data();
        e.Display_Inputs();
    }
}

class Company {
    int Reg_no;
    String Employee_Name;
    float Salary;
    void Input_Data() {
        System.out.println("Enter the Company Employee Reg no: ");
        Scanner sc = new Scanner(System.in);
        Reg_no = sc.nextInt();
        System.out.println("Enter the Employee Name :");
        Employee_Name = sc.next();
        System.out.println("Enter the Salary :");
        Salary = sc.nextFloat();
    }
}

class Employee extends Company {
    void Display_Inputs() {
        System.out.println("Employee Reg No :"+Reg_no);
        System.out.println("Employee Name :"+Employee_Name);
        System.out.println("Employee Salary :"+Salary);
    }
}

// Private Method is not Access the outside of the Class

// Protect Method is Access to Outside the Class