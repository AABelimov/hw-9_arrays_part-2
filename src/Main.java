public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        int[] salary = generateRandomArray();
        int sum = 0;

        System.out.println("Task1:");
        for(int a : salary) sum += a;
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sum);
    }

    public static void task2(){
        int[] salary = generateRandomArray();
        int min = salary[0];
        int max = salary[0];

        System.out.println("Task2:");
        for(int a : salary){
            if(a < min) min = a;
            if(a > max) max = a;
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей." +
                          " Максимальная сумма трат за день составила %d рублей.\n", min, max);
    }

    public static void task3(){
        int[] salary = generateRandomArray();
        double sum = 0;

        System.out.println("Task3:");
        for(int a : salary) sum += a;
        System.out.printf("Средняя сумма трат за месяц составила %f рублей\n", sum / salary.length);
    }

    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.println("Task4:");
        for(int i = reverseFullName.length - 1; i >= 0; i--) System.out.print(reverseFullName[i]);
    }
}