package Evaluasi;
import java.util.Scanner;
public class ArithmeticException {
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the value for c");
	int c = console.nextInt();
        try{
        int res=c/0;
        System.out.println(" The result is "+res);
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }
    ArithmeticException(String not_Eligible_for_voting) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}