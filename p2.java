public class p2 {
    public static void main(String args[])
    {
        System.out.println("Number divisible by 5 not by 10");
        for(int i=1;i<= 100;i++)
            if(i%5==0 && i%10 != 0)
                System.out.println(i);
    }
}