public class Markerinterfacetopics implements c{
    public static void main(String[] args){
        int num=0;
        if(new Markerinterfacetopics() instanceof c){
            System.out.println(num);
        }
        new no().print();
    }
}
class no{
    int num=9;
    public void print(){
        if(new no() instanceof c){
            System.out.println(num);
        }
        else {
            System.out.println("sorry it is not an sub-class of c");
        }
    }
}
interface c{

}
