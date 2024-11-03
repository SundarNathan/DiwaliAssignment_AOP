import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        enum e {black , brown, red, orange, yellow, green, blue, violet, grey, white};

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value color band: ");
        String[] s= sc.nextLine().split(" ");

        System.out.print(e.valueOf(s[0].toLowerCase()).ordinal()+""+e.valueOf(s[1].toLowerCase()).ordinal());

        if(s.length>2)
        {
            switch(s[2].toLowerCase())
            {
                case "brown": System.out.print(" deci"); break;
                case "red": System.out.print(" centi"); break;
                case "green": System.out.print("0");
                case "yellow": System.out.print("0");
                case "orange": System.out.print(" kilo"); break;
                case "grey": System.out.print("0");
                case "violet": System.out.print("0");
                case "blue": System.out.print(" mega"); break;
                case "white": System.out.print(" giga"); break;
            }
        }

        System.out.print("ohms");
    }
}