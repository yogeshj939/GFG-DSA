package Mathematics;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and n : ");
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(x, n));

    }

    public static int power(int x,int n) {
        if(n == 0) return 1;
        int temp = power(x,n/2);
        temp = temp*temp;
        if(n%2==0)
            return temp;
        else
            return temp*x;
    }

    public static int iterativePower(int x,int n) {
        int res = 1;
        while(n>0){
            if(n%2 != 0)
                res = res * x;
            n = n/2;
            x = x*x;
        }
        return res;
    }

    
    
}
