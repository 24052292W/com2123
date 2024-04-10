import java.util.Scanner;
public class CompoundCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // A = p(1 + i)^n
        System.out.println("Enter the principal amount:");
        int principal = input.nextInt();

        System.out.println("Enter the interest rate:");
        int interest = input.nextInt();

        System.out.println("Enter the period:");
        int period = input.nextInt();

        int amount = (principal*(1 + interest)^(period));
        System.out.println("The final amount in "+ period +"is " + amount );
    }
}
