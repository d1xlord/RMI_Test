import java.rmi.Naming;
import java.util.Scanner;

/**
 * Created by nafis on 2/23/15.
 */
public class RMIClient {
    public static void  main(String args[]) throws Exception{
        String host = "192.168.104.64:1099";
        TestService test = (TestService) Naming.lookup("//" + host + "/RmiServer");
//        TestService2 test2 = (TestService2) Naming.lookup("//" + host + "/RmiServer2");
        System.out.println("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        System.out.println("Square of this is : " + test.getSquare(val));

//        String str = scan.nextLine();
//        System.out.println(test2.getString("Nafis"));
    }
}
