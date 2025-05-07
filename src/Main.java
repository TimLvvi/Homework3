//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:"); // Задача 1
        byte myNumber1 = 10;
        short myNumber2 = 8000;
        int myNumber3 = 51000;
        long myNumber4 = 30000000000L;
        float myNumber5 = 8.55f;
        double myNumber6 = 10.12345678999;
        System.out.println("Значение переменной myNumber1 c типом byte равно " + myNumber1);
        System.out.println("Значение переменной myNumber2 c типом short равно " + myNumber2);
        System.out.println("Значение переменной myNumber3 c типом int равно " + myNumber3);
        System.out.println("Значение переменной myNumber4 c типом long равно " + myNumber4);
        System.out.println("Значение переменной myNumber5 c типом float равно " + myNumber5);
        System.out.println("Значение переменной myNumber6 c типом double равно " + myNumber6);
        System.out.println();

        System.out.println("Задача 2:-"); // Задача 2 (вывод результата не требуется)
        float number1 = 27.12f;
        long number2 = 987678965549L;
        float number3 = 2.786f;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7 = 67;
        System.out.println();

        System.out.println("Задача 3:"); // Задача 3
        byte teacherLudaPa = 23;
        byte teacherAnnaSe = 27;
        byte teacherEkaterinaAn = 30;
        short allPaper = 480;
        short paperOneStudent = (short) (allPaper / (teacherLudaPa + teacherAnnaSe + teacherEkaterinaAn));
        System.out.println("На каждого ученика рассчитано " + paperOneStudent + " листов бумаги");
        System.out.println();

        System.out.println("Задача 4:"); // Задача 4
        byte bottle = 16;
        byte minute = 2;
        byte bottlesOneMinute = (byte) (bottle / minute);
        byte minute20 = 20;
        short day = 1440; //минут в сутках
        short day3 = 4320; //минут в 3 днях
        int month = 43200; //минут в месяце (принято 30 дней)
        short bottleMinute20 = (short) (bottlesOneMinute * minute20);
        short bottleDay = (short) (bottlesOneMinute * day);
        int bottleDay3 = bottlesOneMinute * day3;
        int bottleMonth = bottlesOneMinute * month;
        System.out.println("За 20 минут машина произвела " + bottleMinute20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleDay3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleMonth + " штук бутылок");
        System.out.println();

        System.out.println("Задача 5:"); // Задача 5
        byte allPot = 120;
        byte whitePotOneClass = 2;
        byte brownPotOneClass = 4;
        byte allClass = (byte) (allPot / (whitePotOneClass + brownPotOneClass));
        byte allWhitePot = (byte) (whitePotOneClass * allClass);
        byte allBrownPot = (byte) (brownPotOneClass * allClass);
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhitePot + " банок белой краски и " + allBrownPot + " банок коричневой краски");
        System.out.println();

        System.out.println("Задача 6:"); // Задача 6
        byte bananaOne = 80;
        byte milk100Ml = 105;
        byte iceCream = 100;
        byte egg = 70;
        short allBanana = (short) (5 * bananaOne);
        short allMilk = (short) (2 *milk100Ml);
        short allIceCream = (short) (2 * iceCream);
        short allEgg = (short) (4 * egg);
        short weightAllProductsGr = (short) (allBanana + allMilk + allIceCream + allEgg);
        short grPerKg = 1000;
        float weightAllProductsKg = (float) weightAllProductsGr / (float) grPerKg;
        System.out.println("Вес завтрака в граммах - " + weightAllProductsGr);
        System.out.println("Вес завтрака в килограммах - " + weightAllProductsKg);
        System.out.println();

        System.out.println("Задача 7:"); // Задача 7
        byte excessWeightKg = 7;
        short weightLossOneDayGr250 = 250;
        short weightLossOneDayGr500 = 500;
        short kgPerGr = 1000;
        short excessWeightGr = (short) (excessWeightKg * kgPerGr);
        short allDay250 = (short) (excessWeightGr / weightLossOneDayGr250);// в теории написанно "Получается, что старшие типы «вмещают» в себя младших и для итоговой переменной мы выбираем тот тип, который старше." Насколько это принципиально, к примеру здесь, можно было бы испольховать byte?
        short allDay500 = (short) (excessWeightGr / weightLossOneDayGr500);// в теории написанно "Получается, что старшие типы «вмещают» в себя младших и для итоговой переменной мы выбираем тот тип, который старше." Насколько это принципиально, к примеру здесь, можно было бы испольховать byte?
        System.out.println(allDay250 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(allDay500 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        short weightLossOneDayGrAverage = (short) ((weightLossOneDayGr250 + weightLossOneDayGr500)/2);
        float allDayAverage = (float) excessWeightGr / (float) weightLossOneDayGrAverage;
        System.out.println(allDayAverage + " дней уйдет на похудение в среднем");
        System.out.println();

        System.out.println("Задача 8:"); // Задача 8
        int salaryMonthMasha = 67760;
        int salaryMonthDenis = 83690;
        int salaryMonthKristina = 76230;
        float newSalaryMonthMasha = (float) salaryMonthMasha * 1.1f;
        float newSalaryMonthDenis = (float) salaryMonthDenis * 1.1f;
        float newSalaryMonthKristina = (float) salaryMonthKristina * 1.1f;
        byte yearPerMonth = 12;
        int salaryYearMasha = salaryMonthMasha * yearPerMonth;
        int salaryYearDenis = salaryMonthDenis * yearPerMonth;
        int salaryYearKristina = salaryMonthKristina * yearPerMonth;
        float newSalaryYearMasha = newSalaryMonthMasha * yearPerMonth;
        float newSalaryYearDenis = newSalaryMonthDenis * yearPerMonth;
        float newSalaryYearKristina = newSalaryMonthKristina * yearPerMonth;
        float diffSalaryYearMasha = newSalaryYearMasha - salaryYearMasha;
        float diffSalaryYearDenis = newSalaryYearDenis - salaryYearDenis;
        float diffSalaryYearKristina = newSalaryYearKristina - salaryYearKristina;
        System.out.println("Маша теперь получает " + newSalaryMonthMasha + " рублей. Годовой доход вырос на " + diffSalaryYearMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryMonthDenis + " рублей. Годовой доход вырос на " + diffSalaryYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryMonthKristina+ " рублей. Годовой доход вырос на " + diffSalaryYearKristina + " рублей");
        System.out.println();

    }
}