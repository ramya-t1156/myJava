// Java program to find the factorial of the given number using Recursion
import java.util.*;
public class Fact {
    public static double factFind(double n){
        if(n<=0){
            return 1;
        }
        return factFind(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        double num = scn.nextDouble();
        double ans = factFind(num);
        System.out.println("Factorial of "+num+" is " +ans);
    }
}
