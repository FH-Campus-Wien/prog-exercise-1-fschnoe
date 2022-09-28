package at.ac.fhcampuswien;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901\n" +
                "         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char l1 = 'Z';
        int l2 = 0xface;
        int l3 = 012;
        long l4 = 80L;
        float l5 = 44e-1f;
        float l6 =  5.5f;
        double l7 = 8.88e1;
        double l8 = 99.9;

        int sum = (int) l1 + l2 + l3 + (int) l4 + (int) l5 + (int) l6 + (int) l6 + (int) l7 + (int) l8;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        System.out.println((num1 + num2));
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        Scanner s = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = s.nextInt();
        System.out.print("y: ");
        int y = s.nextInt();

        //x: 4
        //y: 9

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner s = new Scanner(System.in);

        System.out.print("n1: ");
        int i1 = s.nextInt();
        System.out.print("n2: ");
        int i2 = s.nextInt();

        if (i1 < i2){
            System.out.println("n2 > n1");
        } else if (i2 < i1) {
            System.out.println("n1 > n2");
        } else if (i1 > i2) {
            System.out.println("n1 > n2");
        } else if (i2 > i1) {
            System.out.println("n2 > n1");
        } else if (i1 == i2){
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner s = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int revenue = s.nextInt();

        if(revenue <= 0 || revenue >= 100000){
            System.out.println("Invalid Revenue");
        }
        else if (revenue >= 80000 || revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
        else if (50000 <= revenue || revenue < 80000){
            System.out.println("Good Sales Revenue");
        }
        else if (20000 <= revenue || revenue < 50000) {
            System.out.println("Average Sales Revenue");
        }
        else if (0 <= revenue || revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner s = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int comm = s.nextInt();

        switch (comm){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner s = new Scanner(System.in);

        System.out.print("Year: ");
        int year = s.nextInt();

        LocalDate d = LocalDate.of(year, 1, 1);
        if(d.isLeapYear()){
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner s = new Scanner(System.in);

        System.out.print("Number: ");
        int number = s.nextInt();
        int reverse = 0;

        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }

        System.out.println(reverse);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}