import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("using try and catch in java" );
        Scanner sc= new Scanner(System.in);
        Division div= new Division(sc.nextInt());
        System.out.println( div.divid(sc.nextInt()));

    }
}
