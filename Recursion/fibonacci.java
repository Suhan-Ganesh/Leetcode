import java.util.Scanner;

class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Solution sol = new Solution();
        int fib = sol.fib(num);
        System.out.println("Fibonacci number of "+num+" is "+fib);
    }
}

class Solution{
    public int fib(int n) {
        if(n < 2) 
            return n;
        else 
            return fib(n-1)+fib(n-2);
    }
}

// Without recursion
//class Solution{
//     public int fib(int n) {
//         if(n == 0) return 0;
//         if(n == 1) return 1;
//         int fib0 = 0;
//         int fib1 = 1;
//         int fib2 = 0;
//         for (int i = n;i >= 2;i--){
//             fib2 = fib0+fib1;
//             fib0=fib1;
//             fib1=fib2;
//         }
//         return fib2;
//     }
// }