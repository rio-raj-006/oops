import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String day=s.next();
        if(a>10){                     // if-else statement
            System.out.println("The number is greater than 10");
        }
        else{
            System.out.println("The number is less than 10");
        }
        switch (day){                //switch-case statement
            case "monday" :
                System.out.println("The day is monday");
                break;
            case "tuesday":
                System.out.println("The day is tuesday");
                break;
            case "wednesday":
                System.out.println("The day is wednesday");
                break;
            case "thursday":
                System.out.println("The day is thursday");
                break;
            case "friday":
                System.out.println("The day is friday");
                break;
            case "saturday":
                System.out.println("The day is saturday");
                break;
            case "sunday":
                System.out.println("The day is sunday");
                break;
        }
    }
}
