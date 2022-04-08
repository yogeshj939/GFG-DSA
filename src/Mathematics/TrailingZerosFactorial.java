package Mathematics;

import java.util.Scanner;

/**
 * TrailingZerosFactorial
 */
class TrailingZerosFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scan.nextInt();
        System.out.println(trailingZeroes(n));
        scan.close();
    }

    public static int trailingZeroes(int n){
        int zeroCount = 0;
        for(int i = 5; i <= n; i = i*5){
            zeroCount+= (n/i);
        }
        return zeroCount;
    }
}