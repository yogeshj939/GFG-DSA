package Mathematics;

import java.util.Scanner;

public class AllDivisors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        findAllDivisors(n);
        scanner.close();
    }

    public static void findAllDivisors(int n) {
        int i;
        for(i = 1; i*i <=n; i++){
            if(n%i == 0)
                System.out.print(i+", ");
        }
        for(;i>0;i--){
            if(n%i == 0)
                System.out.print((n/i)+", ");
        }
    }
    
}
