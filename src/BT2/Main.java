package BT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi thứ nhất");
        String str1 = scanner.nextLine();

        System.out.println("Nhập chuỗi thứ hai");
        String str2 = scanner.nextLine();


        if (str1.equals(str2)) {
            System.out.println("Hai chuỗi giống nhau");
        } else {
        }
        System.out.println("Hai chuỗi khác nhau");
    }
}
