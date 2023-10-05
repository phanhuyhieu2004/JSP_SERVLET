package Buoi7;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        System.out.println("Nhap so vao day");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (checkPrime(number)) {
            System.out.println("Day la snt");
        } else {
            System.out.println("kp snt");
        }
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;

    }


}

