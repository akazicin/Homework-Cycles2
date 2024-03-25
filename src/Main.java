public class Main {
    public static void main(String[] args) {
        ///task 1

        double salatyMonth = 0;
        int month = 1;
        while (salatyMonth < 2_459_000) {
            salatyMonth = salatyMonth + 15000;
            month = month + 1;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + (long) salatyMonth + " рублей");
        }

        ///task2

        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        ///task3

        int year = 1;
        int population = 12_000_000;
        while (year <= 10) {
            System.out.println("Год " + year + ",численность населения составляет " + population);
            int deathRate = population / 1000 * 8;
            int birthRate = population / 1000 * 17;
            population = population - deathRate + birthRate;
            year = year + 1;
        }

        ///task4

        double debosit = 15000;
        int monthes = 1;
        while (debosit < 12_000_000) {
            debosit = debosit + debosit * 0.07;
            monthes = monthes + 1;
            System.out.println(" Сумма в " + monthes + " составит " + (long) debosit);
        }
        System.out.println("Василию потребуется " + monthes + " месяцев ");


        ///task5
        debosit = 15000;
        monthes = 1;
        while (debosit < 12_000_000) {
            debosit = debosit + debosit * 0.07;
            monthes = monthes + 1;
            if (monthes % 6 == 0) {
                System.out.println(" Сумма в " + monthes + " составит " + (long) debosit);
            }
        }

        ///task6
        debosit = 15000;
        monthes = 1;
        while (monthes < 9 * 12) {
            debosit = debosit + debosit * 0.07;
            monthes = monthes + 1;
            if (monthes % 6 == 0) {
                System.out.println(" Сумма в " + monthes + " составит " + (long) debosit);
            }
        }

        ///task7
        int friday = 1;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }

        ///task8

        for (int x = 2024 - 200; x < 2024 + 100; x++) {
            if (x % 79 == 0)
                System.out.println(x);

        }


    }
}