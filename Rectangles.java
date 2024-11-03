import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        List<String> ip= new ArrayList<>();

        System.out.println("Enter the rectangles, (enter a blank line to break):");

        while(true)
        {
            String s=sc.nextLine();
            if(s.isEmpty())
            {
                break;
            }
            ip.add(s);
        }

        List<int[]> pl= new ArrayList<>();

        for(int i=0;i<ip.size();i++)
        {
            for(int j=0;j<ip.get(i).length();j++)
            {
                if(ip.get(i).charAt(j)=='+')
                    pl.add(new int[] {i,j});
            }
        }

        int rc=0;

        for(int i=0;i<pl.size();i++)
        {
            int r1=pl.get(i)[0];
            int c1=pl.get(i)[1];

            for(int j=i+1;j<pl.size();j++)
            {
                int r2= pl.get(j)[0];
                int c2= pl.get(j)[1];


                if(r1<r2&&c1<c2&&hl(ip, r1, c1, c2)&&hl(ip, r2, c1, c2)&&vl(ip, c1, r1, r2)&&vl(ip, c2, r1,r2))
                    rc++;
            }
        }

        System.out.println(rc+ " rectangles are there.");

    }

    static boolean hl(List<String> ip, int r1, int c1, int c2)
    {
        for(int i=c1+1;i<c2;i++)
        {
            if((ip.get(r1).charAt(i)!='-'&&ip.get(r1).charAt(i)!='+'))
                return false;
        }
        return true;
    }

    static boolean vl(List<String> ip, int c1, int r1, int r2)
    {
        for(int i=r1+1;i<r2;i++)
        {
            if((ip.get(i).charAt(c1)!='|'&&ip.get(i).charAt(c1)!='+'))
                return false;
        }
        return true;
    }
}
/*
   +--+
  ++  |
+-++--+
|  |  |
+--+--+
|  |  |
+--+--+
 */