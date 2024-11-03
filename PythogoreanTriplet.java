import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the sum of the Pythogorea Triplet:");
        int n=sc.nextInt();

        List<List<Integer>> l= new ArrayList<>();
        bt(n, l, new ArrayList<>(), 0, 1);

        System.out.println("Pythogorean Triplets for the give input are:");
        for(List<Integer>li: l)
            System.out.println(li.toString());
    }

    static void bt(int n, List<List<Integer>> l,List<Integer> li, int s, int idx )
    {
//        if(li.size()==2)
//        {
//            int ab=li.get(0)* li.get(0)+ li.get(1)* li.get(1);
//            int c= (int)Math.sqrt(ab);
//            if(c*c==ab&&li.get(0)+li.get(1)+c==n) {
//                li.add(c);
//                l.add(new ArrayList<>(li));
//                li.remove(Integer.valueOf(c));
//            }
//            return;
//        }

        if(li.size()==3&& s==n)
        {
            if(li.get(2)* li.get(2)== li.get(0)* li.get(0)+ li.get(1)* li.get(1))
                l.add(new ArrayList<>(li));
            return;
        }
        if(s>=n||li.size()>=3)
            return;
        for(int i=idx;i<n;i++)
        {
            li.add(i);

            bt(n, l, li, s+i, i+1);
            li.remove(Integer.valueOf(i));
        }
    }
}