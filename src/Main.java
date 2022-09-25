public class Main {
    public static void main(String[] args) {

        // Задание 1
        byte lesson = 8;
        short course = 9;
        int profession = 11;
        long year = 365L;
        float trackDistance = 6.999999f;
        double treeHeight = 6.888888888;
        boolean isLearned = lesson > 18;
        char bar = 35;
        System.out.println(bar);

        // Задание 2
        double room = 27.12;
        long stadium = 987678965549L;
        float oakHeight = 2.786f;
        boolean isAdult = false;
        short riverLong = 569;
        short subsurfaceHeight = -159;
        char noName = 27897;
        System.out.println(noName);
        byte ageGrandfather = 67;

        // Задание 3
        byte totalStudents = 23 + 27 + 30;
        System.out.println(totalStudents);
        int sheetsToOneStudent = 480 / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsToOneStudent + " листов бумаги");

        // Задание 4
        byte efficiency = 16 / 2;
        System.out.println(efficiency);
        int minutes20 = efficiency * 2;
        System.out.println("За 20 минут машина произвела бутылок " + minutes20 + " штук");
        int hoursPerDay = 24 * 60;
        int productivityPerDay = efficiency * hoursPerDay;
        System.out.println("За сутки машина произвела бутылок " + productivityPerDay + " штук");
        int productivityIn3Days = productivityPerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + productivityIn3Days + " штук");
        int productivityPerMonth = productivityPerDay * 30;
        System.out.println("За месяц (30 дней) машина произвела бутылок " + productivityPerMonth + " штук");

        // Задание 5
        byte cansOfWhitePaint = 2;
        byte cansOfBrownPaint = 4;
        int cansPerClass = cansOfWhitePaint + cansOfBrownPaint;
        System.out.println("Всего банок на 1 класс " + cansPerClass + " штук");
        int numberOfClasses = 120 / cansPerClass;
        System.out.println("Всего нужно покрасить " + numberOfClasses + " классов");
        int needCansOfWhitePaint = cansOfWhitePaint * numberOfClasses;
        int needCansOfBrownPaint = cansOfBrownPaint * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + needCansOfWhitePaint + " банок белой краски и " + needCansOfBrownPaint + " банок коричневой краски.");

        // Задание 6
        byte bananas = 5;
        short bananaWeight = 80;
        int weight5Bananas = bananas * bananaWeight;
        int milk = 200;
        short milkWeight = 105;
        int weightMilk = milk * milkWeight;
        byte iceCreamSundae = 2;
        short iceCreamSundaeWeight = 100;
        int weightIceCreamSundae = iceCreamSundae * iceCreamSundaeWeight;
        byte rawEggs = 4;
        short rawEggWeight = 70;
        int weightRawEggs = rawEggs * rawEggWeight;
        int weightOfTheSportsBreakfast = weight5Bananas + weightMilk + weightIceCreamSundae + weightRawEggs;
        System.out.println("Вес спорт-завтрака составляет " + weightOfTheSportsBreakfast + " грамм");
        float kilogram = weightOfTheSportsBreakfast / 1000f;
        System.out.println("Вес спорт-завтрака составляет " + kilogram + " килограмм");

        // Задание 7
        short needToReset = 7000;
        short grams1 = 250;
        short grams2 = 500;
        int weightLossBy250Grams = needToReset / grams1;
        int weightLossBy500Grams = needToReset / grams2;
        System.out.println("Чтобы похудеть на 7 кг при сбросе 250 грамм/день потребуется " + weightLossBy250Grams + " дней, а при 500 граммах - " + weightLossBy500Grams + " дней");

        // Задание 8
        int mashaS = 67760;
        int denisS = 83690;
        int kristinaS = 76230;
        float salaryIncrease = 0.1f;
        var mashaSalaryIncrease = mashaS * salaryIncrease;
        var newSalaryMasha = mashaSalaryIncrease + mashaS;
        var denisSalaryIncrease = denisS * salaryIncrease;
        var newSalaryDenis = denisSalaryIncrease + denisS;
        var kristinaSalaryIncrease = kristinaS * salaryIncrease;
        var newSalaryKristina = kristinaSalaryIncrease + kristinaS;
        System.out.println("Новые зарплаты: Маши - " + newSalaryMasha + ", Дениса - " + newSalaryDenis + ", Кристины - " + newSalaryKristina);

        var oldSalaryPerYearMasha = mashaS * 12;
        var oldSalaryPerYearDenis = denisS * 12;
        var oldSalaryPerYearKristina = kristinaS * 12;

        var newSalaryPerYearMasha = newSalaryMasha * 12;
        var newSalaryPerYearDenis = newSalaryDenis * 12;
        var newSalaryPerYearKristina = newSalaryKristina * 12;

        var salaryDifferenceMasha = newSalaryPerYearMasha - oldSalaryPerYearMasha;
        var salaryDifferenceDenis = newSalaryPerYearDenis - oldSalaryPerYearDenis;
        var salaryDifferenceKristina = newSalaryPerYearKristina - oldSalaryPerYearKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + " рублей");

    }
}