import java.util.Scanner;

class primeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.prime(num));
    }
}
// what if num == 0
class Solution{
    public boolean  prime(int n){
        for (int i = 2; i < n/2; i++) {
            if(n%i  == 0)
                return false;
        }
        return true;
    }
}