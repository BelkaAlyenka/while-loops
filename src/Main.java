public class Main {
    public static void main(String[] args) {
        //Задание 1
        int firstFriday = 5;
        for (int i = 1; i <=31; i++) {
            if ((i + 7 - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        //Задание 2
        int distance = 0;
        int marathon = 42195;
        int result;
        do {
            distance+=500;
            result = marathon-distance;
            System.out.println("Держитесь! Осталось "+result+" метров");
        } while (result > 500);

        for (int i = 42195; i >= 0; i-=500) {
            System.out.println("Держитесь! Осталось "+i+" метров");
        }
        //Задание 3
        int budget = 1000;
        int day = 0;
        int rate = 100;
        System.out.print("С учетом бюджета в "+budget+" рублей.");
        while (budget > rate) {
            if (day % 5 == 0) {
                day++;
                continue;
            }
            budget -=rate;
            day++;
        }
        System.out.print(" Вы можете пользоваться парковкой "+day+" дней");

        System.out.println(); //далее реализация с for

        int totalDays = 0;
        int money = 1000;
        System.out.print("С учетом бюджета в "+money+" рублей.");
        for (int i = 0; money > rate; i++) {
            if (i % 5 == 0) {
                totalDays++;
                continue;
            }
            money -=rate;
            totalDays++;
        }
        System.out.print(" Вы можете пользоваться парковкой "+totalDays+" дней");
        //Задание 4
        System.out.println();
        int month = 0;
        int total = 0;
        int requiredSavings = 12000000;
        float percent = 1.07f;
        while (true) {
            if (total >= requiredSavings) {
                break;
            }
            month++;
            total+=15000;
            if (month % 6 == 0) {
                total = (int) (total*percent);
            }
        }
        System.out.println("В "+month+" месяце накоплено "+total+" рублей");
        //Задание 5
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        int finalCharge = 100;
        int finalOverheats = 3;

        while (charge < finalCharge) {
            minute++;
            if (minute%10 == 0){
                charge += 2;
                overheats++;
                if (overheats == finalOverheats){
                    break;
                }
                minute += 2;
                continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило "+minute+" минут");
        System.out.println("Зарядка прекращена. Текущий заряд: "+charge+" %");
    }
}