import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        enum e {black , brown, red, orange, yellow, green, blue, violet, grey, white};

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value color band: ");
        String[] s= sc.nextLine().split(" ");

        System.out.println(e.valueOf(s[0].toLowerCase()).ordinal()+""+e.valueOf(s[1].toLowerCase()).ordinal());
    }
}