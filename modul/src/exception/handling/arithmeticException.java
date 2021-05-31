package exception.handling;
import java.util.Scanner;
public class arithmeticException {
    public static void main(String[] args) {
        //int a=100;
    //     System.out.println("Enter the value for b");
         Scanner console = new Scanner(System.in);
    // int b = console.nextInt();
     
        System.out.println("Enter the value for c");

    // Exception Handling
    int c = console.nextInt();
    try{
      int res=c/0;
        System.out.println(" The result is "+res);
    } catch (Exception e) {
            System.out.println(e);
    }
 }
}
