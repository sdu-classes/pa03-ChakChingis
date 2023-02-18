import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();

    Calculator c = new Calculator(n , m );
    try{
        c.add();
        c.sub();
        c.multi();
        c.div();
    }
    catch(ArithmeticException ex){
        System.out.println(ex.getMessage());
    }
}
}
