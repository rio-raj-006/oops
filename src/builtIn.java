public class builtIn {
    public static void main(String[] args) {
        try{
            int a=9/0;      // this line throw and arithmetic(Un-checked) exception, because of division by zero.
        }
        catch (ArithmeticException e){             //this catch-block catches the arithmetic exception
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
