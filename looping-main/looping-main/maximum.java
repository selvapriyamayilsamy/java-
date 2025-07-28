import java.util.*;
public class Main {
    public static void main (String[]args)
    {
        Scanner s = new Scanner (System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int max = n1;

        if(max<n2)
            max = n2;
        if (max<n3)
            max = n3;
        else
            max = n1;

        System.out.println(max);
        }
    }