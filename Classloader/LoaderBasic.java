public class LoaderBasic {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());        // null (Bootstrap —> represented as null since it's native code)
        System.out.println(LoaderBasic.class.getClassLoader());     // AppClassLoader
        System.out.println(LoaderBasic.class.getClassLoader().getParent()); // Platform loader
    }
}