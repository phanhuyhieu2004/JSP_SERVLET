package Buoi7;

import java.util.Scanner;

public class PTbac2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap he so bac 2, a vao:");
        float a = scanner.nextFloat();
        System.out.println("Nhap he so bac 1, b vao :");
        float b = scanner.nextFloat();
        System.out.println("Nhap he so tu do ,c vao :");
        float c = scanner.nextFloat();
        giaiPT(a, b, c);
    }

    public static void giaiPT(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trinh có 1 nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float denta = b * b - 4 * a * c;
        float x1, x2;
        if (denta > 0) {
            x1 = (float) (-b + Math.sqrt(denta) / 2 * a);
            x2 = (float) (-b - Math.sqrt(denta) / 2 * a);
            System.out.println("Phuong trinh co 2 nghiem la :");
            System.out.println("Nghiem thu nhat la :" + x1);
            System.out.println("Nghiem thu hai la :" + x2);
        } else if (denta == 0) {
            x1 = (-b / 2 * a);
            System.out.println("Phuong trinh co nghiem kep la :");
            System.out.println("x1=x2=" + x1);

        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }




    }


