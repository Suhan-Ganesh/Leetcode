import java.util.Scanner;

class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Armstrong number: ");
        int num = sc.nextInt();
        int len = (int)Math.log10(num)+1;
        int sum = 0;
        int dum = num;

        for(int i=len;i>0;i--){
            int n = dum%10;
            sum = (int)Math.pow(n,len)+sum;
            dum/=10;
        }

        if(sum == num) 
        System.out.println("Armstrong number");
        else 
        System.out.println("Not a armstrong number");
    }
}