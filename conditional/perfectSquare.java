package conditional;
import java.util.*;
public class perfectSquare {
    public static void main(String[] args) {
        System.out.println("enter the number::");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a==1)
        {
            System.out.println("true");
        }
        else
        {
        boolean  flag=false;
        for(int i=0;i<a;i++)
        {
            if(i*i==a)
            {
                flag=true;
                break;
            }
            
        }
        if(flag==true)
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }

    }
}
}
