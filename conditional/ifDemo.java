package conditional;
import java.util.*;
public class ifDemo {
    public static void main(String args[])
    {
    int num;
    System.out.println("Enter the number::");
    Scanner s = new Scanner(System.in);
    num= s.nextInt();

    if(num>0)
    {
        System.out.println("number is posetive ");
    }
    else if(num<0)
    {
        System.out.println("number is negative");
    }
    else 
    {
        System.out.println("number is zero");
    }
}
}
