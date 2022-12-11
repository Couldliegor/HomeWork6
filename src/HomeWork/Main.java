package HomeWork;

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
        int rublesInTheEnd = 2477198;
        do{
            percents = sum / 100;
            sum = sum + salaryPersonHasPerMonth + percents;
            months++;
        }
        while (sum < rublesInTheEnd);
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
        for(;max >= 1;max--){
            System.out.print(max + " ");
        }
        System.out.println();
    }
    public static void task3() {
    //task3
        System.out.println();
    int peopleInY = 12_000_000;
    int differencePerThousand = (17 - 8) * 12_000_000 /100;
    int year = 1;
    while(year <= 10){
        peopleInY = peopleInY + differencePerThousand;
        year++;
    }
    System.out.println("Year " + year + " ,people population is: " + peopleInY);
    System.out.println();
    }

    public static void task4() {
        //task4
        int moneyInPerMonth = 15000;
        int i = 0;
        int percents;
        int wishSum = 12_000_000;
        for (;moneyInPerMonth < wishSum; i++) {
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
        double changebleMoneyInPerMonth = 15000;
        int stableSumPerMonth = 15000;
        int i = 0;
        double percents;
        float floated = 0.07f;
        int wishSum = 12_000_000;
        for (;changebleMoneyInPerMonth < wishSum; i++) {
            percents = changebleMoneyInPerMonth * floated;
            changebleMoneyInPerMonth = changebleMoneyInPerMonth + percents + stableSumPerMonth;
            if (i % 6 == 0) {
                System.out.println("sum in " + i + " month is " + changebleMoneyInPerMonth);
            }
        }
    }

    public static void task6() {
        //task 6
        System.out.println();
        System.out.println("TASK 6");
        System.out.println();
        double startSum = 15000;
        int stableSum = 15000;
        double percents;
        int month = 0;
        int months = 9 * 12;
        int halfAYear = 1;
        float floated = 0.07f;
        while (month <= months){
            percents = startSum * floated ;
            startSum = startSum + percents + stableSum;
            month++;
            if (month % 6 == 0) {
                System.out.println("The sum per " + halfAYear + " Half a year is " + startSum);
                halfAYear++;
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
        int day = 1;
        for(;day <= monthDays;day++){
            if (day % 7 == fridays) {
                    System.out.println("T0DAY IS FRIDAY " + day + " th, don't forget to do your report");
            }
        }
    }

    public static void task8() {
        //task 8
        System.out.println();
        System.out.println("TASK 8");
        int comet = 0;
        int yearForComet = 79;
        int maxYear = 2122;
        int minYear = 1822;
        while (comet < maxYear){
            comet = comet + yearForComet;
            if (comet > minYear) {
                System.out.println(comet);
            }
        }
    }
    //done
}