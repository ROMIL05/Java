public class tryFinallyReturn {
    public static void main() {
        A test = new A();
        System.out.println(test.checkWithInt());
        System.out.println(test.checkWithoutInt());
    }
}

class A{
    int checkWithInt() {
        int a = 10;
        try {
            return a;
        } finally {
            a = 50;
            return a;
        }
    }

    int checkWithoutInt() {
        try {
            return 10;
        } finally {
            return 50;
        }
    }
}
