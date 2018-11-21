package funcfibonacci;
import java.util.Scanner;
public class FuncFibonacci {
    public int getFibbonancci (int a, int b){
        int angka = 0;
        angka = a + b;
        return angka;
    }
    public void buatFibonacci ( int c){
        FuncFibonacci fibo = new FuncFibonacci();
        int a=0;
        int b=1;
        int holdValue=0;
        
        System.out.print(" Angka Fibonacci dari " 
                + c + " = " + a +", " +b);
        for (int i = 0; i < (c-2); i++) {
            if (i > 1){
                holdValue= a + b;
            if (holdValue <= c) {
                holdValue=fibo.getFibbonancci(a, b);
                System.out.print(", "+holdValue);
                a=b;
                b=holdValue; 
                
            }else {
                holdValue = 0 + i;
                System.out.println(", "+holdValue);
                }
            }           
        } 
        System.out.print(" ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FuncFibonacci fibo = new FuncFibonacci();
        System.out.print(" Masukkan Batas Angka : ");
        int c = input.nextInt();
        fibo.buatFibonacci(c);
    }
}
