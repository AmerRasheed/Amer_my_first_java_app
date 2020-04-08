package org.example;

import com.sun.org.apache.xpath.internal.objects.XString;
import javafx.beans.binding.Bindings;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Exercise
{

        public static void main(String[] args) {
            byte b=127;
            //String s=-320;
            long l=899;
            float f=6.8f;
            double d=23.5;
            char c='w';
            char c1='W';

       //     boolean isEqual = number1 == number2;
            int i=1;

            System.out.println("Hello World on 7th April for doing my exercises");
/*
            class Person {
                String firstName;
                String lastName;
                int age;
                String hobby;

                public String getInformation() {
                    return firstName + " " + lastName + " is " + age + " years old and likes " + hobby;
                }

            }
            Person Habib = new Person();
            Habib.firstName ="gjgjhgjgjj";

            Habib.lastName  = "gjgjhgjgjj";
            Habib.age =9;
            Habib.hobby= "gggggggggggg";


            System.out.println(Habib.firstName);
*/

            System.out.println("Class experiments");
            Person Amer = new Person();
            /*
            Amer.firstName="Amer";
            Amer.lastName="Rasheed";
            Amer.age=45;
            Amer.hobby="Programming";
            */
            System.out.println(Amer.firstName);
            System.out.println(Amer.getInformation());


  /*          System.out.println(b);
            System.out.println(s);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(s);
            boolean b1=true;
            //boolean isEqual = number1 == number2
            System.out.println(b1);
            System.out.println(++i); //Add FIRST and then increment unlike i++

            if (c1!=c)
                System.out.println("Not equal");
String name="Amer";
String name1;
name1=name.concat(" Haji");
            System.out.println(name1);

            name=name+"Rasheed";
            System.out.println(name);
*

            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            System.out.println("you entered" + s1);

            int number = 17;

            String name = "Amer";


            System.out.println(name.length());
            int Seventeen = 17;
            System.out.println(Seventeen++); // 17
            System.out.println(Seventeen); // 18

            System.out.println(--Seventeen); // 17
            System.out.println(Seventeen--); // 17

            int Seventeen=17;
            System.out.println(Seventeen); // 17
            String Amer1="name";
            l=Amer1.length();
            System.out.println(Seventeen/(double) l); //Type casting with double
*/
        }


}
