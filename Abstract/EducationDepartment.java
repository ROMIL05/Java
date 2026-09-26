abstract class PaymentSetting{
    int da;
    int hra;
    PaymentSetting(){
        da = 50;
        hra = 27;
    }
    void printSetting(){
        System.out.println("DA is "+ da);
        System.out.println("HRA is "+ hra);
    }
    abstract void calculateSalary();
    abstract void printSalary();
}

//abstract class parent extends PaymentSetting{}
//abstract class child extends parent{}
//class EducationDepartment extends child{
class EducationDepartment extends PaymentSetting{
    int basicSalary;
    double grossSalary;
    EducationDepartment(int basicSalary){
        this.basicSalary = basicSalary;
        grossSalary = -1;
    }
    void calculateSalary(){
        grossSalary = basicSalary + (basicSalary*da/100.0) + (basicSalary*hra/100.0);
    }
    void printSalary(){
        System.out.println("Your Basic Salary is " + basicSalary);
        printSetting();
        System.out.println("Your Gross Salary is " + grossSalary);
    }
    public static void main(String[] args){
        EducationDepartment obj = new EducationDepartment(10000);
        obj.calculateSalary();
        obj.printSalary();

        //PaymentSetting o = new PaymentSetting();
    }
}

/*
You cannot create an object of an abstract class directly.

A class can only extend one abstract class, restricting flexibility.

If an abstract class contains abstract methods, subclasses must implement them.

An abstract class must have at least one abstract method OR rely on the abstract keyword to prevent instantiation.

Unlike interfaces, abstract classes can have constructors but cannot be instantiated directly.

Since abstract classes allow partial implementation, subclasses are not forced to provide all method implementations.
*/