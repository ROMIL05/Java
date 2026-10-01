public class TryWithResource {
    static class Resource implements AutoCloseable {
        private final String name;
        Resource(String name) { this.name = name; }

        @Override
        public void close() {
            System.out.println("Closing " + name);
        }
    }

    public static void main(String[] args) {
        try (Resource r1 = new Resource("R1");
             Resource r2 = new Resource("R2")) {
            System.out.println("Inside Try");
        }
    }
}