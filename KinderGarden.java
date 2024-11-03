import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] students= {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};

        Map<Character, String> map= new HashMap<>();

        map.put('C',"Clover");
        map.put('G',"Grass");
        map.put('R',"Radish");
        map.put('V',"Violet");

        Scanner sc= new Scanner(System.in);

        String r1= "VRCGVVRVCGGCCGVRGCVCGCGV";
        String r2= "VRCCCGCRRGVCGCRVVCVGCGCV";

        r1=sc.nextLine();
        r2=sc.nextLine();
        r1=r1.toUpperCase();
        r2=r2.toUpperCase();


        boolean f= true;
        do{
            System.out.println("Row 1: "+r1);
            System.out.println("Row 2: "+r2);

            for(int i=0;i<students.length;i++)
            {
                System.out.println(i+1+": "+students[i]);
            }
            System.out.println("Enter the relevant number to view his/her plants:");
            int n= sc.nextInt();

            System.out.println("Plants of "+students[n-1]+" are:");
            System.out.println(map.get(r1.charAt(2*(n-1)))+", "+map.get(r1.charAt(2*(n-1)+1))+", "+map.get(r2.charAt(2*(n-1)))+", "+map.get(r2.charAt(2*(n-1)+1)));

            System.out.println("press 'y' to continue or any other char to exit: ");
            char e= sc.next().charAt(0);

            f= e=='y'||e=='Y';
        }while(f);
    }
}