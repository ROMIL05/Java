public class MyListCollection<T> {
    private static final int initSize = 10;
    private int idx = 0;
    private int capacity = 10;
    private int size;

    private Object[] myArray;

    public MyListCollection(){
        this.myArray = new Object[initSize];
    }

    public MyListCollection(int initSize) {
        if(initSize >= 0){
            this.myArray = new Object[initSize];
        }
        else{
            throw new IllegalArgumentException("Illegal initial size: " + initSize);
        }
    }

    public void add(T value){
        myArray[idx++] = value;
        if(idx == capacity){
            resetCap();
        }
    }

    public void update(int index , T value){
        if(index >= 0 && index < capacity){
            myArray[index] = value;
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Index out of bound: " + index);
        }
    }

    public T get(int index){
        if(index >= 0 && index < capacity){
            return (T) myArray[index];
        }
        else throw  new ArrayIndexOutOfBoundsException("Index out of bound: " + index);
    }

    public int size(){
        return idx;
    }

    public int capacity(){
        return capacity;
    }

    private void resetCap(){
        capacity += capacity/2;
        Object[] oldArray = myArray.clone();
        int oldSize = oldArray.length;
        myArray = new Object[capacity];
        for(int i = 0; i < oldSize; i++){
            myArray[i] = oldArray[i];
        }
    }

    @Override
    public String toString(){
        if(myArray == null || myArray.length == 0){
            return "[]";
        }
        else{
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for(int i = 0; i < idx; i++){
                sb.append(myArray[i]);
                if(i != idx - 1){
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
