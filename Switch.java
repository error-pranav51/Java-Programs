import java.io.*;
import java.util.Scanner;
class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number :- ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1: 
            System.out.println("its sunday");
            break;
            case 2:
            System.out.println("its monday");
            break;
            case 3:
            System.out.println("its tuesday");
            break;
            case 4:
            System.out.println("its wednesday");
            break;
            case 5:
            System.out.println("its thursday");
            break;
            case 6:
            System.out.println("its friday");
            break;
            case 7:
            System.out.println("its saturday");
            break;
            default:
            System.out.println("wrong choice");
            System.exit(0);
        }
    }
}
