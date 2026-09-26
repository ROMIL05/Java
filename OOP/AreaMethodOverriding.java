class Shape{
    int l;
    Shape(){}
    Shape(int l){
        this.l = l;
    }
    double area(){return 1.99999999;}
    int printValue(){
        return l;
    }
}
class Square extends Shape{
    Square(int l){
        super(l);
    }
    double area(){
        return l*l;
    }
}
class Rectangle extends Shape{
    int b;
    double area(){
        return l*b;
    }
    Rectangle(int l, int b){
        //super(l); -> Compiler automatically injects a hidden, no-argument call to super();
        this.l = l;
        this.b = b;
    }
}
class AreaMethodOverriding{
    public static void main(String args[]){
        Shape obj;
        obj = new Square(10);
        System.out.println("Area of Square is : " + obj.area());
        System.out.println("Value of shape 'l' is : " + obj.printValue());

        obj = new Rectangle(20, 30);
        System.out.println("Area of Rectangle is : " + obj.area());
        System.out.println("Value of shape 'l' is : " + obj.printValue());
    }
}