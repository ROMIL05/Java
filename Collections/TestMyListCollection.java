public class TestMyListCollection {
    public static void main() {
        MyListCollection list = new MyListCollection();
        for(int i = 0; i < 15; i++){
            list.add(i);
        }

        System.out.println("Size: " + list.size());
        System.out.println("Capacity: " + list.capacity());
        System.out.println(list.get(3));

        list.update(11, 7);
        System.out.println(list.get(11));
        System.out.println("My List: " + list.toString());


        MyListCollection list2 = new MyListCollection();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("Pear");
        list2.add("Pineapple");

        System.out.println("Size: " + list2.size());
        System.out.println("Capacity: " + list2.capacity());
        System.out.println(list2.get(3));

        list.update(1, "Strawberry");
        System.out.println(list.get(1));
        System.out.println("My List: " + list2);
    }
}
