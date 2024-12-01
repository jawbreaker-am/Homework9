
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("\nЗадача 1:");
        int[] weekExpenses = {1,5,6,3,2};
        int monthExpenses = 0;
        for (int exp:weekExpenses) {
            monthExpenses+=exp;
        }
        System.out.println("Сумма трат за месяц составила "+monthExpenses+" рублей");
        //Задача 2
        System.out.println("\nЗадача 2:");
        int minExp=weekExpenses[0];
        int maxExp=weekExpenses[0];
        for (int exp:weekExpenses) {
            minExp=minExp>exp?exp:minExp;
            maxExp=maxExp<exp?exp:maxExp;
        }
        System.out.println("Минимальная сумма трат за неделю составила  "+minExp+" рублей.\nМаксимальная сумма трат за неделю составила "+maxExp+" рублей");
        //Задача 3
        System.out.println("\nЗадача 3:");
        double avgMonthExpenses=(double)monthExpenses/weekExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила  "+avgMonthExpenses+" рублей");
        //Задача 4
        System.out.println("\nЗадача 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char tempBox;
        for (int i=0;i<(reverseFullName.length-1)/2;i++){
            tempBox=reverseFullName[i];
            reverseFullName[i]=reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i]=tempBox;
        }
        for (char l:reverseFullName){
            System.out.print(l);
        }
    }
}