public class GenericConcept {
    public static void main(String[] args) {
        Box ob = new Box(true);
        System.out.println(ob.getContent());
    }
}
    class Box<T> {
        private T content;

        public Box(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }
    }
