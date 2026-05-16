package conditional;
import java.util.*;
public class passwardCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the passward");
        String passward=sc.nextLine();
        if(passward.length()<8)
        {
            System.out.println("Invallid passward");
        }
        else
        {
            System.out.println("Valid passward");
        }
    }
}
