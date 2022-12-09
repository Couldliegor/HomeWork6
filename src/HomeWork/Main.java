package HomeWork;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
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
    }
}