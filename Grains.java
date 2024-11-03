import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BigInteger c = new BigInteger("1");

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the box number: ");
        int n= sc.nextInt();
        BigInteger ch = new BigInteger("1");
        ch=ch.shiftLeft(64);
        ch=ch.subtract(BigInteger.ONE);
//        for(int i= 0;i<64;i++)
//            ch=ch.or(c.shiftLeft(i));

        System.out.println("Total number of grains is "+ch);
        System.out.println("Number of grains in the box number "+n+" is "+c.shiftLeft(n-1));
    }
}