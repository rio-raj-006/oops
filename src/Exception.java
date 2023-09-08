public class Exception {
    public static void main(String[] args) {
        int n=10;
      try{                          //try block
          int a=8/0;           // statement
      }                 // here this exception is unchecked exception or run-time exception
      catch (ArithmeticException e){       // catch block which catch the arithmeticexception
          e.printStackTrace();                 // printstacktrace method used to shoe the line of exception or errors happened
          System.out.println(e);
      }
        System.out.println("exception handled");      // after the catch block executed the next statement got executed
        System.out.println(n);
    }
}
