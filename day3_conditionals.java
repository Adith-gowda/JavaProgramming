import java.util.*;
public class day3_conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //if-else statement
        //syntax
        int age = sc.nextInt();
        if (age>18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }

        //if-else-if ladder
        //syntax
        int marks = sc.nextInt();
        if (marks>90){
            System.out.println("Grade A");
        }
        else if (marks>80){
            System.out.println("Grade B");
        }
        else if (marks>70){
            System.out.println("Grade C");
        }
        else if (marks>60){
            System.out.println("Grade D");
        }
        else if (marks>50){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }

        //switch statement
        //syntax
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
        
            case 2:
                System.out.println("Tuesday");
                break;
        
            case 3:
                System.out.println("Wednesday");
                break;
        
            case 4:
                System.out.println("Thursday");
                break;
        
            case 5:
                System.out.println("Friday");
                break;
        
            case 6:
                System.out.println("Saturday");
                break;
        
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
