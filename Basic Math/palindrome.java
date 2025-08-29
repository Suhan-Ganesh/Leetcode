import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0; 
        int n = num;
        while (n != 0){
            int last = n%10; 
            rev = rev*10+last; 
            n /= 10;
        }
        if(num == rev && rev >= 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

