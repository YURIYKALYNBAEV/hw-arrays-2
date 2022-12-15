public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() { // Объявить метод «сгенерироватьМассив»
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray(); // объявление массива и вызов метода «сгенерироватьМассив»

        System.out.println("Задача №1");

        int monthlyPaymentAmount = 0;

        for (int element : arr) {
            monthlyPaymentAmount += element;
        }

        System.out.println("Сумма трат за месяц составила " + monthlyPaymentAmount + " рублей");

        System.out.println();
    }

    public static void task2() {
        int[] arr = generateRandomArray(); // объявление массива и вызов метода «сгенерироватьМассив»

        System.out.println("Задача №2");

        int maxSumDay = arr[0];
        int minSumDay = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxSumDay < arr[i]) {
                maxSumDay = arr[i];
            }

            if (minSumDay > arr[i]) {
                minSumDay = arr[i];
            }
        }

        System.out.print("Минимальная сумма трат за день составила " + minSumDay + " рублей." +
                " Максимальная сумма трат за день составила " + maxSumDay + " рублей");
        System.out.println();

    }

    public static void task3() {
        int[] arr = generateRandomArray(); // объявление массива и вызов метода «сгенерироватьМассив»

        System.out.println("Задача №3");

        int monthlyPaymentAmount = 0;
        float averageAmountSpentPerMonth;

        for (int element : arr) {
            monthlyPaymentAmount += element;
        }

       averageAmountSpentPerMonth = (float) monthlyPaymentAmount / (float) arr.length;


        System.out.println("Средняя сумма трат в день за месяц составила " + averageAmountSpentPerMonth + " рублей");

        System.out.println();
    }

    public static void task4() {

        System.out.println("Задача №4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] reverseFullNameTwo = {'r', 'e', 't', 'e', 'P', ' ', 'v', 'o', 'r', 'o', 'd', 'i', 'S'};

        for (int length = reverseFullName.length - 1; length >= 0; length--) {
            System.out.print(reverseFullName[length]);
        }

        System.out.println();

        for (int length = reverseFullNameTwo.length - 1; length >= 0; length--) {
            System.out.print(reverseFullNameTwo[length]);
        }


    }

}