package practicingTryCatch;

import java.net.SocketOption;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Hello");
            System.out.println(x/y);

        }
        catch(ArithmeticException exception){
            System.out.println("Value is zero");
        }
        
    }
}
