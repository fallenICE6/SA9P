package lab1;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n порядка чисел Фибоначчи:");
        int n;
        while (true) {

            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n > 0) {
                    System.out.printf("Число Фибоначчи: %d\n", fibon(n));
                    break;

                } else {
                    System.out.println("Введено некорректное число");
                }

            } else {
                System.out.println("Введено некорректное число");
                in.next();
            }

        }
        System.out.println("Формула a = (sin(x) + 4)/(cos(y^2))\n");
        System.out.println("Формула b = sqrt(a*2/4) - (4*x/y)\n");

        double x, y;
        double a, b;
        Scanner ix = new Scanner(System.in);
        System.out.println("Введите число x и y:");
        while (true) {
            if (ix.hasNextDouble()) {
                x = ix.nextDouble();
                y = ix.nextDouble();
                if(y != 0 && y <= 1 && y >=-1 && x <=1 && x >= -1){
                    System.out.printf("Введеные числа:\n x = %.2f%n\n y = %.2f%n\n", x, y);
                    a = (Math.sin(x) + 4)/(Math.cos(Math.pow(y, 2)));
                    b = Math.sqrt(a*2/4) - (4*x/y);
                    System.out.printf("Полученные числа:\n a = %.2f%n\n b = %.2f%n\n", a, b);
                    break;
                }
                else{
                    System.out.println("Введено некорректное число");
                }

            } else {
                System.out.println("Введено некорректное число");
                ix.next();
            }

        }
        System.out.println("Задание 3:\n");
        System.out.println("Введите сумму в $:");

        if (in.hasNextInt()) {
            n = in.nextInt();
            if (n > 0) {
                System.out.printf("Число Фибоначчи: %d\n", fibon(n));

            } else {
                System.out.println("Введено некорректное число");
            }

        } else {
            System.out.println("Введено некорректное число");
            in.next();
        }


    }

    public static int fibon(int n) {
        int number = 0;
        if (n <= 2) return 1;
        if (n > 2) {
            int fibon1 = 1;
            int fibon2 = 1;
            for (int i = 2; i < n; i++) {
                number = fibon1 + fibon2;
                fibon1 = fibon2;
                fibon2 = number;
            }
        }
        return number;
    }

}
