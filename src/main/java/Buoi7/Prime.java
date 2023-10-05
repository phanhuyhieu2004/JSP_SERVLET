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

//    Nếu số number được truyền vào là 7, đoạn mã trên sẽ chạy như sau:
//
//        Biến i được khởi tạo với giá trị ban đầu là 2.
//        Kiểm tra điều kiện i < number. Vì 2 < 7, điều kiện đúng.
//        Kiểm tra điều kiện number % i == 0. Vì 7 không chia hết cho 2 (7 % 2 = 1), điều kiện không đúng.
//        Tăng giá trị của i lên 1, i trở thành 3.
//        Quay lại bước 2 để kiểm tra tiếp.
//        Kiểm tra điều kiện i < number. Vì 3 < 7, điều kiện đúng.
//        Kiểm tra điều kiện number % i == 0. Vì 7 không chia hết cho 3 (7 % 3 = 1), điều kiện không đúng.
//        Tăng giá trị của i lên 1, i trở thành 4.
//        Quay lại bước 2 để kiểm tra tiếp.
//        Kiểm tra điều kiện i < number. Vì 4 < 7, điều kiện đúng.
//        Kiểm tra điều kiện number % i == 0. Vì 7 không chia hết cho 4 (7 % 4 = 3), điều kiện không đúng.
//        Tăng giá trị của i lên 1, i trở thành 5.
//        Quay lại bước 2 để kiểm tra tiếp.
//        Kiểm tra điều kiện i < number. Vì 5 < 7, điều kiện đúng.
//        Kiểm tra điều kiện number % i == 0. Vì 7 không chia hết cho 5 (7 % 5 = 2), điều kiện không đúng.
//        Tăng giá trị của i lên 1, i trở thành 6.
//        Quay lại bước 2 để kiểm tra tiếp.
//        Kiểm tra điều kiện i < number. Vì 6 < 7, điều kiện đúng.
//        Kiểm tra điều kiện number % i == 0. Vì 7 không chia hết cho 6 (7 % 6 = 1), điều kiện không đúng.
//        Tăng giá trị của i lên 1, i trở thành 7.
//        Quay lại bước 2 để kiểm tra tiếp.
//        Kiểm tra điều kiện i < number. Vì 7 không nhỏ hơn 7, điều kiện không đúng.
//        Kết thúc vòng lặp for.
//        Vì không tìm thấy số i từ 2 đến 6 mà chia hết cho 7, nên số 7 được coi là số nguyên tố.
//        Phương thức trả về true.
