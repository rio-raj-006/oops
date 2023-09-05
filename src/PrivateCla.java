public class PrivateCla {
    public static void main(String[] args){
        InnerClass obj=new PrivateCla().new InnerClass();
        System.out.println(obj.h);
    }
    class InnerClass{
        private  int h=6;
    }
}
