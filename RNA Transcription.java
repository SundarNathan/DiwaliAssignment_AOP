import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the DNA Sequence: ");
        String s= new Scanner(System.in).nextLine();

        StringBuilder sb= new StringBuilder();
        s=s.toUpperCase();

        for(char c: s.toCharArray())
        {
            switch (c)
            {
                case 'A':sb.append('U');break;
                case 'T':sb.append('A');break;
                case 'C':sb.append('G');break;
                case 'G':sb.append('C');break;
            }
        }

        System.out.println("RNA complement of "+s+" is "+sb);
    }
}