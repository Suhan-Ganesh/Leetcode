import java.util.Scanner; 

class reverse {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int rev = 0,n;
        while(x != 0){
            n = x % 10;
            x /= 10; 
            if( rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10) && n > 7){
                System.out.println("Overflow");
                return; 
            }
            
            if( rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10) && n < -8){
                System.out.println("Overflow");
                return;
            }
            
            rev = rev *10 + n; 
        }
        System.out.println("The reversed string : "+rev);
    }
}