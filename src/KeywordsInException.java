public class KeywordsInException {
    public static void main(String[] args){
        try {
            numcheck();
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("end");
        }
    }
    static void numcheck() throws ArithmeticException{
        int a=5;
        if(a<10){
            throw new ArithmeticException("the number is less than 10");
        }
    }
}