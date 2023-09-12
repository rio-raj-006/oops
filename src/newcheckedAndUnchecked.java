import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class newcheckedAndUnchecked {
    public static void main(String[] args) {
        try {
            checkedException();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        try {
            UncheckedException();
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void checkedException() throws FileNotFoundException {
//            BufferedReader ob =new BufferedReader(new FileReader("raj.txt"));
            File f = new File("C:\\Users\\rajkumar.selvaraj\\IdeaProjects\\untitled\\src\\raj.txt");
            Scanner ob = new Scanner(f);
            String line = ob.nextLine();
            while (ob.hasNextLine()) {
                System.out.println(line);
                line = ob.nextLine();
            }
    }

    public static void UncheckedException() {
        int a=9/0;
    }
}
