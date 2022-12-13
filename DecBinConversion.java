package hatırlatmalar02;

import java.util.Scanner;

public class DecBinConversion {
    // Decimal % Binary Conversion
    public static void toBinary(int t){
        int[] binary = new int[1000];

        int i = 0;
        while (t > 0){
            binary[i] = t % 2;    //calculate mode for given number again an again until t = 0
            t = t / 2;
            i++;
        }

        for (int j = i-1; j>=0; j--){
            System.out.print(binary[j]);  //print binary conversion
        }
    }

    public static int toDecimal(String x){
        int[] decimal = new int[1000];

        int length = x.length();
        int base = 1;
        int dec_val = 0;

        for (int i = length-1; i>=0; i--){
            if (x.charAt(i) >= '0'&& x.charAt(i) <= '9'){
                dec_val += (x.charAt(i) - 48) * base;
                base = base * 2;
            }
        }
        return dec_val;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t, number;
        String x;
        System.out.println("Please, make your choose the operation!");
        System.out.println(" 1 : Decimal to Binary,  2 : Binary to Decimal");
        number = scan.nextInt();

        if (number == 1){
            System.out.println("Enter Decimal Number.");
            t = scan.nextInt();
            System.out.println("Number of Binary is :");
            toBinary(t);
        }else if (number == 2){
            System.out.println("Enter Binary Number.");
            x = scan.next();
            System.out.println("Number of Decimal is :" + toDecimal(x));
        }else
            System.out.println("Please, enter the right operation!!!");
    }
}
