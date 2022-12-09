package HomeWork;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
    }
    public static void task1(){
        //task 1
        int salaryPersonHasPerMonth = 15000;
        int sum = 0;
        int months = 1;
        int percents;
        do{
            percents = sum / 100;
            sum = sum + salaryPersonHasPerMonth + percents;
            months++;
        }
        while (sum < 2477198);
        System.out.println("Month " + months + " ,sum is " + sum);
        System.out.println();
    }
    public static void task2(){
        //task 2
        int max = 10;
        int min = 1;
        while(min <= 10){
            System.out.print(min + " ");
            min++;
        }
        System.out.println();
        for(;max >= 1;){
            System.out.print(max + " ");
            max--;
        }
        System.out.println();
    }
    public static void task3() {
    //task3
        System.out.println();
    int peopleInY = 12_000_000;
    int differencePerThousand = 17 - 8;
    int i = 1;
    while(i <= 10){
        peopleInY = peopleInY + differencePerThousand;
        i++;
    }
    System.out.println("Year " + i + " ,people population is: " + peopleInY);
    System.out.println();
    }

    public static void task4() {
        //task4
        int moneyInPerMonth = 15000;
        int i = 0;
        int percents;
        for (;moneyInPerMonth < 12_000_000; i++) {
            percents = moneyInPerMonth / 100 * 7;
            moneyInPerMonth = moneyInPerMonth + percents + 15000;
            System.out.println("sum in " + i + " month is " + moneyInPerMonth);
        }
        System.out.println();
        System.out.println("TASK 5");
        System.out.println();
    }
    public static void task5() {
        //task 5
        int moneyInPerMonth = 15000;
        int i = 0;
        int percents;
        for (;moneyInPerMonth < 12_000_000; i++) {
            percents = moneyInPerMonth / 100 * 7;
            moneyInPerMonth = moneyInPerMonth + percents + 15000;
            if (i % 6 == 0) {
                System.out.println("sum in " + i + " month is " + moneyInPerMonth);
            }
        }
    }

    public static void task6() {
        //task 6
        System.out.println();
        System.out.println("TASK 6");
        System.out.println();
        int startSum = 15000;
        int percents;
        int i = 0;
        int months = 9 * 12;
        int b = 1;
        while (i <= months){
            percents = startSum / 100 * 7;
            startSum = startSum + percents + 15000;
            i++;
            if (i / 6 == 0) {
                System.out.println("The sum per " + b + " Half a year is " + startSum);
                b++;
            }
        }
    }

    public static void task7() {
        //task 7
        System.out.println();
        System.out.println("TASK 7");
        System.out.println();
        int fridays = 5;
        int monthDays = 31;
        int i = 1;
        for(; i < monthDays;i++){
            if (i <= monthDays && i % fridays == 0) {
                    System.out.println("T0DAY IS FRIDAY " + i + " th, don't forget to do your report");
            }
        }
    }

    public static void task8() {
        //task 8
        System.out.println();
        System.out.println("TASK 8");
        System.out.println();
        System.out.println("Enter the year ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int comet = 79;
        int twoHundredBackward = year - 200;
        int oneHundredForward = year + 100;
        for(int i = 0;twoHundredBackward < oneHundredForward && i < 3; i++ ){
            twoHundredBackward = twoHundredBackward + comet;
            System.out.println(twoHundredBackward);
        }
    }
    //done
}