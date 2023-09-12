public class userDefined {
    public static void main(String[] args){
        int a=1;
        try{
            trynumber(a);
            System.out.println("the number is above 18");
        }
        catch (CustomException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    public static void trynumber(int a)throws CustomException{
        if (a<18){
            throw new CustomException("the number is below 18");
        }
    }
}
class CustomException extends java.lang.Exception {
    public CustomException(){
        super();
    }
    public CustomException(String a){
        super(a);
    }
}
