import java.util.*;
import java.util.Scanner;
class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int diff = b-a;
        int mul = a*b;
        System.out.println("Sum = "+sum);
        System.out.println("Diff = "+diff);
        System.out.println("Mul = "+mul);
    }
}