import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int n= new Scanner(System.in).nextInt();

        if(n%3!=0&&n%5!=0&&n%7!=0)
            System.out.println(n);
        else {
            if (n % 3 == 0)
                System.out.print("Pling");
            if (n % 5 == 0)
                System.out.print("Plang");
            if (n % 7 == 0)
                System.out.print("Plong");
        }
    }
}