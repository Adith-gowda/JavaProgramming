import java.util.Scanner;
public class day4_loops {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //for loop
        //syntax
        // for (initialization; condition; increment/decrement){
        //     //statements
        // }
        for (int i=0; i<5; i++){
            System.out.println(i);
        }

        //while loop
        //syntax
        // while (condition){
        //     //statements
        // }
        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }

        //do-while loop
        //syntax
        // do{
        //     //statements
        // }while (condition);
        i=0;
        do{
            System.out.println(i);
            i++;
        }while (i<5);

        //break statement
        //syntax
        // break;
        for (i=0; i<5; i++){
            if (i==3){
                break;
            }
            System.out.println(i);
        }

        //continue statement
        //syntax
        // continue;
        for (i=0; i<5; i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }

        //nested loops
        //syntax
        // for (initialization; condition; increment/decrement){
        //     for (initialization; condition; increment/decrement){
        //         //statements
        //     }
        // }
        for (i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
