public class staticOverMethodRiding {
    public static void main(String[] args) {
        parent p = new child();
        p.m();
    }
}

class parent {
    static void m(){
        System.out.println("parent");
    }
}

class child extends parent{
    static void m(){
        System.out.println("child");
    }
}