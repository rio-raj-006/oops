import java.util.Scanner;

class Maain{
public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the length :");
        int l=s1.nextInt();
        System.out.println("Enter the breadth");
        int b=s1.nextInt();
        Area_ obj=new Area_();
        obj.setDim(l,b);
    System.out.println(obj.getArea());
        }
        }
class Area_ {
    private int length ;
    private int breadth;
    public void setDim(int a,int b){
        length=a;
        breadth=b;
    }
    public int getArea(){
        return length*breadth;
    }
}
