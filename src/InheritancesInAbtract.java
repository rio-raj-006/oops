public class InheritancesInAbtract {
    public static void main(String[] args){
        System.out.println("Man");
        he obj=new he();
        obj.speak();
        obj.run();
        obj.breathin();
        obj.breathout();
        System.out.println("Female");
        she obj1=new she();
        obj1.run();
        obj1.speak();
        obj1.breathin();
        obj1.breathout();
        System.out.println("Plants");
        plants plant=new plants();
        plant.breathin();
        System.out.println("Socratea exorrhiza ");
        Socrateaexorrhiza wp=new Socrateaexorrhiza();
        wp.newwalk();
        wp.breathin();wp.breathout();
    }
}
abstract class human implements livingbeing {        // abstract class which implements interface
    abstract void speak();       // abstract method of this abstract class
    public void run(){       //Non-abstract method or concrete method of this abstract class
        System.out.println("human can run");
    }                //Even though this abstract class implements the interface, here it did not override the
}                    // abstract methods of the interface. BUT, THE SUBCLASS OF THIS ABSTRACT CLASS DOES IT.

class he extends human {           // this is normal class which extends the abstract class
    @Override
    void speak() {                    // this is the method which overrides of
        System.out.println("he is speaking");  //its parent abstract class(human class).
    }

    @Override
    public void breathin() {              // this is the method which overrides of
        System.out.println("he breathin oxygen");    //which overrides the abstract methods of its grand-parent (Interface)
    }

    @Override
    public void breathout() {          // this is the method which overrides of
        System.out.println("he breathout carbon-dioxide");//which overrides the
    }                          //abstract methods of its grand-parent (Interface)
}
class she extends human{   // this is second normal class which extends the abstract class
    @Override
    void speak() {           // this is the method which overrides of
        System.out.println("She is speaking"); //its parent abstract class(human class).
    }

    @Override
    public void breathout() {
        System.out.println("she breathout carbon-dioxide");
    }

    @Override
    public void breathin() {
        System.out.println("she breathin oxygen");
    }
}
class plants implements livingbeing {         // normal class which implements the interface
    @Override
    public void breathout() {     //When a normal class implements an Interface, It should definitely override the
        System.out.println("plants breath-out oxygen");  // abstract method of the interface class
    }

    @Override
    public void breathin() {            //This is also another abstract method of interface. So, it got override
        System.out.println("plants breath-in Co2");
    }
}
class Socrateaexorrhiza  extends plants {      //This is another class which extends the previous class
    public void newwalk(){             //This is also refered as the grant-child class of the interface
        System.out.println("Socratea exorrhiza can walk");
    }
//    @Override
//    public void read() {
//        System.out.println("s");
//    }
//
//    @Override
//    public void write() {
//        System.out.println("d");
//    }
}
interface livingbeing {   //Interface
    public void breathin();   //Every method in interface will be abstract method
    public void breathout();
}
