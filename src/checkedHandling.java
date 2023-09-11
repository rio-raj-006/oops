import java.io.*;
import java.util.Scanner;

public class checkedHandling {
    public static void main(String[] args){
        try{
//            BufferedReader ob =new BufferedReader(new FileReader("raj.txt"));
            File f=new File("C:\\Users\\rajkumar.selvaraj\\IdeaProjects\\untitled\\src\\raj.txt");
            Scanner ob=new Scanner(f);
             String line= ob.nextLine();
            while (ob.hasNextLine()) {
                System.out.println(line);
                line = ob.nextLine();
            }
            }
        catch (java.lang.Exception e){
            if(! (e instanceof RuntimeException)) {
                System.out.println("It is checked ");
            }
            else {
                System.out.println("it is unchecked");
            }
        }
        finally {
            System.out.println("end");
        }
        }
    }
