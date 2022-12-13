package hatırlatmalar01;

import java.util.Scanner;

public class fibonacci {
// 1 1 2 3 5 8 13 ...
    static int fibonacci(int x){
        if (x == 1 || x == 2)
            return  1;

        return fibonacci(x-1) + fibonacci(x-2);
    }

    public static void main(String[] args){

    System.out.println(fibonacci(8));

    }
}
