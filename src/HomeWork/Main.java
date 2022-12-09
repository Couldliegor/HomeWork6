package HomeWork;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
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
    }

    public static void task4() {
        //task4
        int moneyInPerMonth = 15000;
        int i = 0;
        int percents;
        for (;moneyInPerMonth < 12_000_000; i++) {
            percents = moneyInPerMonth / 100 * 7;
            moneyInPerMonth = moneyInPerMonth + percents;
            System.out.println("sum in " + i + " month is " + moneyInPerMonth);
        }

    }
}