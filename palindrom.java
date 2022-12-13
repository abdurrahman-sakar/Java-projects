package hatırlatmalar01;

import java.util.Scanner;

public class palindrom {
// 12344321

    static boolean palindromm(int input){
        int tmp, newPalNumber = 0,  number;
         tmp = input;

     while (tmp != 0) {
        number = tmp % 10;   // take a last digit of the input
        newPalNumber = newPalNumber * 10 + number;
        tmp = tmp / 10;      // take other digits of input
        }
     if (input == newPalNumber)
         return true;
     else
         return false;
}

    static boolean palindromStr(String word){
        String temp = "";
        for (int i = word.length() - 1; i >= 0; i--){
            temp +=  word.charAt(i);
        }
        System.out.println(temp);  // word is abax, temp should be xaba

        if (temp.equals(word))
            return true;
        else
            return false;
    }

    public static void main(String[] args){

        System.out.println(palindromm(1221));
        System.out.println(palindromStr("abax"));
    }
}
