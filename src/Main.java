public class Main {
    public static void main(String[] args) {
//      task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
        task10();
    }

//    public static void task1 () {
//        System.out.println("Задача 1 (выведите в консоль все числа от 1 до 10)");
//        for (int i = 1; i < 11; i++) {
//        System.out.println(i);
//    }
//        System.out.println("_____________________________________");
//    }

//    public static void task2 () {
//        System.out.println("Задача 2 (выведите в консоль все числа от 10 до 1)");

//        for (int i = 10; i >0 ; i = i - 1){
//            System.out.println(i);
//        }

//        System.out.println("_____________________________________");
//    }

//    public static void task3 () {
//        System.out.println("Задача 3 (Выведите в консоль все четные числа от 0 до 17.)");
//
//        for (int i = 0; i < 18; i = i + 2){
//            System.out.println(i);
//        }

//        System.out.println("_____________________________________");
//    }

//    public static void task4 () {
//        System.out.println("Задача 4 (Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему)");
//
//        for ( int i = 10 ; i >= -10 ; i = i - 1){
//            System.out.println(i);
//        }

//        System.out.println("_____________________________________");
//    }


//    public static void task5 () {
//        System.out.println("Задача 5 (все високосные года, начиная с 1904 года до 2096)");
//        // Високосным является четвертый по счету год. В нашем случае это каждый четвертый год, начиная с 1904 года.

//        for ( int i = 1904 ; i <= 2096 ; i = i + 4){
//            System.out.println(i+" год является високосным");
//        }

//        System.out.println("_____________________________________");
//    }

//    public static void task6 () {
//        System.out.println("Задача 6 (последовательность чисел)");
//        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
//
//        for (int i = 7 ; i <= 98 ; i = i + 7){
//            System.out.print(i + "   ");
//        }

//        System.out.println();
//        System.out.println("_____________________________________");
//    }

//    public static void task7 () {
//        System.out.println("Задача 7 (последовательность чисел)");
//        // 1 2 4 8 16 32 64 128 256 512
//
//        for (int i = 1; i<=512 ; i = i * 2){
//            System.out.print(i + "   ");
//        }

//        System.out.println();
//        System.out.println("_____________________________________");
//    }

//    public static void task8 () {
//        System.out.println("Задача 8 (сумма годовых накоплений) ");
//        //  по 29 000 рублей   Месяц …, сумма накоплений равна … рублей
//
//        int accumulation = 0;
//        int contribution = 29_000;
//        for (int i = 1 ; i < 13 ; i++){
//            //System.out.print(i);
//            accumulation = accumulation +contribution;
//            System.out.println( "Месяц  "+i+", сумма накоплений равна "+accumulation+ "  рублей");
//        }

//        System.out.println("_____________________________________");
//    }

//    public static void task9 () {
//        System.out.println("Задача 9 (под проценты — 12% годовых) ");
//        // Месяц …, сумма накоплений равна … рублей
//
//        int accumulation = 0;
//        int contribution = 29_000;
//        for (int i = 1 ; i < 13 ; i++){
//        contribution = contribution + contribution/100;
//           System.out.println(contribution);
//            accumulation = accumulation +contribution;
//            System.out.println( "Месяц  "+i+", сумма накоплений равна "+accumulation+ "  рублей");
//        }
//
//
//        System.out.println("_____________________________________");
//    }

    public static void task10 () {
        System.out.println("Задача 10 (таблица умножения на 2)");
        // 2*1=2

        int a = 2, c;

        for (int i = 1; i <=10 ; i++){
           c = a * i;
            System.out.println(a+"*"+i+"="+c);
        }

        System.out.println("_____________________________________");
    }
}