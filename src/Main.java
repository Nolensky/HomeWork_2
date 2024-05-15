public class Main {
    public static void main(String[] args) {

        //Задача 1
        byte variableOne = 123;
        System.out.println("Значение переменной variableOne с типом byte равно " + variableOne);
        short variableTwo = 23490;
        System.out.println("Значение переменной variableTwo с типом short равно " + variableTwo);
        int variableThree = 2_135_890_458;
        System.out.println("Значение переменной variableThree с типом int равно " + variableThree);
        long variableFour = 387_478_224_574_873L;
        System.out.println("Значение переменной variableFour с типом long равно " + variableFour);
        float variableFive = (float) 4879.5870789;
        System.out.println("Значение переменной variableFive с типом float равно " + variableFive);
        double variableSix = 4879.58707895656;
        System.out.println("Значение переменной variableSix с типом double равно " + variableSix);

        //Задача 2
        float variableA = 27.12F;
        long variableB = 987_678_965_549L;
        float variableC = (float) 2.786;
        short variableD = 569;
        short variableE = -159;
        short variableF = 27897;
        byte variableG = 67;

        //Задача 3
        byte studentsInClassOne = 23;
        byte studentsInClassTwo = 27;
        byte studentsInClassThree = 30;
        short quantitySheets = 480;
        int quantityStudents = studentsInClassOne + studentsInClassTwo + studentsInClassThree;
        int sheetsPerStudent = quantitySheets / quantityStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //Задача 4
        //Производительность машины 16 бутылок за 2 минуты
        byte productivityPerMinute = 16 / 2;

        short productivityPer20Min = (short) (20 * productivityPerMinute);
        System.out.println("За 20 минут машина произвела " + productivityPer20Min + " штук бутылок");

        short productivityPerDay = (short) (productivityPer20Min * 3 * 24);
        System.out.println("За день машина произвела " + productivityPerDay + " штук бутылок");

        int productivityPerThreeDay = (productivityPerDay * 3);
        System.out.println("За три дня машина произвела " + productivityPerThreeDay + " штук бутылок");

        int productivityPerMonth = (productivityPerDay * 30);
        System.out.println("За месяц машина произвела " + productivityPerMonth + " штук бутылок");

        //Производительность машины за месяц, если в месяце 31 день
        int productivityPer31Day = (productivityPerDay * 31);
        System.out.println("За 31 день машина произвела " + productivityPer31Day + " штук бутылок");

        //Задача 5
        byte quantityClassesInSchool = 160 / (2 + 4);
        short quantityCanWhiteColor = (short) (quantityClassesInSchool * 2);
        short quantityCanBrownColor = (short) (quantityClassesInSchool * 4);
        System.out.println("В школе, где " + quantityClassesInSchool + " классов, нужно " + quantityCanWhiteColor +
                " банок белой краски и " + quantityCanBrownColor + " банок коричневой краски");

        //Задача 6
        short recipeWeight = (5 * 80 + 2 * 105 + 2 * 100 + 4 * 70);
        float recipeWeightKg = (float) recipeWeight / 1000;
        System.out.println("Вес завтрака спортсмена в граммах " + recipeWeight + ", а в килограммах " + recipeWeightKg);

        //Задача 7
        byte daysBy250 = 7 * 1000 / 250;
        byte daysBy500 = 7 * 1000 / 500;
        short dayByAverageWeight = (250 + 500) / 2;
        byte averageDays = (byte) (7 * 1000 / dayByAverageWeight);
        System.out.println("Если спортсмен будет терять вес по 250 грамм, потребуется " + daysBy250 + " дней.");
        System.out.println("Если спортсмен будет терять вес по 500 грамм, потребуется " + daysBy500 + " дней.");
        System.out.println("В среднем для похудения спортсмена потребуется " + averageDays + " дней.");

        //Задача 8
        {
            //Маша
            int salaryPerMonth = 67760;
            double salaryAfterUpPerMonth = salaryPerMonth * 0.1 + salaryPerMonth;
            double salaryAfterUpPerYear = salaryAfterUpPerMonth * 12;
            double diffSalaryPerYear = salaryAfterUpPerYear - salaryPerMonth * 12;
            System.out.println("Маша теперь получает " + salaryAfterUpPerMonth + " рублей. Годовой доход вырос на " + diffSalaryPerYear + " рублей.");
        }
        {
            //Денис
            int salaryPerMonth = 83690;
            double salaryAfterUpPerMonth = salaryPerMonth * 0.1 + salaryPerMonth;
            double salaryAfterUpPerYear = salaryAfterUpPerMonth * 12;
            double diffSalaryPerYear = salaryAfterUpPerYear - salaryPerMonth * 12;
            System.out.println("Денис теперь получает " + salaryAfterUpPerMonth + " рублей. Годовой доход вырос на " + diffSalaryPerYear + " рублей.");
        }
        {
            //Кристина
            int salaryPerMonth = 76230;
            double salaryAfterUpPerMonth = salaryPerMonth * 0.1 + salaryPerMonth;
            double salaryAfterUpPerYear = salaryAfterUpPerMonth * 12;
            double diffSalaryPerYear = salaryAfterUpPerYear - salaryPerMonth * 12;
            System.out.println("Кристина теперь получает " + salaryAfterUpPerMonth + " рублей. Годовой доход вырос на " + diffSalaryPerYear + " рублей.");
        }
    }
}