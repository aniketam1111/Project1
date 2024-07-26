import java.util.*;
public class Conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a>b) {
        //     System.out.println(a+" is greater than b ");
        // }
        // else if (b>a) {
        //     System.out.println(b+" is greater than a ");
        // }
        // else {
        //     System.out.println("A is equal to b");
        // }
        int choice = sc.nextInt();
        switch (choice) {
            case 1: 
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Enter correct choice");
                break;
        }
    }
}
