public class Main {
    public static void main(String[] args) {


        //Задача 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();


        //Задача 2

        int friday = 5;
        for (friday = 5; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
        }

        //Задача 3

        int startYear = 0;
        for (; startYear < 2122; startYear++) {
            if (startYear % 79 == 0 && startYear > 1822) {
                System.out.println(startYear);
            }
        }
    }
}










