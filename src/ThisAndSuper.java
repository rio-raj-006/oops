public class ThisAndSuper {
    public static void main(String[] args){
        bharani obj=new bharani();
        obj.print();
    }
}
class hemo{           // parent class or super class
    int n=0;  // instatnces variable of this class
    public void write(){
        System.out.println("writing");
    }
}
class bharani extends hemo{      // child class because it extends to the hemo class
    int n=9;       // instantce variable of this class
    public void print(){
        System.out.println(n);         // if I simply call 'n' then it will return the instantce variable of this class
        System.out.println(this.n);   // here I used the "this" keyword, so it will refer to the instatnce variable of this class
        System.out.println(super.n);   // here I used the "super" keyword, so it will refer to the instantce variable of the super class.
        super.write();                // same for method
    }
}
