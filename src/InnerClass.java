public class InnerClass {
    public static void main(String[] args) {
        outer obj = new outer();
        System.out.println(obj.get());
        outer.Inner obj1=new outer().new Inner();
        System.out.println(obj1.getH());
    }
}
class outer{
    public void print(){
        Inner obj1=new Inner();
        System.out.println(obj1.h);
    }
    public int get() {
        Inner obj1=new Inner();
        return obj1.h;
    }
    class Inner {
        private int h = 0;
        public int getH(){
            return h;
        }
        //System.out.println(obj.get());
    }
}
/*class sample {
    public void print(){
//        System.out.println(h);

    }
    class Inner {
        private int h = 0;

        public int get() {
            return h;
        }
    }
}*/