import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the cage sum:");
        int cageSum=sc.nextInt();
        System.out.print("Enter the cage length:");
        int cageLength=sc.nextInt();

        Set<Integer> set= new HashSet<>();

        System.out.print("Number of the numbers to be excluded:");
        int ex= sc.nextInt();

        if(ex>0)
            System.out.println("Enter the numbers to be excluded:");

        for(int i=0;i<ex;i++)
        {
            set.add(sc.nextInt());
        }

        List<List<Integer>> l= new ArrayList<>();
        bt(cageSum, cageLength, set, new ArrayList(), l, 1);

        System.out.println("The cage set are:");
        for(List<Integer> cl: l)
        {
            System.out.println(cl.toString());
        }
    }

    static void bt( int cs, int cl, Set<Integer> s, List<Integer> li, List<List<Integer>> l, int st)
    {
        if(cl==0&&cs==0)
        {

            l.add(new ArrayList<>(li));
            return;
        }
        if(cs<=0||cl<=0)
            return;

        for(int i=st;i<=9;i++)
        {
            if(s.add(i))
            {
                li.add(i);
                bt(cs - i, cl - 1, s, li, l,i+1);
                li.remove(Integer.valueOf(i));
                s.remove(i);
            }


        }
    }
}