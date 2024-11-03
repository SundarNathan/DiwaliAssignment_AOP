public class Main {
    public static void main(String[] args) {

        String[] s={"no", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        for(int i=10;i>0;i--)
        {
            System.out.println( s[i]+" green bottles hanging on the wall,\n" +
                    s[i]+" green bottles hanging on the wall,\n" +
                    "And if one green bottle should accidentally fall,\n" +
                    "There'll be "+s[i-1].toLowerCase()+" green bottles hanging on the wall.\n");
        }

    }
}