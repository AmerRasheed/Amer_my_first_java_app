package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 *
 * Calculator Assignment
 *
 **/
public class App {

    public static int enterNum1() {
        System.out.println("\nEnter number 1");
        int enternum=0;
        int value = ScannerClassCalling.scannerInteger(enternum);
        return value;
    }

public static int enterNum2()
    {
      System.out.println("Enter number 2 ");
        int enternum=0;
        int value = ScannerClassCalling.scannerInteger(enternum);
        return value;
    }

public static int addNum(int a, int b)
    {
        /*
        int number1 = 10;
                //enterNum1();
        int number2= 9;
                //enterNum2();
        int resultadd = number1 + number2;*/
        return a+b;
        //System.out.println("The result is " + resultadd);
    }

public static int mulNum(int a, int b)
    {
       /* int number1 = enterNum1();
        int number2 = enterNum2();
        int resultmul = number1 * number2;
        System.out.println("The result is " + resultmul);
                      */
       return a*b;
    }

public static int subNum(int a, int b)
    {
        /*
     int number1 =enterNum1();
     int number2= enterNum2();
     int resultsub = number1 - number2;
     System.out.println("The result is " + resultsub);
    */
        return a-b;
    }

public static int divNum(int a, int b)
   {
     /*int number1 =enterNum1();
     int number2= enterNum2();
     int resultdiv = number1 / number2;
     System.out.println("The result is " + resultdiv);
    */ return a/b;}

public static char callMenu()
    {
     System.out.println("Enter the functions : The options are \n");
     System.out.println("Addition            +  \n");
     System.out.println("Multiplication      *\n");
     System.out.println("Subtraction         -  \n");
     System.out.println("Division            /  \n");
     System.out.println("Enter the calculator operation ");
     char s1 =' ';
     char cvalue = ScannerClassCalling.scannerCharacter(s1);
    System.out.println("you entered " + cvalue + " operation");
     return cvalue;
    }

 public static void main(String[] args) {
        System.out.println("Calculator Assignment work");
        boolean running = true;
        while(running) {
            System.out.println("Press y to repeat the operation and n to exit\n");
            char s2=' ', s;
            char input = ScannerClassCalling.scannerCharacter(s2);
            System.out.print("you entered the selection " + input);
          if (input=='n')
                running=false;
          else {switch (input) {
            case 'y': s=callMenu();
                        {switch (s) {
                            case '+': addNum(enterNum1(),enterNum2());
                            break;
                            case '*': mulNum(enterNum1(),enterNum2());
                            break;
                            case '-': subNum(enterNum1(),enterNum2());
                            break;
                            case '/': divNum(enterNum1(),enterNum2());
                             break;
                             default:
                                System.out.println("You entered wrong value");
                           } //switch statement operation selection
                           }// while loop bracket
                           break;
            case 'n': {
                        running = false;
                        System.out.println("You exit the loop");
                        break;
                    }
            default: System.out.println("You have made a wrong input. Try + * / - instead ");
                } //switch statement EXIT operation
            }//if running walee
        }//While EXIT operation
    } //Main method
}//Public class App
