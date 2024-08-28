//Java program to find whether the given number is odd number or even number
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = scn.nextInt();
        if(n==0){
            System.out.println("zero");
        }
        else if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
