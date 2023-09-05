public class METHOD {
    static int a;
    public METHOD(){
        System.out.println("hi");
    }
    public METHOD(int a){
        this.a=a;
    }
    public static void main(String[] args){
        System.out.println("Hi");
        METHOD obj=new METHOD();
        new METHOD(8);
        System.out.println(a);
    }
}
