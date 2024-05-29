
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] spendingPerMonth = {23, 88, 24, 77, 3};
        int sum = 0;
        for (int i : spendingPerMonth) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        System.out.println("Задача 2");
        int[] spendingPerWeek = {43, 12, 28, 79, 99};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : spendingPerWeek) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : spendingPerWeek) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println();
        System.out.println("Задача 3");
        int[] averageSpendingPerWeek = {32, 23, 48, 46, 58};
        double avgPerWeek;
        double sumPerWeek = 0;
        for (int i : averageSpendingPerWeek) {
            sumPerWeek += i;
        }
        avgPerWeek = sumPerWeek / averageSpendingPerWeek.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgPerWeek + " рублей.");
        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}