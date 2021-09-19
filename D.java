import java.util.Scanner;

public class D{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("masing-masing "+ a / b);
        System.out.println("bersisa "+ a % b);
    }
}