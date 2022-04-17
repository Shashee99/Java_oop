import java.util.Scanner;

public class excephandling {
    static int a ;
    static int b ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 01 : ");
        a= sc.nextInt()
        ;
        System.out.print("Enter number 02 : ");
        b= sc.nextInt();
        try{
            int c = a/b;
            System.out.println("Answer is "+ c);
            // Exception r= new Exception();
            // System.out.println(r.toString());

        }
        catch(Exception e){
            System.out.println("Cannot div by zero ");
            System.out.println(e.toString());


        }
        
    }
    
    
}
