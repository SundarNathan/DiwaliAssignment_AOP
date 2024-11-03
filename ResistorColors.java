public class Main {
    public static void main(String[] args) {

        enum e {Black , Brown, Red, Orange, Yellow, Green, Blue, Violet, Grey, White};

        for(int i=0;i<10;i++)
            System.out.println(e.values()[i]+": "+i);
    }
}