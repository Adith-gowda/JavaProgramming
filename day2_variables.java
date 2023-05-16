//System is a class
//out is a static variable
//println is a method

//java is a typed langugae i.e., we have to specify the data type of the variable

import java.util.*;
public class day2_variables{
    public static void main(String[] args) {
        //output
        System.out.println("My name is ADITH SAGAR GOWDA");
        System.out.print("My name is ADITH SAGAR GOWDA\n");
        System.out.printf("My name is ADITH SAGAR GOWDA\n");


        //printf()
        //%d -> integer
        //%f -> float
        //%c -> character
        //%s -> string
        //%b -> boolean
        //%n -> new line

        //examples for using printf()

        int x=10;
        float y=10.5f;
        char z='A';
        String name1="ADITH SAGAR GOWDA";
        boolean b1=true;
        System.out.printf("The value of x is %d\n",x);
        System.out.printf("The value of y is %f\n",y);
        System.out.printf("The value of z is %c\n",z);
        System.out.printf("The value of name1 is %s\n",name1);
        System.out.printf("The value of b1 is %b\n",b1);


        //variables
        int a=10;
        System.out.println(a);

        String name="ADITH SAGAR GOWDA";
        System.out.println(name);

        //constants
        final int b=20;
        System.out.println(b);

        //data types
        //primitive data types
        //integers
        byte c=10;
        short d=20;
        int e=30;
        long f=40;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //floating point numbers
        float g=10.5f;
        //why should we use f at the end of the float variable?
        //because by default java considers floating point numbers as double
        double h=20.5;
        System.out.println(g);
        System.out.println(h);

        //characters
        char i='A';
        System.out.println(i);

        //boolean
        boolean j=true;
        System.out.println(j);

        //input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int k=sc.nextInt();
        System.out.println("The value of k is "+k);


    }
}