//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание № 3");

        System.out.println("Задача № 1");

        int a = 45000;
        byte  b= 127;
        short c = 3277;
        long d = 400000000L;
        float f = 3.7500021f;
        double j = 3.5786999123456789;
        System.out.println("Значение переменной a с типом int равно " + a );
        System.out.println("Значение переменной b с типом  byte  равно " + b );
        System.out.println("Значение переменной  c с типом  short   равно " + c  );
        System.out.println("Значение переменной  d с типом  long   равно  " + d);
        System.out.println("Значение переменной  f с типом   float    равно  " + f);
        System.out.println("Значение переменной  j с типом  double   равно  " + j );

        System.out.println("Задача № 2");

        int h = 27897 ;
        byte  k= 67 ;
        short l = 569 ;
        long m = 987678965549L;
        float n = 27.12f;
        double p = 2.786;
        short q = -159 ;
        System.out.println("Значение переменной h с типом int равно " + h );
        System.out.println("Значение переменной k с типом  byte  равно " + k );
        System.out.println("Значение переменной  l с типом  short   равно " + l  );
        System.out.println("Значение переменной  m с типом  long   равно  " + m);
        System.out.println("Значение переменной  n с типом   float    равно  " + n);
        System.out.println("Значение переменной  p с типом  double   равно  " + p );
        System.out.println("Значение переменной  q с типом  short   равно " + q  );

        System.out.println("Задача № 3");
        short totalNumberOfSheets = 480;
        byte numberОfLyudmilaPavlovnaStudents = 23;
        byte numberОfAnnaSergeevnaStudents = 27;
        byte numberОfEkaterinaAndreevnaStudents = 30;
        int totalStudents = numberОfLyudmilaPavlovnaStudents + numberОfAnnaSergeevnaStudents + numberОfEkaterinaAndreevnaStudents;
        int numberOfSheetsForEachStudent = totalNumberOfSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано  " +    numberOfSheetsForEachStudent + " листов бумаги"  );

        System.out.println("Задача № 4");
        byte capacityOfBottleMakingMachineIn2Minutes = 16;
        byte t1 = 20;
        short t2 = 1440;
        short t3 = 1440 * 3;
        int t4 = 1440 * 30;
        byte  capacityOfBottleMakingMachineIn1Minutes = 16/2;
        int capacityOfBottleMakingMachineIn20Minutes = capacityOfBottleMakingMachineIn1Minutes * t1;
        int capacityOfBottleMakingMachineIn1440Minutes = capacityOfBottleMakingMachineIn1Minutes * t2;
        int capacityOfBottleMakingMachineIn4320Minutes = capacityOfBottleMakingMachineIn1Minutes * t3;
        int capacityOfBottleMakingMachineIn43200Minutes = capacityOfBottleMakingMachineIn1Minutes * t4;
        System.out.println("За 1 минуту  машина произвела  " +  capacityOfBottleMakingMachineIn1Minutes + "  штук бутылок");
        System.out.println("За 20 минут машина произвела  " +   capacityOfBottleMakingMachineIn20Minutes +   " штук бутылок" );
        System.out.println("За 1440 минут (сутки) машина произвела  " +  capacityOfBottleMakingMachineIn1440Minutes + " штук бутылок");
        System.out.println("За 4320 минут (3 дня)  машина произвела  " +   capacityOfBottleMakingMachineIn4320Minutes  +
                " штук бутылок" );
        System.out.println("За  43200 минут (30 дней) машина произвела  " +   capacityOfBottleMakingMachineIn43200Minutes  +
                " штук бутылок" );

        System.out.println("Задача № 5");

        Byte  totalNumberOfPaintCansForClasses = 120;
        Byte quantityOfWhitePaintPerClass=2;
        Byte quantityOfBrownPaintPerClass =4;
        int  totalNumberOfPaintCansPerOneClass =  quantityOfWhitePaintPerClass + quantityOfBrownPaintPerClass;
        int  numberOfClasses = totalNumberOfPaintCansForClasses  /  totalNumberOfPaintCansPerOneClass;
        int  totalAmountOfWhitePaintForAllClasses=   numberOfClasses  *   quantityOfWhitePaintPerClass;
        int totalAmountOfBrownPaintForAllClasses =   numberOfClasses *  quantityOfBrownPaintPerClass;
        System.out.println("В школе, где " + numberOfClasses  +  " классов, нужно " + totalAmountOfWhitePaintForAllClasses
                + " банок белой краски и "  + totalAmountOfBrownPaintForAllClasses + " банок коричневой краски");

        System.out.println("Задача № 6");

        Byte bananas = 5;
        Byte gramsInOneBanana = 80;

        short milk = 200;
        Byte halfServingOfMilk = 100;
        Byte gramsIn100MillilitersOfMilk = 105;
        int amountOfMilkNeeded = milk/halfServingOfMilk;

        Byte IceCreamBriquettes = 2;
        Byte oneBriquetteOfFrozenGrams=100;

        Byte rawEggs = 4;
        Byte numberOfGramsInOneRawEgg = 70;

        int numberOfGramsInFiveBananas = bananas * gramsInOneBanana;
        int numberOfGramsIn200MlOfMilk = amountOfMilkNeeded * gramsIn100MillilitersOfMilk;
        int numberOfGramsIn2IceCreamBriquettes =  IceCreamBriquettes * oneBriquetteOfFrozenGrams;
        int numberOfGramsIn4RawEggs = rawEggs * numberOfGramsInOneRawEgg;
        int totalGramsInBreakfast = numberOfGramsInFiveBananas + numberOfGramsIn200MlOfMilk + numberOfGramsIn2IceCreamBriquettes +
                numberOfGramsIn4RawEggs;
        float totalGramInKg = 1000f;

        float totalKgInBreakfast =  totalGramsInBreakfast /  totalGramInKg;
        System.out.println("Вес (количество граммов) такого спортзавтрака составляет " + totalGramsInBreakfast + " граммов");
        System.out.println("Вес (количество килограммов) такого спортзавтрака составляет " + totalKgInBreakfast  + " килограмм");

        System.out.println("Задача № 7");
        Byte  totalNumberOfKgForWeightLoss =7;
        short totalNumberOfGramsInKilogram = 1000;
        int totalGramsForWeightLoss = 7*1000;
        short firstWayToLoseWeight = 250;
        short secondWayToLoseWeight = 500;
        int numberOfDaysWithTheFirstMethodOfLosingWeight = totalGramsForWeightLoss / firstWayToLoseWeight;
        int numberOfDaysWithTheSecondMethodOfLosingWeight= totalGramsForWeightLoss / secondWayToLoseWeight;
        System.out.println(numberOfDaysWithTheFirstMethodOfLosingWeight + "  дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(numberOfDaysWithTheSecondMethodOfLosingWeight + " дней уйдет на похудение, если спортсмен каждый день будет худеть на 500 грамм");

        byte numberOfWaysToLoseWeight = 2;
        int  sumOfDaysForCalculatingTheArithmeticMean = numberOfDaysWithTheFirstMethodOfLosingWeight+
                numberOfDaysWithTheSecondMethodOfLosingWeight;
        int numberOfDaysToLoseWeightOnAverage = sumOfDaysForCalculatingTheArithmeticMean / numberOfWaysToLoseWeight;
        System.out.println(numberOfDaysToLoseWeightOnAverage + " дней уйдет на похудение в среднем");

        System.out.println("Задача № 8");
        int mashaCurrentSalaryPerMonth = 67760;
        int denisSalaryCurrentPerMonth = 83690;
        int christinaSalaryCurrentPerMonth = 76230;

        float salaryIncreasePercentage=10/100f;
        float amountOf10PercentOfMashaCurrentSalary = mashaCurrentSalaryPerMonth * salaryIncreasePercentage;
        float amountOf10PercentOfDenisCurrentSalary = denisSalaryCurrentPerMonth * salaryIncreasePercentage;
        float amountOf10PercentOfChristinaCurrentSalary = christinaSalaryCurrentPerMonth * salaryIncreasePercentage;
        System.out.println("Сумма 10% от месячной зарплаты сотрудников: Маши, Дениса, Кристины соответсвенно");
        System.out.println(amountOf10PercentOfMashaCurrentSalary);
        System.out.println(amountOf10PercentOfDenisCurrentSalary);
        System.out.println(amountOf10PercentOfChristinaCurrentSalary);


        float mashaSalaryPerMonthAfterTheIncrease =  mashaCurrentSalaryPerMonth  +  amountOf10PercentOfMashaCurrentSalary;            ;
        float denisSalaryPerMonthAfterTheIncrease =  denisSalaryCurrentPerMonth  +   amountOf10PercentOfDenisCurrentSalary;
        float christinaSalaryPerMonthAfterTheIncrease = christinaSalaryCurrentPerMonth + amountOf10PercentOfChristinaCurrentSalary;
        System.out.println("Месячная зарплата сотрудников после повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(mashaSalaryPerMonthAfterTheIncrease);
        System.out.println(denisSalaryPerMonthAfterTheIncrease);
        System.out.println(christinaSalaryPerMonthAfterTheIncrease);


        byte month = 12;
        double AnnualIncomeOfMashaAfterTheIncrease = mashaSalaryPerMonthAfterTheIncrease * month;
        double AnnualIncomeOfDenisAfterTheIncrease = denisSalaryPerMonthAfterTheIncrease * month;
        double AnnualIncomeOfChristinaAfterTheIncrease = christinaSalaryPerMonthAfterTheIncrease * month;
        System.out.println("Годовая зарплата сотрудников после повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(AnnualIncomeOfMashaAfterTheIncrease);
        System.out.println(AnnualIncomeOfDenisAfterTheIncrease);
        System.out.println(AnnualIncomeOfChristinaAfterTheIncrease);



        int MashaAnnualIncomeBeforeTheIncrease = mashaCurrentSalaryPerMonth * month;
        int DenisAnnualIncomeBeforeTheIncrease = denisSalaryCurrentPerMonth *   month;
        int ChristinaAnnualIncomeBeforeTheIncrease = christinaSalaryCurrentPerMonth * month;
        System.out.println("Годовая зарплата сотрудников до повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(MashaAnnualIncomeBeforeTheIncrease);
        System.out.println(DenisAnnualIncomeBeforeTheIncrease);
        System.out.println(ChristinaAnnualIncomeBeforeTheIncrease);

        System.out.println("Разница между годовыми зарплатами сотрудников до повышения и после: Маши, Дениса, Кристины соответсвенно");
        double differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter = AnnualIncomeOfMashaAfterTheIncrease - MashaAnnualIncomeBeforeTheIncrease;
        double differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter = AnnualIncomeOfDenisAfterTheIncrease - DenisAnnualIncomeBeforeTheIncrease;
        double differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter = AnnualIncomeOfChristinaAfterTheIncrease - ChristinaAnnualIncomeBeforeTheIncrease;
        System.out.println(differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter);
        System.out.println(differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter);
        System.out.println(differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter);

        System.out.println("Маша теперь получает " + mashaSalaryPerMonthAfterTheIncrease + " рублей в месяц. " +
                "Годовой доход вырос на " + differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter +" рублей. " );
        System.out.println("Денис теперь получает " +  denisSalaryPerMonthAfterTheIncrease + " рублей в месяц. " +
                "Годовой доход вырос на " + differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter +" рублей." );
        System.out.println("Кристина теперь получает " + christinaSalaryPerMonthAfterTheIncrease + " рублей в месяц. " +
                "Годовой доход вырос на " +  differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter +" рублей." );









    }
}