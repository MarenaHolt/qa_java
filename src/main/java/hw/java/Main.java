package hw.java;

public class Main {
    public static void main(String[] args) {
        int a = sum(1, 2);
        int b = multiplication(3, 3);
        int c = division(12, 2);
        int d = subtraction(15, 5);

        if (a < b) {
            System.out.println("a < b");
        } else if (c < d) {
            System.out.println("c < d");
        } else {
            System.out.println("Hello");
        }

        switch (a) {
            case 3: {
                System.out.println("a = 3");
                break;
            }
            case 4: {
                System.out.println("a = 4");
                break;
            }
            default: {
                System.out.println("a");
                break;
            }
        }

        String result = a == 3 ? "three" : "not three";
        System.out.println(result);

        double e = subtraction(1.2, 8.6);
        double f = sum(3.5, 7);
        double g = multiplication(78.6, 4.4);
        double h = division(5.5, 1);

        System.out.println(e + f + g + h);

        byte result1 = (byte) (128 + 1);
        System.out.println(result1);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int multiplication(int a, int b){
        return a * b;
    }

    static int division(int a, int b){
        return a / b;
    }

    static int subtraction(int a, int b){
        return a - b;
    }

    static double sum(double a, int b){
        return a + b;
    }

    static double multiplication(double a, double b){
        return a * b;
    }

    static double division(double a, double b){
        return a / b;
    }

    static double subtraction(double a, double b){
        return a - b;
    }
}
