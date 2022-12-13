package hatırlatmalar01;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float x, y, result = 0;
        int a;

        System.out.println("Num:");
        x = input.nextFloat();
        System.out.println("Num:");
        y = input.nextFloat();

        System.out.println("1-> add, 2-> minus, 3-> mult, 4-> devide");
        a = input.nextInt();
        if (a == 1){
            result = x + y ;
            System.out.println("Result" + result);
        }else if (a == 2){
            result = x - y;
            System.out.println("Result" + result);
        }else if (a == 3){
            result = x * y;
            System.out.println("Result" + result);
        }else if (a == 4){
            result = x / y ;
            System.out.println("Result" + result);
        }else
            System.out.println("Please, enter the right number!!!");
    }

}
