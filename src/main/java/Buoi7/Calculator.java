package Buoi7;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so thu nhat :");
        int a=scanner.nextInt();
        System.out.println("Nhap so thu hai :");
        int b=scanner.nextInt();
        System.out.println("Tong cua 2 so la :" + sum(a,b));
        System.out.println("Tru cua 2 so la :"+ sub(a,b));
        System.out.println("Thuong cua 2 so la :"+divide(a,b));
        System.out.println("Tich cua 2 so la :"+multiplication(a,b));

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
//    Không có ngoại lệ thuật toán như vậy
    public static int divide(int a,int b) throws NoSuchAlgorithmException {
        if (b == 0) {
            System.out.println("Lỗi không chia được,phép chia không hợp lệ");
        }
        return a/b;
    }
}
