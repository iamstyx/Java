import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int age = 40;

/*
        Date now = new Date();
        now.getTime();
        System.out.println(now);
*/

/*        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "Opps\"YO";
        System.out.println(message);
        message.endsWith("YO");*/
/*

        //Arrays
        int [] numbers = {2,3,5,1,4};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
*/

/*        int [][] numbers = {{1,2,3},{4,5,6}};
        numbers [0] [0] = 1;
        System.out.println(Arrays.deepToString(numbers));*/


//          Constant
//        final float pi =3.14f;

        //double result = (double)10 /(double) 3;
/*        int x = 1;
        x += 2; // x = x + 2;
        System.out.println(x);*/

/*        // Question
        int x = (10 + 3) * 2;
        System.out.println(x);*/

        // Implicit Casting
        // bye > short > int > long > float > double
/*
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
*/

        // Math Class
/*
        int result = (int)Math.round(Math.random()* 100);
        System.out.println(result);*/

/*
        // Percent Format

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.1);
        System.out.println(result);
*/


/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
//      String name = sc.nextLine();
        String name = sc.nextLine().trim();
        System.out.println(("You are " + name));

*/
        // Comparision Operators
/*      int x = 1;
        int y = 1;
        System.out.println(x == y);
        System.out.println(x != y);*/

        // Logical Operators

/*        int temperature = 35;
        boolean isWarm = temperature > 20 && temperature <30;
        System.out.println(isWarm);*/

/*        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;  // ! not operator
        System.out.println(isEligible);*/


/*
        // If Statements

        int temp = 32;
        if(temp > 30){
            System.out.println("It's a Hot Day");
            System.out.println("Drink Plenty Water");
        }
        else if (temp > 20)
            System.out.println("Beautiful Day");
        else
            System.out.println("Cold Day");
*/

        // Simplify Statements

/*        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        */

        //Ternary Operator

/*
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
*/

        // Switch Statements

/*
        int role = 1;

        switch (role){
            case 1:
                System.out.println("You are a admin");
                break;
            case 2:
                System.out.println("You are a moderator");
            break;

            default:
                System.out.println("You are a guest");
        }
*/

/*
        // Like Switch but in If

        String role1 = "admin";

        if (role1 == "admin")
            System.out.println("You are a admin");
        else if (role1 == "moderator")
            System.out.println("You are a moderator");
        else
            System.out.println("You are a guest");
*/

/*        // For Loops

        for(int i = 5; i>0; i--)
            System.out.println("Hello World " + i);*/

/*        // While Loops
        Scanner sc = new Scanner(System.in);

        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input");
            input = sc.next().toLowerCase();
            System.out.println(input);
    }*/


        // Do While Loop
/*

            Scanner sc = new Scanner(System.in);
            String input = "";

        do {
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            System.out.println(input);
        }while (!input.equals("quit"));
*/

/*        // Break and Continue

        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
        if (input.equals("pass"))
            continue;
        if(input.equals("quit"))
        break;
            System.out.println(input);
        }*/

/*        // For Each Loops

        String[] fruits = {"Apple", "Mango","Orange"};

        for (String fruit : fruits)
            System.out.println(fruit);*/


    }
}