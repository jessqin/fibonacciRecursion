package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Please enter the number you would like to check");
        Scanner sc = new Scanner(System.in);
        int fibNum = sc.nextInt();

        double check = ((5* (Math.pow(fibNum,2))) + 4);
        double check2 = ((5* (Math.pow(fibNum,2))) - 4);
        if ((Math.sqrt(check)) == (int)(Math.sqrt(check)) || ((Math.sqrt(check2)) == (int)(Math.sqrt(check2))))
        {
            System.out.print(fibNum + " is a Fibonacci number. Here are the numbers leading up to it: ");
            for (int i = 0; i <= fibNum; i++)
            {
                System.out.print(Fibonacci(i) + " ");
            }
        }
        else
        {
            System.out.println("This number is not a Fibonacci number");
        }


    }
    public static int Fibonacci(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        else if (num == 1)
        {
            return 1;
        }
        else
        {
            return (Fibonacci(num - 1) + Fibonacci(num - 2));

        }

    }
}
