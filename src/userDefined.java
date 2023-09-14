public class userDefined {
    public static void main(String[] args){
        int a=1;
        try{
            trynumber(a);
            System.out.println("the number is above 18");
        }
        catch (newCustomException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    public static void trynumber(int a)throws newCustomException {
        if (a<18){
            throw new newCustomException("the number is below 18");
        }
    }
}
class newCustomException extends java.lang.Exception {
    public newCustomException(){
        super();
    }
    public newCustomException(String a){
        super(a);
    }
}
