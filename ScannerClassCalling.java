package org.example;
import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;

public class ScannerClassCalling
{

public static int scannerInteger(int n1)
{
    Scanner sc = new Scanner(System.in);
    int n2 = sc.nextInt();
    return n2;
}

    public static char scannerCharacter(char c1)
    {
        Scanner sc = new Scanner(System.in);
        char c2 = sc.next().charAt(0);
        return c2;
    }


}


